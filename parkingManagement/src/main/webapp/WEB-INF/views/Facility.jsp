<h1>Facility Page</h1>

<table id="facilitiesTable" class="table table-striped table-bordered"
	cellspacing="0" width="100%">
	<thead>
		<tr>
			<th>Name</th>
			<th>Street</th>
			<th>City</th>
			<th>State</th>
			<th>Zip-Code</th>
			<th>Spots</th>
			<th>Action</th>

		</tr>
	</thead>

	<tbody>
		<tr>
			<td>Miami Parking</td>
			<td>8th Street</td>
			<td>Miami</td>
			<td>FL</td>
			<td>34526</td>
			<td>128</td>
			<td>

				<button type="button" class="btn btn-success"
					aria-label="Center Align">
					<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
				</button>

			</td>
		</tr>

		<tr>
			<td>Miami Parking</td>
			<td>8th Street</td>
			<td>Miami</td>
			<td>FL</td>
			<td>34526</td>
			<td>128</td>
			<td>

				<button type="button" class="btn btn-success"
					aria-label="Left Align">
					<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
				</button>

			</td>
		</tr>

		<tr>
			<td>Miami Parking</td>
			<td>8th Street</td>
			<td>Miami</td>
			<td>FL</td>
			<td>34526</td>
			<td>128</td>
			<td>

				<button type="button" class="btn btn-success"
					aria-label="Left Align" >
					<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
				</button>

			</td>
		</tr>

		<tr>
			<td>Miami Parking</td>
			<td>8th Street</td>
			<td>Miami</td>
			<td>FL</td>
			<td>34526</td>
			<td>128</td>
			<td>

				<button type="button" class="btn btn-success"
					aria-label="Left Align">
					<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
				</button>

			</td>
		</tr>

		<tr>
			<td>Miami Parking</td>
			<td>8th Street</td>
			<td>Miami</td>
			<td>FL</td>
			<td>34526</td>
			<td>128</td>
			<td>

				<button type="button" class="btn btn-success" data-target="#editfacilityModal" data-toggle="modal"
					aria-label="Left Align">
					<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
				</button>

			</td>
		</tr>

	</tbody>
</table>

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