<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">


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
<link href="<c:url value="/resources/css/jquery-ui.structure.min.css" />"
	rel="stylesheet" type="text/css" />





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
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown"> Admin <span class="caret"></span></a>
						<ul class="dropdown-menu" role="menu">
							<li><a href="#admin" data-toggle="modal">Login</a></li>
						</ul></li>

				</ul>

			</div>

		</div>

	</div>

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
										<div
											style="float: right; font-size: 80%; position: relative; top: -10px">
											<a href="#">Forgot password?</a>
										</div>
									</div>

									<div style="padding-top: 30px" class="panel-body">

										<div style="display: none" id="login-alert"
											class="alert alert-danger col-sm-12"></div>

										<form id="loginform" class="form-horizontal" role="form">

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
															onClick="$('#loginbox').hide(); $('#signupbox').show()">
															Sign Up Here </a>
													</div>
												</div>
											</div>
										</form>  
									</div>
								</div>
							</div>
							<!-- Sign Up box -->
							<div id="signupbox" style="display: none; margin-top: 50px"
								class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
								<div class="panel panel-info">
									<div class="panel-heading">
										<div class="panel-title">Sign Up</div>
										<div
											style="float: right; font-size: 85%; position: relative; top: -10px">
											<a id="signinlink" href="#"
												onclick="$('#signupbox').hide(); $('#loginbox').show()">Sign
												In</a>
										</div>
									</div>
									<div class="panel-body">
										<form id="signupform" class="form-horizontal" role="form">

											<div id="signupalert" style="display: none"
												class="alert alert-danger">
												<p>Error:</p>
												<span></span>
											</div>


											<div class="form-group">
												<label for="firstname" class="col-md-3 control-label">First
													Name</label>
												<div class="col-md-9">
													<input type="text" class="form-control" name="firstname"
														placeholder="First Name">
												</div>
											</div>
											<div class="form-group">
												<label for="lastname" class="col-md-3 control-label">Last
													Name</label>
												<div class="col-md-9">
													<input type="text" class="form-control" name="lastname"
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
													<input type="text" class="form-control" name="userName"
														placeholder="UserName">
												</div>
											</div>

											
											<div class="form-group">
												<label for="password" class="col-md-3 control-label">Password</label>
												<div class="col-md-9">
													<input type="password" class="form-control" name="passwd"
														placeholder="Password">
												</div>
											</div>
											
											<div class="form-group">
												<label for="repeatPasswd" class="col-md-3 control-label">Repeat Password</label>
												<div class="col-md-9">
													<input type="password" class="form-control" name="repeatPasswd"
														placeholder="Repeat Password">
												</div>
											</div>

											<div class="form-group">
												<!-- Button -->
												<div class="col-md-offset-3 col-md-10">
													<button id="btn-signup" type="button" class="btn btn-info">
														<i class="icon-hand-right"></i> &nbsp Sign Up
													</button>
													<span style="margin-left: 8px;"></span>
												</div>
											</div>
										</form>
									</div>
								</div> 
							</div>
						</div>  
					</div>
				</div>
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



</body>
</html>
