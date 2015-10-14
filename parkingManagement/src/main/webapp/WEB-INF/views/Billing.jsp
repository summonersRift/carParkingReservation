<div class="container" id="paymentForm">
	<div class="row">
		<div class="col-xs-12 col-md-4">

			<!-- CREDIT CARD STARTS HERE -->
			<div class="panel panel-default credit-card-box">
				<div class="panel-heading display-table">
					<div class="row display-tr">
						<h2 class="panel-title display-td">Payment Details</h2>
						<h3 class="panel-title display-td">Total Amount To Pay: $2.50</h3>
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
									<label for="cardNumber">CARD NUMBER</label>
									<div class="input-group">
										<input type="tel" class="form-control" name="cardNumber"
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
										class="form-control" name="cardExpiry" placeholder="MM / YY"
										autocomplete="cc-exp" required />
								</div>
							</div>
							<div class="col-xs-5 col-md-5 pull-right">
								<div class="form-group">
									<label for="cardCVC">CV CODE</label> <input type="tel"
										class="form-control" name="cardCVC" placeholder="CVC"
										autocomplete="cc-csc" required />
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-xs-12">
								<div class="form-group">
									<label for="address">ADDRESS</label>
									<div class="input-group">
										<input type="tel" class="form-control" name="address"
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
						<h3 class="panel-title display-td">Total Amount To Pay: $2.50</h3>
					</div>
				</div>
				<div class="panel-body">
					<form role="form" id="Bankpayment-form">
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
										<input type="tel" class="form-control" name="checkSavNumber"
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
										type="tel" class="form-control" name="cardExpiry"
										placeholder="1078" autocomplete="cc-exp" required />
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-xs-12">
								<div class="form-group">
									<label for="address">ADDRESS</label>
									<div class="input-group">
										<input type="tel" class="form-control" name="address"
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
										class="form-control" name="" zipCode" placeholder="32456"
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
			<!-- CREDIT CARD FORM ENDS HERE -->
		</div>
	</div>
</div>

<!-- ENDS BANK FORM -->





<script type="text/javascript">


	/* Fancy restrictive input formatting via jQuery.payment library*/
	$('input[name=cardNumber]').payment('formatCardNumber');
	$('input[name=cardCVC]').payment('formatCardCVC');
	$('input[name=cardExpiry').payment('formatCardExpiry');

	/* Form validation using Stripe client-side validation helpers */
	/*  jQuery.validator.addMethod("cardNumber", function(value, element) {
		return this.optional(element) || Stripe.card.validateCardNumber(value);
	}, "Please specify a valid credit card number.");

	jQuery.validator.addMethod("cardExpiry", function(value, element) {
		// Parsing month/year uses jQuery.payment library 
		value = $.payment.cardExpiryVal(value);
		return this.optional(element)
				|| Stripe.card.validateExpiry(value.month, value.year);
	}, "Invalid expiration date.");

	jQuery.validator.addMethod("cardCVC", function(value, element) {
		return this.optional(element) || Stripe.card.validateCVC(value);
	}, "Invalid CVC.");

	validator = $form.validate({
		rules : {
			cardNumber : {
				required : true,
				cardNumber : true
			},
			cardExpiry : {
				required : true,
				cardExpiry : true
			},
			cardCVC : {
				required : true,
				cardCVC : true
			},

		},
		highlight : function(element) {
			$(element).closest('.form-control').removeClass('success')
					.addClass('error');
		},
		unhighlight : function(element) {
			$(element).closest('.form-control').removeClass('error').addClass(
					'success');
		},
		errorPlacement : function(error, element) {
			$(element).closest('.form-group').append(error);
		}
	});

	paymentFormReady = function() {
		if ($form.find('[name=cardNumber]').hasClass("success")
				&& $form.find('[name=cardExpiry]').hasClass("success")
				&& $form.find('[name=cardCVC]').val().length > 1) {
			return true;
		} else {
			return false;
		}
	}  
	*/
	
</script>