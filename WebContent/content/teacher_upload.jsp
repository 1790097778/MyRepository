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
			<div class="panel-heading">
				<div class="header">
					答辩材料上传
				</div>
			</div>
			<div class="panel-body">
				<div class="table-responsive">
					<!-- 此处填充内容 -->
	                <a class="btn btn-primary" style="background-color: #EFEFEF;color: black;">答辩记录表：<input style="color: blue;" type="file"></a>
	                <a class="btn btn-primary" style="background-color: #EFEFEF;color: black;">答辩表：<input style="color: blue;" type="file"></a>
	                <button class="btn btn-primary" style="width: 100px;margin-left: 34%;height: 48px;" onclick="">上传</button>
				</div>
			</div>
		</div>
		<!--End Advanced Tables -->
	</div>
</div>
</body>
</html>