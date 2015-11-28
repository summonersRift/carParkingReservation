<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<style>

#mainLogout{
display:none;
}
</style>

<!--References-->
<link href="<c:url value="/resources/css/bootstrap.min.css" /> "
	rel="stylesheet" type="text/css" />
<link href="<c:url value="/resources/css/bootstrap-theme.min.css" /> "
	rel="stylesheet" type="text/css" />
<link href="<c:url value="/resources/css/bootstrap-table.css" /> "
	rel="stylesheet" type="text/css" />
<link href="<c:url value="/resources/css/bootstrap-switch.css" /> "
	rel="stylesheet" type="text/css" />
<link href="<c:url value="/resources/css/styles.css" />"
	rel="stylesheet" type="text/css" />
<link href="<c:url value="/resources/css/jquery.dataTables.css" />"
	rel="stylesheet" type="text/css" />
<link href="<c:url value="/resources/css/jquery-ui.min.css" />"
	rel="stylesheet" type="text/css" />
<link href="<c:url value="/resources/css/jquery-ui.theme.min.css" />"
	rel="stylesheet" type="text/css" />
<link
	href="<c:url value="/resources/css/jquery-ui.structure.min.css" />"
	rel="stylesheet" type="text/css" />
<link href="<c:url value="/resources/css/bootstrap-dialog.min.css" />"
	rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">





<title>Parking Management System</title>
</head>
<body>

	<div class="navbar navbar-inverse navbar-static-top">
		<div class="container-fluid">

			<a href="#" class="navbar-brand"> Welcome to the Parking
				Management System! </a>

			<button class="navbar-toggle" data-toggle="collapse"
				data-target=".navHeaderCollapse">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>

			<div class="collapse navbar-collapse
			navHeaderCollapse">

				<ul class="nav navbar-nav
				navbar-right">

					<li class="active"><a href="#"> Home </a></li>
					
					 <li id="mainLogout"><a data-target="#logoutConfirmModal" data-toggle="modal" id=""><span class="glyphicon glyphicon-off"></span> Logout </a>
                     </li>
                     

				</ul>

			</div>

		</div>

	</div>
	
	
	
	<!-- Logout Modal -->
	
<div class="modal fade" id="logoutConfirmModal" tabindex="-1" role="dialog"
	aria-labelledby="facilityModalLabel" data-backdrop="static" data-keyboard="false">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<h3 class="modal-title" id="myModalLabel">Logout</h3>
			</div>
			<div class="modal-body">

				<div class="panel-body">
					<div id="logoutform" class="form-horizontal" role="form">
						<p>Are you sure you want to Log Out?</p>
						
					</div>
				</div>


			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				<button type="button" class="btn btn-primary" id="logoutModal">Log Out</button>
			</div>
		</div>
	</div>
