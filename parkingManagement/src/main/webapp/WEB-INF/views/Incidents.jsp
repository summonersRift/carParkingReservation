<style>

#tbodyIncidentsTable{
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

<h1>Incidents/Report Summary</h1>


<!-- Incidents Table -->
<div class="table-responsive">
		<table data-toggle="table" id="table-incidents" data-show-refresh="false"
			data-search="true" >
			<thead>
				<tr>
					

				</tr>
			</thead>
			<tbody id="tbodyIncidentsTable">

			</tbody>
		</table>
</div>

<!-- Ends Incidents Table -->




    
    <br>
    <br>
    
    <button type="button" class="btn btn-success" aria-label="Left Align"
	data-target="#IncidentModal" data-toggle="modal">
	<span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Add Incident
   </button>
    
	<!-- Add Facility Modal -->
<div class="modal fade" id="IncidentModal" tabindex="-1" role="dialog"
	aria-labelledby="facilityModalLabel" data-backdrop="static" data-keyboard="false">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<h4 class="modal-title" id="myModalLabel">Add Parking Management Incident</h4>
			</div>
			<div class="modal-body">

				<div class="panel-body">
					<form id="incidentsform" class="form-horizontal" role="form">

						<div class="form-group">
							<label for="description" class="col-md-3 control-label">Description</label>
							<div class="col-md-9">
								<input type="text" class="form-control" name="description"
									placeholder="Description">
							</div>
						</div>
						<div class="form-group">
							<label for="location" class="col-md-3 control-label">Location</label>
							<div class="col-md-9">
								<input type="text" class="form-control" name="location"
									placeholder="Location">
							</div>
						</div>
						
						<input type="hidden" name="UserId" id="UserId" type="hidden" />
							
		
						<br>
						<hr>
						
						<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
						<button class="btn btn-primary" type="submit" id="addIncident">Add Incident</button>					

					</form>
				</div>
			</div>			
		</div>
	</div>
</div>
	
	
	
	<script>
	$('#table-incidents').bootstrapTable({
		method: 'get',
	    url: '${pageContext.request.contextPath}/incidents/getAll',
	    cache: false,  
	    pagination: true,
	    pageList: [5, 10, 25, 50, 100, 200],
	    search: false,
	    minimumCountColumns: 2,
	    sortOrder: 'asc',
	    //sortName: 'waitingTime',
	    clickToSelect: true,
		columns : [ 
		  					           							            
		 {
			field : 'date',
			title : 'Date',
			class : 'admin',
			align : 'center',
			valign : 'middle'

		}, {
			field : 'description',
			title : 'Description',
			class : 'admin',
			align : 'left',
			valign : 'top',
			sortable : true

		}, {
			field : 'location',
			title : 'Parking location',
			class : 'admin',
			align : 'left',
			valign : 'top',
			sortable : true

		}, 

		]
	});
	
	
	
	$('#incidentsform').submit(
			function(e) { // will pass the form using the jQuery serialize function
				e.preventDefault();
				var user = $.cookie('user_info');
				var data = JSON.parse(user);

				if (user == null) {
					alert('invalid user in session null value');
					window
							.location("http://localhost:8080/parkingManagement/");

				}

				$('#UserId').val(data.user_id);//set hidden field user value;
			 
				$.post('http://localhost:8080/parkingManagement/incidents/add',
								$(this).serialize())
						.done(function(response, textStatus, jqXHR) {
							
							 alert("Incident Report Was Successfully Added");
							// alert(response.message);

							$('#IncidentModal').modal('hide');
							
							$.getJSON(
									'${pageContext.request.contextPath}/incidents/getAll', function(data) {
										$('#table-incidents').bootstrapTable(
												"load", data);
									});
							
							//BootstrapDialog.alert(response.message);

						})
						.fail(
								function(jqXHR, textStatus, errorThrown) {
									//alert('Please, Try Again');
									BootstrapDialog
											.alert('Error adding report. Please, try again');

								})

			});
	
	
	</script>