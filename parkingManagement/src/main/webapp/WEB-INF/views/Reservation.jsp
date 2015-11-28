<style>

#tbodyAdminTable{
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

<h1>Reservation Page</h1>

<div class="container">
	<div class="row">
		<div class='col-sm-3'>
			<div class="form-group">
				<div class='input-group date'>
					<input id="datetimepicker-1" type='text' placeholder="From:"
						class="form-control datetimepicker" /> <label
						for="datetimepicker-1" class="input-group-addon btn"> <span
						class="glyphicon glyphicon-calendar"></span>
					</label>
				</div>
			</div>
		</div>

		<div class='col-sm-3'>
			<div class="form-group">
				<div class='input-group date'>
					<input id="datetimepicker-2" type='text' placeholder="To:"
						class="form-control datetimepicker" /> <label
						for="datetimepicker-2" class="input-group-addon btn"> <span
						class="glyphicon glyphicon-calendar"></span>
					</label>
				</div>
			</div>
		</div>


		<select class="form-control col-sm-1" id="dropdownMenu1"
			style="width: 150px; margin-right: 7px;"></select>


		<button class="btn btn-success" id="search_btn"
			aria-label="Left Align">
			<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
			Search
		</button>
	</div>

	<br> <br>


	<div style="display: none;" id="container-table-reservation"
		class="table-responsive">
		<table data-toggle="table" id="table-admin" data-show-refresh="true"
			data-search="true" >
			<thead>
				<tr>
					

				</tr>
			</thead>
			<tbody id="tbodyAdminTable">

			</tbody>
		</table>
	</div>
</div>

<script type="text/javascript">
	function LoadInfo() { 
		$
				.getJSON(
						"${pageContext.request.contextPath}/reservation/getallfacilities",
						null, function(data) {
							var dropdown = $("#dropdownMenu1");
							//dropdown.empty(); 
							$.each(data, function() {
								dropdown.append($("<option/>").val(this.id)
										.text(this.name));

							});

						});
	}
	$(document).ready(function() {
		
		$(window).bind('beforeunload',function(){

		     //save info somewhere

		    alert( 'are you sure you want to leave?');

		});
		function operateAdding(value, row, index) {
            return [
				'<a class="add" href="javascript:void(0)" title="Add">',
				    '<i class="glyphicon glyphicon-plus"></i>',
				'</a>'
				].join('');
        };
		
		
		
		window.operateAddingEvent = {

                'click .add': function (e, value, row, index) {

                    var addR = JSON.stringify(row);
                    //alert('First from stringify row' + addR);

                    var parsingR = $.parseJSON(addR);
                    //alert('second from parsing row' + parsingR);

                    var addingR = String(parsingR.parkingId);
                    //alert('third, getting value from key' + addingR);
                    addSpotForUser(addingR);



                }
            };
		
        function addSpotForUser(ride_id) {
            var user = $.cookie("user_info");

            var uName = $.parseJSON(user);
            var userN = String(uName.user_id);
            //alert(userN);
            var userId = String(uName.user_id);
            var startdt=$("#datetimepicker-1").val();
            var enddt=$("#datetimepicker-2").val();

            //var rid=$("#rides-name").val(); 
            var postData={  parkingId : ride_id, userId: userId,startDate: startdt,endDate: enddt};
             //var rideId=$("#rides-name").val();
             //alert(userId);alert(ride_id);
            	$.ajax({
	            type: "POST",
	            url: "reservation/add",
	            data: postData,
	            success: function(response, textStatus, jqXHR) {
	            	{ 
	            		if (response == false) {

	                        alert('Sorry, you are unable to reserve the spot !!!!');
	                        return;

	                    }
	                    alert('You  successfuly reserved an spot');
	                    

						var endDate = $("#datetimepicker-2")
								.val();
						var startDate = $(
								"#datetimepicker-1").val();
						var facilityId = $("#dropdownMenu1")
								.find('option:selected')
								.attr('value');
						if (endDate == ''
								|| startDate == '') {
							alert("date values cannot be empty!!!");
							return;
						}

						search(facilityId, startDate,
								endDate);

	                    //$('#rides').modal('hide');
	                    //populateAccountTable();
	           //refreshAcctTable('${pageContext.request.contextPath}/ride/user/rides/' + getUserId());
	                    //$('#account').modal('show');

	                }
	            },
	            error: (function (jqXHR, textStatus, errorThrown) {
	                alert('unable to reserved spot !!!!');
	            })
	            
	        });


            
        }; 
						$('#table-admin').bootstrapTable({
							cache : false,
							bordered : true,
							pagination : true,
							pageList : [ 5, 10, 25, 50, 100, 200 ],
							search : true,
							showRefresh: false,
							sortOrder : 'asc',
							//sortName: 'waitingTime',
							clickToSelect : true,
							columns : [ 
							  {							        	   
							       field: 'parkingId',
					               title: '#',
					               class: 'admin',
					               visible: true,
					               align: 'center',
					               valign: 'middle'
					         },							           							            
							 {
								field : 'parkNumber',
								title : 'Parking spot #',
								class : 'admin',
								align : 'center',
								valign : 'middle'

							}, {
								field : 'floor',
								title : 'Parking Floor',
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

							}, {
								field : 'add',
								title : 'Operate',
								align : 'center',
								valign : 'middle',
								class : 'admin',
								switchable : false,
								clickToSelect : false,
								formatter : operateAdding,
							    events: operateAddingEvent

							},

							]
						});
						LoadInfo();//load dropdown

						$("#search_btn")
								.on(
										"click",
										function() {

											//alert("search clicked");

											var endDate = $("#datetimepicker-2")
													.val();
											var startDate = $("#datetimepicker-1").val();
											var facilityId = $("#dropdownMenu1")
													.find('option:selected')
													.attr('value');
											if (endDate == ''
													|| startDate == '') {
												alert("date values cannot be empty!!!");
												return;
											}

											search(facilityId, startDate,
													endDate);
										});

						$("#datetimepicker-2").datepicker({
							dateFormat : "yy-mm-dd",
							minDate: 0,
					        maxDate: "+60D",
					        
					        onSelect: function(selected) {
						          $("#datetimepicker-1").datepicker("option","maxDate", selected)
						        }
						});
						
						$("#datetimepicker-1").datepicker({
							dateFormat : "yy-mm-dd",
							minDate: 0,
					        maxDate: "+30D",
					        
					        onSelect: function(selected) {
					          $("#datetimepicker-2").datepicker("option","minDate", selected)
					        }
						});

											
						

						function search(id, startDate, endDate) {
							$("#container-table-reservation").show();
							$.getJSON(
									'${pageContext.request.contextPath}/reservation/findspot/facility/'
											+ id + '/' + startDate + '/'
											+ endDate, null, function(data) {
										$('#table-admin').bootstrapTable(
												"load", data);
									});
						}
						
						
						
						
						
					});
</script>
