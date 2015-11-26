
 
$(document).ready(function() {
	function displayLogOut(){ 
		 
		if ($.cookie("user_info") !== undefined){
			
			$("#mainLogout").show();
		}
		else{
			$("#mainLogout").hide();
		}
		
	}
	displayLogOut();
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
				displayLogOut();
			}
			
			}).fail(function(jqXHR, textStatus,
				    errorThrown) { alert('invalid  user credentials');
				    $('#loginbox').show();
				    //CleanLoginForm(); });
				    e.preventDefault(); // prevent actual form submit and page reload
				    }); 
				    
});

	 $('#addUserForm').submit(function(e) { // will pass the form date using the jQuery serialize function
		 e.preventDefault();
			$.post('http://localhost:8080/parkingManagement/user/addUser', 
				    $(this).serialize()).done( 
				    		function(response,textStatus,jqXHR) { 	 
		    	 
			      $('#adduserbox').hide();	 
			if(response != 'undefined'){ 
			
				 alert('You have been added to the system,please login using the login page.');
				 $('#loginbox').show();
			}
			
			}).fail(function(jqXHR, textStatus,
				    errorThrown) { alert('invalid  user credentials');
				    alert('Error adding a user, please try again or contact Administrator'); 
				    $('#adduserbox').show();
				    //CleanLoginForm(); });
				    e.preventDefault(); // prevent actual form submit and page reload
				    }); 
				    
});
	 
 
	 
	 
	 
	 
$('#addUserForm').submit(function (e) {  
		 
		 // will pass the form date using the jQuery serialize function
		    $.post('http://localhost:8080/parkingManagement/user/addUser', $(this).serialize(), 
		    		function (response) {
		       
		    	//$('#personFormResponse').text(response);

		        if (response == true) {
		            alert('You have been successfully register'); 
		            $('#adduserbox').modal('hide');
		           // CleanRegisterForm();
		           // $('#login').modal('show');
		        } else { 
		            alert('You were not registered :(. Please, Try Again');
		            $('#adduserbox').modal('show');
		         //   CleanRegisterForm();
		        }
		        //CleanRegisterForm();
		    });
		      
		    e.preventDefault(); // prevent actual form submit and page reload
		}); 




	 
});
 

//Document Ready Ends









	
	