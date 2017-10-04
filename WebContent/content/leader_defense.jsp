<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head >
<style>
.header {
	/*background-color: red;*/
	padding: 10px;
	border-bottom: 1px solid black;
}
.redstyle{
	color: Red;
}
</style>
</head>
<body>
<div class="row">
	<div class="col-md-12">
	<!-- Advanced Tables -->
		<div class="panel panel-default">
			<div class="panel-heading">答辩分配：</div>
			<div class="panel-body">
				<div class="table-responsive">
					<table class="table table-striped table-bordered table-hover">
                             <thead>
                             <tr>
                                 <th>组号</th>
                                 <th>主席</th>
                                 <th>小组人数</th>
                                 <th>学生人数</th>
                                 <th>时间地点</th>
                             </tr>
                             </thead>
                             <tbody>
                             <tr>
                                 <td>1</td>
                                 <td>John</td>
                                 <td>Doe</td>
                                 <td>John15482</td>
                                 <td><a onclick="loadView('content/leader_defense_detail.jsp','aaa',{id:3})">设置时间地点</a></td>
                             </tr>
                             <tr>
                                 <td>2</td>
                                 <td>Kimsila</td>
                                 <td>Marriye</td>
                                 <td>Kim1425</td>
                                 <td><a href="#">设置时间地点</a></td>
                             </tr>

                             </tbody>
                         </table>
                         <div class="inner" style="margin-left: 40%">
                             <a href="#" class="btn btn-primary btn-sm">上一页</a>
                             xx/xx
                             <a href="#" class="btn btn-primary btn-sm">下一页</a>
                         </div>
				</div>
			</div>
		</div>
	<!--End Advanced Tables -->
	</div>
</div>
</body>
</html>