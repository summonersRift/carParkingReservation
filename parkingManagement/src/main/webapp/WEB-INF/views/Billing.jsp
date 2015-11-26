<div class="container" id="paymentForm">
	<div class="row">
		<div class="col-xs-12 col-md-4">

			<!-- CREDIT CARD STARTS HERE -->
			<div class="panel panel-default credit-card-box">
				<div class="panel-heading display-table">
					<div class="row display-tr">
						<h2 class="panel-title display-td">Payment Details</h2>
						<h3 class="panel-title display-td">
							Balance Remaining: <input style="width: 120px;" id="balance_card"
								type="text" readonly></input>
						</h3>
						<div class="display-td">
							<img class="img-responsive pull-right"
								src="http://i76.imgup.net/accepted_c22e0.png">
						</div>
					</div>
				</div>

				<div class="panel-body">
					<form role="form" id="payment-form">
						<div class="row">
							<div class="col-xs-12">
								<div class="form-group">
									<label for="cardNumber">AMOUNT TO PAY</label>
									<div class="input-group">
										<input type="" class="form-control" name="funds" id="funds"
											placeholder="Enter Amount" autocomplete="cc-number" required
											autofocus /> <span class="input-group-addon"><i
											class="glyphicon glyphicon-usd"></i></span>
									</div>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-xs-12">
								<div class="form-group">
									<label for="cardNumber">CARD NUMBER</label>
									<div class="input-group">
										<input type="tel" class="form-control" name="ccNumber"
											placeholder="Valid Card Number" autocomplete="cc-number"
											required autofocus /> <span class="input-group-addon"><i
											class="glyphicon glyphicon-credit-card"></i></span>
									</div>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-xs-7 col-md-7">
								<div class="form-group">
									<label for="cardExpiry"><span class="hidden-xs">EXPIRATION</span><span
										class="visible-xs-inline">EXP</span> DATE</label> <input type="tel"
										class="form-control" name="expDate" placeholder="MM / YY"
										autocomplete="cc-exp" required />
								</div>
							</div>
							<div class="col-xs-5 col-md-5 pull-right">
								<div class="form-group">
									<label for="cardCVC">CV CODE</label> <input type="tel"
										class="form-control" name="securityCode" placeholder="CVC"
										autocomplete="cc-csc" required />
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-xs-12">
								<div class="form-group">
									<label for="address">ADDRESS</label>
									<div class="input-group">
										<input type="tel" class="form-control" name="billingAddress"
											placeholder="Street Address" autocomplete="cc-number"
											required autofocus /> <span class="input-group-addon"><i
											class="fa fa-credit-card"></i></span>
									</div>
								</div>
							</div>
						</div>
						<div class="row">

							<div class="col-xs-4 col-md-4 ">
								<div class="form-group">
									<label for="city">CITY</label> <input type="tel"
										class="form-control" name="city" placeholder="Miami"
										autocomplete="cc-csc" required />
								</div>
							</div>
							<div class="col-xs-4 col-md-4 pull-right">
								<div class="form-group">
									<label for="state"><span class="hidden-xs">STATE</span><span
										class="visible-xs-inline">State</span> </label> <input type="tel"
										class="form-control" name="state" placeholder="FL"
										autocomplete="cc-exp" required />
								</div>
							</div>

							<div class="col-xs-4 col-md-4 pull-right">
								<div class="form-group">
									<label for="zipCode">ZIP CODE</label> <input type="tel"
										class="form-control" name="zipCode" placeholder="32456"
										autocomplete="cc-csc" required />
								</div>
							</div>
						</div>

						<div class="form-group">
							<div class="col-md-12 control">
								<div
									style="border-top: 1px #888; padding-top: 15px; font-size: 90%; color: black; margin-left: 10%;">
									Want to Pay with you Bank Instead? <a style="color: blue;"
										href="#"
										onClick="$('#paymentForm').hide(); $('#bankPaymentForm').show()">
										Click Here </a>
								</div>
							</div>
						</div>
						<input type="hidden" name="userId" id="userId"> <input
							type="hidden" name="paymentType" id="credit_card"
							value="credit_card">
						<div class="row">
							<div class="col-xs-12">
								<button class="btn btn-success btn-lg btn-block" type="submit">Pay
									Now</button>
							</div>
						</div>
						<div class="row" style="display: none;">
							<div class="col-xs-12">
								<p class="payment-errors"></p>
							</div>
						</div>
					</form>
				</div>
			</div>
			<!-- ENDS CREDIT CARD HERE -->
		</div>
	</div>
