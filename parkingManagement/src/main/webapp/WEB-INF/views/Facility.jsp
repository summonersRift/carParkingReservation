<style>

#tbodyFacilityTable{
   background-color: white;
}

.fixed-table-body {
    height: initial;
}
.fixed-table-container {
       height: initial;
    padding-bottom: initial;
}
 
</style>

<h1>Facility Page</h1>
<!-- Table starts Here -->

<div class="table-responsive">
	<table data-toggle="table" id="table-facility" data-show-refresh="false"
		data-search="true" >
		<thead>
			<tr>

				
			</tr>
		</thead>
		<tbody id="tbodyFacilityTable">

		</tbody>
	</table>
</div>




<!-- Table Ends here -->



<!-- Modal starts Here -->

<br>
<br>
<button type="button" class="btn btn-success" aria-label="Left Align"
	data-target="#facilityModal" data-toggle="modal">
	<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
</button>


<!-- Add Facility Modal -->
<div class="modal fade" id="facilityModal" tabindex="-1" role="dialog"
	aria-labelledby="facilityModalLabel" data-backdrop="static" data-keyboard="false">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<h4 class="modal-title" id="myModalLabel">Add Parking
					Management Facility</h4>
			</div>
			<div class="modal-body">

				<div class="panel-body">
					<form id="facilityform" class="form-horizontal" role="form">

						<div class="form-group">
							<label for="name" class="col-md-3 control-label">Name</label>
							<div class="col-md-9">
								<input type="text" class="form-control" name="name"
									placeholder="Name">
							</div>
						</div>
						<div class="form-group">
							<label for="street" class="col-md-3 control-label">Street</label>
							<div class="col-md-9">
								<input type="text" class="form-control" name="addressLine1"
									placeholder="Street">
							</div>
						</div>
						<div class="form-group">
							<label for="city" class="col-md-3 control-label">City</label>
							<div class="col-md-9">
								<input type="text" class="form-control" name="city"
									placeholder="City">
							</div>
						</div>
						<div class="form-group">
							<label for="state" class="col-md-3 control-label">State</label>
							<div class="col-md-9">
								<input type="text" class="form-control" name="state"
									placeholder="FL">
							</div>
						</div>

						<div class="form-group">
							<label for="zipCode" class="col-md-3 control-label">ZipCode</label>
							<div class="col-md-9">
								<input type="text" class="form-control" name="zipCode"
									placeholder="zipCode">
							</div>
						</div>
						
						<div class="form-group">
							<label for="spots" class="col-md-3 control-label">Spots</label>
							<div class="col-md-9">
								<input type="text" class="form-control" name="numberOfSpots"
									placeholder="zipCode">
							</div>
						</div>	
						
						<button class="btn btn-primary" type="submit" id="addFacility">Add Facility</button>					

					</form>
				</div>


			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				
			</div>
		</div>
	</div>
</div>


<!-- Edit Facility Modal -->
<div class="modal fade" id="editfacilityModal" tabindex="-1"
	role="dialog" aria-labelledby="editfacilityModalLabel" data-backdrop="static" data-keyboard="false">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<h4 class="modal-title" id="myModalLabel">Edit Parking
					Management Facility</h4>
			</div>
			<div class="modal-body">

				<div class="panel-body">
					<form id="facilityform" class="form-horizontal" role="form">

						<div class="form-group">
							<label for="name" class="col-md-3 control-label">Name</label>
							<div class="col-md-9">
								<input type="text" class="form-control" name="name"
									placeholder="Miami Parking">
							</div>
						</div>
						<div class="form-group">
							<label for="street" class="col-md-3 control-label">Street</label>
							<div class="col-md-9">
								<input type="text" class="form-control" name="street"
									placeholder="8th Street">
							</div>
						</div>
						<div class="form-group">
							<label for="city" class="col-md-3 control-label">City</label>
							<div class="col-md-9">
								<input type="text" class="form-control" name="city"
									placeholder="City">
							</div>
						</div>

						<div class="form-group">
							<label for="state" class="col-md-3 control-label">State</label>
							<div class="col-md-9">
								<input type="text" class="form-control" name="state"
									placeholder="FL">
							</div>
						</div>

						<div class="form-group">
							<label for="zipCode" class="col-md-3 control-label">ZipCode</label>
							<div class="col-md-9">
								<input type="text" class="form-control" name="zipCode"
									placeholder="34528">
							</div>
						</div>


						<div class="form-group">
							<label for="spots" class="col-md-3 control-label">Spots</label>
							<div class="col-md-9">
								<input type="text" class="form-control" name="spots"
									placeholder="128">
							</div>
						</div>

					</form>
				</div>


			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				<button type="button" class="btn btn-primary">Save Changes</button>
			</div>
		</div>
	</div>
</div>


<!-- Scripts -->
<script type="text/javascript">

function operateFacility(value, row, index) {
    return [

'<a class="edit" href="javascript:void(0)" title="Edit">',
'<i class="glyphicon glyphicon-edit"></i>',
'</a>'

].join('');

};

$('#table-facility').bootstrapTable({
    method: 'get',
    url: '${pageContext.request.contextPath}/facility/all',
    cache: false,  
    pagination: true,
    pageList: [5, 10, 25, 50, 100, 200],
    search: false,
    minimumCountColumns: 2,
    sortOrder: 'asc',
    //sortName: 'waitingTime',
    clickToSelect: true,
    columns: [{
            field: 'addressLine1',
            title: 'Adress',
            class: 'admin',
            visible: false,
            switchable: false,
            align: 'right',
            valign: 'bottom'

}, {
            field: 'city',
            title: 'City',
            class: 'admin',
            align: 'center',
            valign: 'middle'

}, {
            field: 'state',
            title: 'State',
            class: 'admin',
            align: 'left',
            valign: 'top',
            sortable: true

}, {
            field: 'name',
            title: 'Name',
            class: 'admin',
            align: 'left',
            valign: 'top',
            sortable: true

},{
    field: 'zipCode',
    title: 'Zip-Code',
    align: 'center',
    valign: 'middle',
    class: 'admin',
    switchable: false,
    clickToSelect: false

},{
    field: 'numberOfSpots',
    title: 'Num Of Spots',
    align: 'center',
    valign: 'middle',
    class: 'admin',
    switchable: false,
    clickToSelect: false

}
,
{
    field: 'add',
    title: 'Operate',
    align: 'center',
    valign: 'middle',
    class: 'admin',
    switchable: false,
    clickToSelect: false,
    formatter: operateFacility,
    //events: operateAdminEditEvent

},
       
        ]
});



$('#facilityform').submit(
		function(e) { // will pass the form using the jQuery serialize function
			e.preventDefault();
			

			$.post(
							'http://localhost:8080/parkingManagement/facility/add',
							$(this).serialize())
					.done(function(response, textStatus, jqXHR) {
						
						 alert("Facility Was Successfully Added");
						// alert(response.message);

						$('#editfacilityModal').hide();
						//BootstrapDialog.alert(response.message);

					})
					.fail(
							function(jqXHR, textStatus, errorThrown) {
								//alert('Please, Try Again');
								BootstrapDialog
										.alert('Error adding facility. Please, try again');

							})

		});

</script>