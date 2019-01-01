<%@include file="./header.jsp"%>

<h3>Product details</h3>

<form action="./add-new-product" method="POST" class="form">

	<div class="form-group">
		<label for="id">Enter id: </label>
		<input type="number" name="id" id="id" class="form-control">
	</div>

	<div class="form-group">
		<label for="name">Enter name of the product: </label>
		<input type="text" name="name" id="name" class="form-control">
	</div>

	<div class="form-group">
		<label for="category">Enter category: </label>
		<input type="text" name="category" id="category" class="form-control">
	</div>

	<div class="form-group">
		<label for="price">Enter price in rupees: </label>
		<input type="number" name="price" id="price" class="form-control">
	</div>
	
	<button class="btn btn-primary">Save details</button>

</form>

<%@include file="./footer.jsp"%>