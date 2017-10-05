<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head lang="en">
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
			<div class="panel-heading">时间地点设置：</div>
			<div class="panel-body">
				<div class="table-responsive">
					<div class="inner">
		                <div style="padding-bottom: 10px;">主席：</div>
		                <div style="padding-bottom: 10px;">导师：</div>
		                <div style="padding-bottom: 10px;">学生：</div>
		                <div style="padding-bottom: 10px;">时间：<input type="text"/></div>                                             <!--时间地点-->
		                <div style="padding-bottom: 10px;">地点：<input type="text"/></div>
		                <button onclick="loadView('content/leader_defense.jsp','aaa',{id:3})">提交</button>
		            </div>
				</div>
			</div>
		</div>
		<!--End Advanced Tables -->
	</div>
</div>
</body>
</html>