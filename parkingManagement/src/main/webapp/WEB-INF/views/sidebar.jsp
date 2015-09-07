<div id="sidebar" class="col-xs-6 col-sm-3 sidebar-offcanvas">
<div class="list-group" id="sidebarList">
	<ul class="sidebar-nav">
		<li class="sidebar-brand">
			<a href="#Report"  id="report" >Report Page</a>
		</li>
		<li class="sidebar-brand">
			<a href="#Billing" id ="billing"> Billing Info </a>
		</li>
		<li class="sidebar-brand">
			<a href="#Incidents" id="incidents"> Incidents </a>
		</li>
		<li class="sidebar-brand">
			<a href="#Reviews" id="reviews"> Reviews </a>
		</li>
		<li class="sidebar-brand">
			<a href="#History" id="history"> History </a>
		</li>
		<li class="sidebar-brand">
			<a href="#"> Link Here </a>
		</li>
		<li class="sidebar-brand">
			<a href="#"> Link Here </a>
		</li>
		<li class="sidebar-brand">
			<a href="#"> Link Here </a>
		</li>
			
	</ul>
</div>
</div>

<script type="text/javascript">

$(document).ready(function() {
	
	$.ajax({
	       type: "GET",
	       url: "report/ReportPage",
	       success: function(response) {
	           $("#Report-PageDiv").html( response );
	           $("#bankPaymentForm").hide();
	           
	       }
	   });
});
	
$("#report").click(function() {
	//alert('clicked on report worked');
	$.ajax({
       type: "GET",
       url: "report/ReportPage",
       success: function(response) {
           $("#Report-PageDiv").html( response );
       }
   });
	
	$('#Billing-PageDiv').hide();
	$('#Incidents-PageDiv').hide();
	$('#Reviews-PageDiv').hide();
	$('#History-PageDiv').hide();
	$('#Report-PageDiv').show();
	
});

$("#billing").click(function() {
	//alert('clicked on report worked');
	
	$.ajax({
       type: "GET",
       url: "billing/BillingPage",
       success: function(response) {
           $("#Billing-PageDiv").html( response );
       }
   });
	
	$('#Incidents-PageDiv').hide();
	$('#Reviews-PageDiv').hide();
	$('#History-PageDiv').hide();
	$('#Report-PageDiv').hide();
	$('#Billing-PageDiv').show();
	//$('#paymentbox').show();
});

$("#incidents").click(function() {
	//alert('clicked on report worked');
	
	$.ajax({
       type: "GET",
       url: "incidents/IncidentsPage",
       success: function(response) {
           $("#Incidents-PageDiv").html( response );
       }
   });
		
	$('#Reviews-PageDiv').hide();
	$('#History-PageDiv').hide();
	$('#Report-PageDiv').hide();
	$('#Billing-PageDiv').hide();
	$('#Incidents-PageDiv').show();
});

$("#reviews").click(function() {
	//alert('clicked on report worked');
	
	$.ajax({
       type: "GET",
       url: "reviews/ReviewsPage",
       success: function(response) {
           $("#Reviews-PageDiv").html( response );
       }
   });
			
	$('#History-PageDiv').hide();
	$('#Report-PageDiv').hide();
	$('#Billing-PageDiv').hide();
	$('#Incidents-PageDiv').hide();
	$('#Reviews-PageDiv').show();
});

$("#history").click(function() {
	//alert('clicked on report worked');
	
	$.ajax({
       type: "GET",
       url: "history/HistoryPage",
       success: function(response) {
           $("#History-PageDiv").html( response );
       }
   });

	$('#Report-PageDiv').hide();
	$('#Billing-PageDiv').hide();
	$('#Incidents-PageDiv').hide();
	$('#Reviews-PageDiv').hide();	
	$('#History-PageDiv').show();
});


	
	
//});
//Document Ready Ends

</script>








