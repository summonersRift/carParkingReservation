

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
			<a href="#NetworkMgt" id="network">Network </a>
		</li>
		<li class="sidebar-brand">
			<a href="#ParkingLot" id="parkingLot"> Emergency </a>
		</li>
		<li class="sidebar-brand">
			<a href="#Facility" id="facility"> Facility </a>
		</li>
		<li class="sidebar-brand">
			<a href="#Reservation" id="reservation"> Reservation </a>
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
	$('#Network-PageDiv').hide();
	$('#ParkingLot-PageDiv').hide();
	$('#Reservation-PageDiv').hide();
	$('#Facility-PageDiv').hide();
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
	$('#ParkingLot-PageDiv').hide();
	$('#Facility-PageDiv').hide();
	$('#Reservation-PageDiv').hide();
	$('#Billing-PageDiv').show();
	$('#Network-PageDiv').hide();
	//$('#paymentbox').show();
});

$("#incidents").click(function() {
	//alert('clicked on report worked');
	
	$.ajax({
       type: "GET",
       url: "incidents/IncidentsPage",
       success: function(response) {
           $("#Incidents-PageDiv").html( response );
           
           $('#incidentTable').DataTable( {
               "paging":   false,
               "ordering": false,
               "info":     false,
              
           } );
       }
   });
		
	$('#Reviews-PageDiv').hide();
	$('#History-PageDiv').hide();
	$('#Report-PageDiv').hide();
	$('#Billing-PageDiv').hide();
	$('#Network-PageDiv').hide();
	$('#ParkingLot-PageDiv').hide();
	$('#Facility-PageDiv').hide();
	$('#Reservation-PageDiv').hide();
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
	$('#Network-PageDiv').hide();
	$('#ParkingLot-PageDiv').hide();
	$('#Facility-PageDiv').hide();
	$('#Reservation-PageDiv').hide();
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
	$('#Network-PageDiv').hide();
	$('#ParkingLot-PageDiv').hide();
	$('#Facility-PageDiv').hide();
	$('#Reservation-PageDiv').hide();
	$('#History-PageDiv').show();
});

$("#network").click(function() {
	//alert('clicked on network worked'); 
	$.ajax({
       type: "GET",
       url: "networkmanagement/NetworkPage",
       success: function(response) {
           $("#Network-PageDiv").html( response );
           

           $('#networkMgtTable').DataTable( {
               "paging":   false,
               "ordering": false,
               "info":     false
           } );
       }
   });

	$('#Report-PageDiv').hide();
	$('#Billing-PageDiv').hide();
	$('#Incidents-PageDiv').hide();
	$('#Reviews-PageDiv').hide();	
	$('#History-PageDiv').hide();
	$('#ParkingLot-PageDiv').hide();
	$('#Facility-PageDiv').hide();
	$('#Reservation-PageDiv').hide();
	$('#Network-PageDiv').show();
	
});

$("#parkingLot").click(function() {
	//alert('clicked on report worked');
	$.ajax({
       type: "GET",
       url: "report/ReportPage",
       success: function(response) {
           $("#ParkingLot-PageDiv").html( response );
       }
   });
	
	$('#Billing-PageDiv').hide();
	$('#Incidents-PageDiv').hide();
	$('#Reviews-PageDiv').hide();
	$('#History-PageDiv').hide();
	$('#Network-PageDiv').hide();
	$('#Report-PageDiv').hide();
	$('#Facility-PageDiv').hide();
	$('#Reservation-PageDiv').hide();
	$('#ParkingLot-PageDiv').show();
	
});

$("#facility").click(function() {
	//alert('clicked on report worked');
	$.ajax({
       type: "GET",
       url: "admin/FacilityPage",
       success: function(response) {
           $("#Facility-PageDiv").html( response );
           
           $('#facilitiesTable').DataTable( {
               "paging":   false,
               "ordering": false,
               "info":     false
           } );
           
       }
   });
	
	$('#Billing-PageDiv').hide();
	$('#Incidents-PageDiv').hide();
	$('#Reviews-PageDiv').hide();
	$('#History-PageDiv').hide();
	$('#Network-PageDiv').hide();
	$('#Report-PageDiv').hide();
	$('#ParkingLot-PageDiv').hide();
	$('#Reservation-PageDiv').hide();
	$('#Facility-PageDiv').show();
	
});

$("#reservation").click(function() {
	//alert('clicked on reservation worked');
	$.ajax({
       type: "GET",
       url: "reservation/ReservationPage",
       success: function(response) {
           $("#Reservation-PageDiv").html( response );
           
           $('#reservationTable').DataTable( {
               "paging":   false,
               "ordering": false,
               "info":     false
           } );
           
       }
   });
	
	
		//$('#datetimepicker1').datetimepicker();
	
	
	$('#Billing-PageDiv').hide();
	$('#Incidents-PageDiv').hide();
	$('#Reviews-PageDiv').hide();
	$('#History-PageDiv').hide();
	$('#Network-PageDiv').hide();
	$('#Report-PageDiv').hide();
	$('#ParkingLot-PageDiv').hide();
	$('#Facility-PageDiv').hide();
	$('#Reservation-PageDiv').show();
	
	
});



} );

</script>








