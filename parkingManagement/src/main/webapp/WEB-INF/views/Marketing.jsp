<h1>Marketing Landing Page</h1>

<table id="networkMgtTable" class="table table-striped table-bordered" cellspacing="0" width="100%">
        <thead >
            <tr>
                <th>Sl.</th>
                <th>Timestamp</th>
                <th>Notifications</th>
                <th>Action</th>
            </tr>
        </thead>
   
        <tbody>
            <tr>
                <td>01</td>
                <td>10.10.15 10:10:10</td>
                <td>Message sent to xyz@gmail.com</td>
                <td>
                
                <button type="button" class="btn btn-success" aria-label="Left Align">
  					<span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
				</button>
				
				<button type="button" class="btn btn-success" aria-label="Left Align">
  					<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
				</button>

				</td>
            </tr>
            

                                  
        </tbody>  
    </table>
	
	
<br><br>	
	
	
	<button type="button" class="btn btn-success" aria-label="Left Align"
	data-target="#facilityModal" data-toggle="modal">
	<span class="glyphicon glyphicon-plus" aria-hidden="true">Send Newsletter and Promotional Email</span>
</button>


<!-- Send Newsletter and Promotional Email -->
<div class="modal fade" id="facilityModal" tabindex="-1" role="dialog"
	aria-labelledby="newsletterModalLabel" data-backdrop="static" data-keyboard="false">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<h4 class="modal-title" id="myModalLabel">Send Newsletter and Promotional Email</h4>
			</div>
			<div class="modal-body">

				<div class="panel-body">
					<form id="PromotionalNewsletter" class="form-horizontal" role="form">
						<div class="form-group">
							<label for="Recepient" class="col-md-3 control-label">Recipient</label>
							<div class="col-md-9">
								<input type="text" class="form-control" name="recipient"
									placeholder="abc@gmail.com, def@yahoo.com, ....">
							</div>
						</div>
						<div class="form-group">
							<label for="Subject" class="col-md-3 control-label">Subject</label>
							<div class="col-md-9">
								<input type="text" class="form-control" name="subject"
									placeholder="Great offer, save $5.">
							</div>
						</div>



						<div class="form-group">
							<label for="message" class="col-md-3 control-label">Message Content</label>
							<div class="col-md-9">
								<input type="text" class="form-control" name="zipCode"
									placeholder="Hi There, We have great offer for you this Fall. Save $5.">
							</div>
						</div>

					</form>
				</div>


			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				<button type="button" class="btn btn-primary">Send Email</button>
			</div>
		</div>
	</div>
</div>