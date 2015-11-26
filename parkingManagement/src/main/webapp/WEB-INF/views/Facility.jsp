<h1>Facility Page</h1>
<!-- Table starts Here -->

<div class="table-responsive">
	<table data-toggle="table" id="table-admin" data-show-refresh="true"
		data-search="true" data-height="299">
		<thead>
			<tr>
				<th>Address</th>
				<th>City</th>
				<th>State</th>
				<th>Name</th>
				<th>Phone Number</th>
				<th>Zip-Code</th>
				
				
			</tr>
		</thead>
		<tbody id="tbodyAdminTable">

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
								<input type="text" class="form-control" name="street"
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
									placeholder="ZipCode">
							</div>
						</div>


						<div class="form-group">
							<label for="spots" class="col-md-3 control-label">Spots</label>
							<div class="col-md-9">
								<input type="text" class="form-control" name="spots"
									placeholder="Spots">
							</div>
						</div>

					</form>
				</div>


			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				<button type="button" class="btn btn-primary">Add Facility</button>
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

function operateAdmin(value, row, index) {
    return [

'<a class="edit" href="javascript:void(0)" title="Edit">',
'<i class="glyphicon glyphicon-edit"></i>',
'</a>',

'<a class="disable" href="javascript:void(0)" title="Disable">',
'<i class="glyphicon glyphicon-ban-circle"></i>',
'</a>',
'<a class="enable" href="javascript:void(0)" title="Enable">',
'<i class="glyphicon glyphicon-ok-circle"></i>',
'</a>'
].join('');

};

$('#table-admin').bootstrapTable({
    method: 'get',
    url: '${pageContext.request.contextPath}/facility/all',
    cache: false,
    height: 400,
    striped: true,
    pagination: true,
    pageSize: 10,
    pageList: [10, 25, 50, 100, 200],
    search: true,
    showToggle: true,
    showColumns: true,
    showRefresh: true,
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

}, {
            field: 'phoneNumber',
            title: 'Phone Number',
            align: 'center',
            valign: 'middle',
            class: 'admin',
            switchable: false,
            clickToSelect: false

},{
    field: 'zipCode',
    title: 'Zip-Code',
    align: 'center',
    valign: 'middle',
    class: 'admin',
    switchable: false,
    clickToSelect: false

},{
    field: 'add',
    title: 'Operate',
    align: 'center',
    valign: 'middle',
    class: 'admin',
    switchable: false,
    clickToSelect: false,
    formatter: operateAdmin,
    //events: operateAdminEditEvent

},
       
        ]
});

</script>