</div>


<!-- BANK FORM STARTS HERE -->
<div class="container" id="bankPaymentForm" style="display: none;">
	<div class="row">
		<div class="col-xs-12 col-md-4">
			<div class="panel panel-default bank-box">
				<div class="panel-heading display-table">
					<div class="row display-tr">
						<h2 class="panel-title display-td">Payment Details</h2>
						<h3 class="panel-title display-td">
							Total Balance remaining: <input style="width: 120px;"
								id="balance_bank" type="text" readonly></input>
						</h3>
						</h3>
					</div>
				</div>
				<div class="panel-body">
					<form role="form" id="Bankpayment-form">
						<div class="row">
							<div class="col-xs-12">
								<div class="form-group">
									<label for="amountpay">AMOUNT TO PAY</label>
									<div class="input-group">
										<input type="" class="form-control" name="funds"
											id="fundsBank" placeholder="Enter Amount"
											autocomplete="amount to pay" required autofocus /> <span
											class="input-group-addon"><i
											class="glyphicon glyphicon-usd"></i></span>
									</div>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-xs-12">
								<div class="form-group">
									<label for="routingNumber">ROUTING NUMBER</label>
									<div class="input-group">
										<input type="tel" class="form-control" name="routingNumber"
											placeholder="Valid Routing Number" autocomplete="cc-number"
											required autofocus /> <span class="input-group-addon"><i
											class=""></i></span>
									</div>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-xs-12">
								<div class="form-group">
									<label for="checkSavNumber">CHECKING/SAVING ACCOUNT
										NUMBER</label>
									<div class="input-group">
										<input type="tel" class="form-control" name="checkNumber"
											placeholder="Valid Checking/Saving Account Number"
											autocomplete="cc-number" required autofocus /> <span
											class="input-group-addon"><i class=""></i></span>
									</div>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-xs-7 col-md-7">
								<div class="form-group">
									<label for="checkNumber"><span class="hidden-xs">CHECK
											NUMBER</span><span class="visible-xs-inline">EXP</span> DATE</label> <input
										type="tel" class="form-control" name="expDate"
										placeholder="1078" autocomplete="cc-exp" required />
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-xs-12">
								<div class="form-group">
									<label for="address">ADDRESS</label>
									<div class="input-group">
										<input type="tel" class="form-control" name="billingAddress"
											placeholder="Street Address" autocomplete="cc-number"
											required autofocus /> <span class="input-group-addon"><i
											class="fa fa-credit-card"></i></span>
									</div>
								</div>
							</div>
						</div>
						<div class="row">

							<div class="col-xs-4 col-md-4 ">
								<div class="form-group">
									<label for="city">CITY</label> <input type="tel"
										class="form-control" name="city" placeholder="Miami"
										autocomplete="cc-csc" required />
								</div>
							</div>
							<div class="col-xs-4 col-md-4 pull-right">
								<div class="form-group">
									<label for="state"><span class="hidden-xs">STATE</span><span
										class="visible-xs-inline">State</span> </label> <input type="tel"
										class="form-control" name="state" placeholder="FL"
										autocomplete="cc-exp" required />
								</div>
							</div>

							<div class="col-xs-4 col-md-4 pull-right">
								<div class="form-group">
									<label for="zipCode">ZIP CODE</label> <input type="tel"
										class="form-control" name="zipCode" placeholder="32456"
										autocomplete="cc-csc" required />
								</div>
							</div>
						</div>

						<div class="form-group">
							<div class="col-md-12 control">
								<div
									style="border-top: 1px #888; padding-top: 15px; font-size: 90%; color: black; margin-left: 6%;">
									Want to Pay with Credit Card Instead? <a style="color: blue;"
										href="#"
										onClick="$('#bankPaymentForm').hide(); $('#paymentForm').show()">
										Click Here </a>
								</div>
							</div>
						</div>
						<input type="hidden" name="userId" id="userIdBank"> <input
							type="hidden" name="paymentType" id="check" value="check">
						<div class="row">
							<div class="col-xs-12">
								<button class="btn btn-success btn-lg btn-block" type="submit"
									id="makepayment">Pay Now</button>
							</div>
						</div>
						<div class="row" style="display: none;">
							<div class="col-xs-12">
								<p class="payment-errors"></p>
							</div>
						</div>
					</form>
				</div>
			</div>
			<!-- CREDIT CARD FORM ENDS HERE -->
		</div>
	</div>
