
 
$(document).ready(function() {
	
	 $('#loginform').submit(function(e) { // will pass the form date using the jQuery serialize function
		 e.preventDefault();
			$.post('http://localhost:8080/parkingManagement/user/signin', 
				    $(this).serialize()).done(
					function(response,textStatus,jqXHR) { 	    
			
		    	//alert('clicked on login worked');
				
			$('#loginbox').hide();	
			$.ajax({
	            type: "GET",
	            url: "user/sidebar",
	            success: function(response) {
	                $("#subViewDiv").html( response );
	            }
	        });
		  
			if(response != 'undefined'){
				 
			   // $.cookie("user_info", reponse, {path: "/", domain: "parkingManagement/"});
			  
				$.cookie("user_info", response);
				//$.cookie("user_info", JSON.stringify(response));
			
			}
			
			}).fail(function(jqXHR, textStatus,
				    errorThrown) { alert('invalid  user credentials');
				    $('#loginbox').show();
				    //CleanLoginForm(); });
				    e.preventDefault(); // prevent actual form submit and page reload
				    }); 
				    
})

	
});


//Document Ready Ends









	
	