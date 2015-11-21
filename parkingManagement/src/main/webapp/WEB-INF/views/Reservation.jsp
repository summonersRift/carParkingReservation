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


		<div class="dropdown col-sm-1">
			<button class="btn btn-default dropdown-toggle" type="button"
				id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true"
				aria-expanded="true">
				Miami <span class="caret"></span>
			</button> 
		</div> 
		<button type="button" class="btn btn-success" aria-label="Left Align">
			<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
			Search
		</button>

	</div>

</div>


<br>
<br>


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






<script type="text/javascript">

$(".datetimepicker").datepicker();

$(".datetimepicker").on("change", function () {
    var id = $(this).attr("id");
});


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

var id = 12;
var start = "10/10/2015";
var end = "10/10/2015";

$('#table-admin').bootstrapTable({
    method: 'get',
    url: '${pageContext.request.contextPath}/reservation/findspot/facility/' + id + '/' + start + '/' + end,
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
