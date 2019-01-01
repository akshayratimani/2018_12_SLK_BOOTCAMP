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
			<td><%=p.getName()%></td>
			<td><%=p.getCategory()%></td>
			<td><%=p.getPrice()%></td>
		</tr>
		<%
			}
		%>
	</tbody>
</table>

<%@include file="./footer.jsp"%>




