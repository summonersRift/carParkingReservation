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
<table id="reservationTable" class="table table-striped table-bordered"
	cellspacing="0" width="100%">
	<thead>
		<tr>
			<th>Space #</th>
			<th>Floor</th>
			<th>Location</th>
			<th>Date</th>
			<th>Action</th>

		</tr>
	</thead>

	<tbody>
		<tr>
			<td>564</td>
			<td>3rd</td>
			<td>Miami</td>
			<td>10/26/2015</td>
			<td>

				<button type="button" class="btn btn-success"
					aria-label="Center Align">
					<span class="glyphicon glyphicon-ok" aria-hidden="true"></span>
				</button>

			</td>
		</tr>

		<tr>
			<td>564</td>
			<td>3rd</td>
			<td>Miami</td>
			<td>10/28/2015</td>
			<td>

				<button type="button" class="btn btn-success"
					aria-label="Center Align">
					<span class="glyphicon glyphicon-ok" aria-hidden="true"></span>
				</button>

			</td>
		</tr>

		<tr>
			<td>862</td>
			<td>8th</td>
			<td>Miami</td>
			<td>10/29/2015</td>
			<td>

				<button type="button" class="btn btn-success"
					aria-label="Center Align">
					<span class="glyphicon glyphicon-ok" aria-hidden="true"></span>
				</button>

			</td>
		</tr>

		<tr>
			<td>126</td>
			<td>1st</td>
			<td>Miami</td>
			<td>10/26/2015</td>
			<td>

				<button type="button" class="btn btn-success"
					aria-label="Center Align">
					<span class="glyphicon glyphicon-ok" aria-hidden="true"></span>
				</button>

			</td>
		</tr>

		<tr>
			<td>276</td>
			<td>2nd</td>
			<td>Miami</td>
			<td>10/30/2015</td>
			<td>

				<button type="button" class="btn btn-success"
					aria-label="Center Align">
					<span class="glyphicon glyphicon-ok" aria-hidden="true"></span>
				</button>

			</td>
		</tr>

	</tbody>
</table>


<script type="text/javascript">

$(".datetimepicker").datepicker();

$(".datetimepicker").on("change", function () {
    var id = $(this).attr("id");
});

</script>
