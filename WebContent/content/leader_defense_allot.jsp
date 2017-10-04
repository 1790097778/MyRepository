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
		<div class="header">
			答辩分配
		</div>
</div>
</div>
<div class="row">
	<div class="col-md-12">
		<!-- Advanced Tables -->
		<div class="panel panel-default">
			<div class="panel-heading">答辩分配：</div>
			<div class="panel-body">
				<div class="table-responsive">
					<div class="inner">
			            <div>老师: 18人</div>   
			            <div style="padding-top: 10px;"></div>                                <!--姓名排列需另外实现-->
			            <div>学生: 300人</div>
			            <div style="padding-top: 10px;"></div>  
	  					    </div>
			        <div class="inner">共分为 :<input type="number"/>个组</div>
			        <div style="padding-top: 15px;"></div>
			        <div class="inner"><a href="#" class="btn btn-primary btn-sm">开始随机分配</a></div>
				</div>
			</div>
		</div>
		<!--End Advanced Tables -->
		</div>
	</div>
</body>
</html>