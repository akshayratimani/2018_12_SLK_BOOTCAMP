<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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
		<c:forEach items="${products}" var="p">
			<tr>
				<td>${p.id}</td>
				<td>${p.name} <span class="pull-right" style="font-size: 13pt">
						<a href="./delete-product?id=${p.id}" onclick="confirmAndDelete()"><i
							class="fa fa-trash"></i></a> <a href="./edit-product?id=${p.id}"><i
							class="fa fa-pencil"></i></a>
				</span>
				</td>
				<td>${p.category}</td>
				<td>${p.price}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>

<script>
	function confirmAndDelete() {
		if (!confirm("Are you sure to delete this?")) {
			event.preventDefault()
			return false;
		}
	}
</script>
<%@include file="./footer.jsp"%>




