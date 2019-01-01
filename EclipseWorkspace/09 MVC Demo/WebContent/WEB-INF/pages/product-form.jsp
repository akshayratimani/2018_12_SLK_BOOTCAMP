<%@page import="com.slk.training.entity.Product"%>
<%@include file="./header.jsp"%>

<%
	Product p = (Product)request.getAttribute("product");
	boolean isEdit = true;
	if(p==null) {
		p = new Product();
		isEdit = false;
	}
%>

<div class="row">
	<div class="col-sm-6">
		<h3>Product details</h3>

		<form method="POST" class="form" onsubmit="return validate()">

			<div class="form-group">
				<label for="id">Enter id: </label> 
					<input type="number" name="id" <%= isEdit ? "disabled": "" %>
					id="id" class="form-control" value="<%=p.getId()==0 ? "" : p.getId() %>">
			</div>

			<div class="form-group">
				<label for="name">Enter name of the product: </label> <input
					type="text" name="name" id="name" class="form-control" value="<%=p.getName() %>">
			</div>

			<div class="form-group">
				<label for="category">Enter category: </label> <input type="text"
					name="category" id="category" class="form-control" value="<%=p.getCategory() %>">
			</div>

			<div class="form-group">
				<label for="price">Enter price in rupees: </label> <input
					type="number" name="price" id="price" class="form-control" value="<%=p.getPrice()==0.0 ? "" : p.getPrice() %>">
			</div>

			<button class="btn btn-primary">Save details</button>

		</form>
	</div>

	<div class="col-sm-6">
		<div id="errors"></div>
	</div>
</div>





<%@include file="./footer.jsp"%>