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
					发布公告
				</div>
			</div>
			<div class="panel-body">
				<div class="table-responsive">
					<!-- 此处填充内容 -->
					<div class="inner">
						<div class="form-group">
                			<label>公告：</label>
                			<textarea class="form-control" rows="7" style="resize:none;"></textarea>
            			</div> 
            		</div>
            		<button name="submit">发布</button>
				</div>
			</div>
		</div>
		<!--End Advanced Tables -->
	</div>
</div>
</body>
</html>