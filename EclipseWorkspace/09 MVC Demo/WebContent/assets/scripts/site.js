function validate() {
	
	// get the values from the textboxes
	var id = $("#id").val();
	var name = $("#name").val();
	var price = $("#price").val();
	
	var messages = [];
	
	if(!id || id<1) {
		messages.push("Id is mandatory and must be >= 1");
	}
	
	if(!name || name.length<4 || name.length>50) {
		messages.push("Name is mandatory and must be between 3 to 50 letters");
	}
	
	if(!price || price<0) {
		messages.push("Price is mandatory and must be >= Rs.0");
	}
	
	if(messages.length>0) {
		// display the errors
		var errors = $("<ul>").addClass("alert alert-danger");
		$("#errors").html(errors);
		messages.forEach(function(msg) {
			errors.append("<li>"+msg+"</li>");
		});
		return false;
	}
	
	
	return true;
}




