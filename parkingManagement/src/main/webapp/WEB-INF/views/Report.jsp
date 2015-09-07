<h1 styles="color:white;">Report Page</h1>

<p>The standard Lorem Ipsum passage, used since the 1500s

"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. 
Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor 
in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, 
sunt in culpa qui officia deserunt mollit anim id est laborum."

Section 1.10.32 of "de Finibus Bonorum et Malorum", written by Cicero in 45 BC

"Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam 
rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. 
Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores 
eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, 
adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. 
Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur?
 Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum 
 fugiat quo voluptas nulla pariatur?"

 </p>


<!-- <div class="modal fade" id="Billing-Page" role="dialog" data-backdrop="static" data-keyboard="false">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <form class="form-horizontal" id="Billing-Page">
                            <div class="navbar navbar-inverse navbar-static-top">
                                <div class="container-fluid">
                                    <a href="#" class="navbar-brand"> Admin Search Form </a>
                                   		<button class="navbar-toggle" data-toggle="collapse" data-target=".navHeaderCollapse">
                                        	<span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span>
                                    	</button>
                                    <div class="collapse navbar-collapse navHeaderCollapse">
                                        <ul class="nav navbar-nav navbar-right">
                                           <li class="active"><a href="#"> Home </a>
                                            </li>
                                            <li><a href="#logout-admin" data-toggle="modal" id="logout-admin"><span class="glyphicon glyphicon-off"></span> Logout </a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                            <div class="modal-body">
                                <div class="table-responsive">
                                    <table data-toggle="table" id="table-admin" data-show-refresh="true" data-search="true" data-height="299">
                                        <thead>
                                            <tr>
                                                <th>#</th>
                                                <th>Name</th>
                                                <th>User Name</th>
                                                <th>Operate</th>
                                            </tr>
                                        </thead>
                                        <tbody id="tbodyAdminTable">
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                            <div class="modal-footer">
                                <div class="col-md-2">
                                    <button type="button" class="btn btn-info pull-left " data-dismiss="modal" id="cancel-search">Cancel</button>
                                </div>
                            </div>
                        </form>
                    </div>                   
                </div>
            </div>
  
  
  
<script type="text/javascript">

//Admin Table Begins
$('#table-admin').bootstrapTable({
    method: 'get',
    //url: '${pageContext.request.contextPath}/admin/allUsers',
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
    	field: 'userid',
        title: 'User-Id',        
        class: 'admin',
        visible: false,
        switchable: false,
        align: 'right',
        valign: 'bottom'
        
    }, {
        field: 'firstName',
        title: 'First Name',
        class: 'admin',
        align: 'center',
        valign: 'middle'
        
    }, {
        field: 'lastName',
        title: 'Last Name',
        class: 'admin',
        align: 'left',
        valign: 'top',
        sortable: true
       
    }, {
    	field: 'userName',
    	title: 'UserName',
    	class: 'admin',
    	align: 'left',
    	valign: 'top',
    	sortable: true
   
	}, {
        field: 'add',
        title: 'Operate',
        align: 'center',
        valign: 'middle',
        class: 'admin',
        switchable: false,
       clickToSelect: false,
       //formatter: operateAdmin,
       //events: operateAdminEditEvent
    
	},  ]
});

//Admin Table Ends

</script>

          
 -->                        