</div>
	
	<!-- Logout Modal Ends -->
	
	

	<!-- SideBar -->

	<div id="subViewDiv"></div>



	<div id="Billing-PageDiv"></div>



	<div id="Incidents-PageDiv"></div>



	<div id="Marketing-PageDiv"></div>



	<div id="Reservation-PageDiv"></div>


	<div id="Facility-PageDiv"></div>



	<div id="AccountMgt-PageDiv"></div>


	<!--Ends SideBar -->


	<div class="container-fluid">
		<div class="row">
			<div class="col-lg-12">
				<div class="panel-default">
					<div class="panel-body">

						<!-- SignIN Box -->
						<div class="container">
							<div id="loginbox" style="margin-top: 50px;"
								class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
								<div class="panel panel-info">
									<div class="panel-heading">
										<div class="panel-title">Sign In</div>
										 
									</div>

									<div style="padding-top: 30px" class="panel-body">

										<div style="display: none" id="login-alert"
											class="alert alert-danger col-sm-12"></div>

										<form id="loginform" class="form-horizontal" role="form" method="post">

											<div style="margin-bottom: 25px" class="input-group">
												<span class="input-group-addon"><i
													class="glyphicon glyphicon-user"></i></span> <input
													id="login-username" type="text" class="form-control"
													name="userName" value="" placeholder="username">
											</div>

											<div style="margin-bottom: 25px" class="input-group">
												<span class="input-group-addon"><i
													class="glyphicon glyphicon-lock"></i></span> <input
													id="login-password" type="password" class="form-control"
													name="password" placeholder="password">
											</div>

											<div style="margin-top: 10px" class="form-group">
												<!-- Button -->

												<div class="col-md-2">
													<button type="submit" value="Send"
														class="btn btn-info pull-left " id="submit">Login</button>
												</div>
											</div>
											<div class="form-group">
												<div class="col-md-12 control">
													<div
														style="border-top: 1px solid #888; padding-top: 15px; font-size: 85%">
														Don't have an account! <a href="#"
															onClick="$('#loginbox').hide(); $('#adduserbox').show()">
															Sign Up Here </a>
													</div>
												</div>
											</div>
										</form>
									</div>
								</div>
							</div> 
							
									<div class="container">
								<div id="adduserbox" style="display: none; margin-top: 50px"
								class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
								<div class="panel panel-info">
									<div class="panel-heading">
										<div class="panel-title">Sign In</div>
										 
									</div>

									<div style="padding-top: 30px" class="panel-body">

										<div style="display: none" id="login-alert"
											class="alert alert-danger col-sm-12"></div>

										<form id="addUserForm" class="form-horizontal" role="form" method="post">  
											
											<div class="form-group">
												<label for="firstname" class="col-md-3 control-label">First
													Name</label>
												<div class="col-md-9">
													<input type="text" class="form-control" name="firstName"
														placeholder="First Name">
												</div>
											</div>
											<div class="form-group">
												<label for="lastname" class="col-md-3 control-label">Last
													Name</label>
												<div class="col-md-9">
													<input type="text" class="form-control" name="lastName"
														placeholder="Last Name">
												</div>
											</div>
											<div class="form-group">
												<label for="email" class="col-md-3 control-label">Email</label>
												<div class="col-md-9">
													<input type="text" class="form-control" name="email"
														placeholder="Email Address">
												</div>
											</div>
											<div class="form-group">
												<label for="userName" class="col-md-3 control-label">UserName</label>
												<div class="col-md-9">
													<input type="text" class="form-control" name=userName
														placeholder="UserName">
												</div>
											</div>
											<div class="form-group">
												<label for="password" class="col-md-3 control-label">Password</label>
												<div class="col-md-9">
													<input type="password" class="form-control" name="password"
														placeholder="Password">
												</div>
											</div>
											<div class="form-group">
												<label for="repeatPasswd" class="col-md-3 control-label">Repeat
													Password</label>
												<div class="col-md-9">
													<input type="password" id='repassword' class="form-control"
														name="repeatPasswd" placeholder="Repeat Password">
												</div>
											</div> 
											<div class="form-group">
												<label for="repeatPasswd" class="col-md-3 control-label">Identification
													 </label>
												<div class="col-md-9">
													<input type="userIdentification" id='userIdentification' class="form-control"
														name="userIdentification" placeholder="Identificaition">
												</div>
											</div>
											<div class="form-group">
												<label for="repeatPasswd" class="col-md-3 control-label">Security Question
													 </label>
												<div class="col-md-9">
													<input type="secQuestionOne" id='secQuestionOne' class="form-control"
														name="secQuestionOne" placeholder="Security Question">
												</div>
											</div>
											<div class="form-group">
												<label for="repeatPasswd" class="col-md-3 control-label">Security Answer
													 </label>
												<div class="col-md-9">
													<input type="secAnswersOne" id='secAnswersOne' class="form-control"
														name="secAnswersOne" placeholder="Security Anwser">
												</div>
											</div>
											
											 
											<div style="margin-top: 10px" class="form-group">
												<!-- Button -->

												<div class="form-group">
												<!-- Button -->
												<div class="col-md-offset-3 col-md-10">
													<button id="btn-signup" type='submit' class="btn btn-info">
														<i class="icon-hand-right"></i> &nbsp Sign Up
													</button>
													<span style="margin-left: 8px;"></span>
												</div>
											</div> 
										</form>
									</div>
								</div>
							</div>	  

	<script type="text/javascript"
		src="<c:url value="/resources/js/jquery.min.js" />"></script>
	<script type="text/javascript"
		src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
	<script type="text/javascript"
		src="<c:url value="/resources/js/bootstrap-table.js" />"></script>
	<script type="text/javascript" 
	    src="<c:url value="/resources/js/bootbox.min.js" />"></script>
	<script type="text/javascript"
		src="<c:url value="/resources/js/bootstrapValidator.js" />"></script>
	<script type="text/javascript"
		src="<c:url value="/resources/js/bootstrap-switch.js" />"></script>
	<script type="text/javascript"
		src="<c:url value="/resources/js/jquery.cookie.js" />"></script>
	<script type="text/javascript"
		src="<c:url value="/resources/js/parkingManagement.js" />"></script>
	<script type="text/javascript"
		src="<c:url value="/resources/js/jquery.validate.min.js" />"></script>
	<script type="text/javascript"
		src="<c:url value="/resources/js/jquery.payment.js" />"></script>
	<script type="text/javascript"
		src="<c:url value="/resources/js/jquery.dataTables.min.js" />"></script>
	<script type="text/javascript"
		src="<c:url value="/resources/js/jquery-ui.min.js" />"></script>
	<script type="text/javascript"
		src="<c:url value="/resources/js/bootstrap-dialog.min.js" />"></script>
	<script type="text/javascript"
		src="<c:url value="/resources/js/jquery.maskMoney.min.js" />"></script>
		


	<script type="text/javascript">
	$(document).ready(function() {  
		
	
		displayLogOut();  
	
		$("#logoutModal").on("click", function(){
		
		var user = $.cookie("user_info");
        var uName = $.parseJSON(user);
        var userN = String(uName.user_name);
		
		$.post('${pageContext.request.contextPath}/user/signout', {
            userName: userN
        }).done(
            function (response, textStatus, jqXHR) {
                //alert('You were successfuly logged out');

                $('#logout').modal('hide');
                $.removeCookie("user_info");
                location.reload();
               $("#mainLogout").hide();


            }).fail(function (jqXHR, textStatus, errorThrown) {
            alert('unable to logout !!!!');
        });
		
	});
	
	
	function displayLogOut(){
		 
		if ($.cookie("user_info") !== undefined){
			
			$("#mainLogout").show();
		}
		else{
			$("#mainLogout").hide();
		}
		
	}
	



	});

</script>

</body>
</html>
