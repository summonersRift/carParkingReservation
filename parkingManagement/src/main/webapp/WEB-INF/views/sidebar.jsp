

<div id="sidebar" class="col-xs-6 col-sm-3 sidebar-offcanvas">
<div class="list-group" id="sidebarList">
	<ul class="sidebar-nav">  
		<li class="sidebar-brand">
			<a href="#Billing" id ="billing"> Billing Info </a>
		</li>
		<li class="sidebar-brand">
			<a href="#Incidents" id="incidents"> Incidents </a>
		</li>
		<li class="sidebar-brand">
			<a href="#Marketing" id="marketing"> Marketing </a>
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

function hideAll(){
	
	$('#Billing-PageDiv').hide();
	$('#Incidents-PageDiv').hide();        
	$('#Marketing-PageDiv').hide(); 
    $('#AccountMgt-PageDiv').hide(); 
    $('#Reservation-PageDiv').hide();
	$('#Facility-PageDiv').hide();
	
}

$(document).ready(function() { 
	
$("#marketing").click(function() {
	//alert('clicked on report worked');
	$.ajax({
       type: "GET",
       url: "marketing/MarketingPage",
       success: function(response) {
           $("#Marketing-PageDiv").html( response );
       }
   });
	hideAll();
	$('#Marketing-PageDiv').show();
	
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
	
	hideAll();
	$('#Billing-PageDiv').show();
	 
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
		
	hideAll();
	$('#Incidents-PageDiv').show();
}); 
 
//parkingManagement/AccountMgt
$("#accountMgt").click(function() {
	// alert('clicked on account mgt worked'); 
	$.ajax({
       type: "GET",
       url: "user/AccountMgtPage",
       success: function(response) {
           $("#AccountMgt-PageDiv").html( response );  
           $('#networkMgtTable').DataTable( {
               "paging":   false,
               "ordering": false,
               "info":     false
           } );
       }
   });

	hideAll();
	$('#AccountMgt-PageDiv').show();
	
});

 
$("#facility").click(function() {
	//alert('clicked on report worked');
	$.ajax({
       type: "GET",
       url: "facility/FacilityPage",
       success: function(response) {
           $("#Facility-PageDiv").html( response );
           
           $('#facilitiesTable').DataTable( {
               "paging":   false,
               "ordering": false,
               "info":     false
           } );
           
       }
   });
	
	hideAll();
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
	
	hideAll();
	$('#Reservation-PageDiv').show();
	
	
});



} );



</script>








