<%@page import="com.slk.training.entity.Product"%>
<%@page import="java.util.List"%>
<%@include file="./header.jsp"%>

	<h3>List of products</h3>


<table class="table table-striped table-bordered table-hover">
	<thead>
		<tr>
			<th>Product id</th>
			<th>Name</th>
			<th>Category</th>
			<th>Price (INR)</th>
		</tr>
	</thead>
	<tbody>
		<%
			List<Product> products = (List<Product>) request.getAttribute("products");
			for (Product p : products) {
		%>
		<tr>
			<td><%=p.getId()%></td>
			<td>
				<%=p.getName()%>
				<span class="pull-right" style="font-size: 13pt">
					<a href="./delete-product?id=<%=p.getId() %>" onclick="confirmAndDelete()"><i class="fa fa-trash"></i></a>
					<a href="./edit-product?id=<%=p.getId() %>"><i class="fa fa-pencil"></i></a>
				</span>
			</td>
			<td><%=p.getCategory()%></td>
			<td><%=p.getPrice()%></td>
		</tr>
		<%
			}
		%>
	</tbody>
</table>

<script>
function confirmAndDelete() {
	if(!confirm("Are you sure to delete this?")) {
		event.preventDefault()
		return false;
	}
}
</script>
<%@include file="./footer.jsp"%>