</div>

<!-- ENDS BANK FORM -->



<script type="text/javascript">
	$(document).ready(
			function() { 
				
				var user = $.cookie('user_info');
				var prUser = JSON.parse(user);

				$.get(
						"http://localhost:8080/parkingManagement/user/getbalance/"
								+ prUser.user_id, function(data) {

							$('#balance_card').val(data);
							$('#balance_bank').val(data);

						});

			});

	/* Fancy restrictive input formatting via jQuery.payment library*/
	$('input[name=ccNumber]').payment('formatCardNumber');
	$('input[name=securityCode]').payment('formatCardCVC');
	$('input[name=expDate').payment('formatCardExpiry');
	//$('input[name=funds').payment('restrictNumeric');
	$('input[name=checkNumber').payment('restrictNumeric');
	$('input[name=routingNumber').payment('restrictNumeric');

	$(function() {
		$('#funds').maskMoney();
		$('#fundsBank').maskMoney();
	});

	$('#payment-form')
			.submit(
					function(e) { // will pass the form using the jQuery serialize function
						e.preventDefault();
						var user = $.cookie('user_info');
						var data = JSON.parse(user);

						if (user == null) {
							alert('invalid user in session null value');
							window
									.location("http://localhost:8080/parkingManagement/");

						}

						$('#userId').val(data.user_id);//set hidden field user value;

						$
								.post(
										'http://localhost:8080/parkingManagement/billing/pay',
										$(this).serialize())
								.done(function(response, textStatus, jqXHR) {
									//	var msg = jQuery.parseJSON(response);
									// alert(response);
									// alert(response.message);

									$('#paymentForm').hide();
									BootstrapDialog.alert(response.message);

								})
								.fail(
										function(jqXHR, textStatus, errorThrown) {
											//alert('Please, Try Again');
											BootstrapDialog
													.alert('Error processing the payment, please try later');

										})

					});

	$('#Bankpayment-form')
			.submit(
					function(e) { // will pass the form using the jQuery serialize function
						e.preventDefault();

						var user = $.cookie('user_info');
						var data = JSON.parse(user);

						if (user == null) {
							alert('invalid user in session null value');

							window
									.location("http://localhost:8080/parkingManagement/");

						}

						$('#userIdBank').val(data.user_id);//set hidden field user value; 
						$
								.post(
										'http://localhost:8080/parkingManagement/billing/pay',
										$(this).serialize())
								.done(function(response, textStatus, jqXHR) {

									$('#bankPaymentForm').hide();
									BootstrapDialog.alert(response.message);

								})
								.fail(
										function(jqXHR, textStatus, errorThrown) {
											BootstrapDialog
													.alert('Error processing the payment, please try later');

										})

					});
</script>