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
					论文
				</div>
			</div>
			<div class="panel-body">
				<div class="table-responsive">
					<!-- 此处填充内容 -->
					<div style="padding-bottom: 10px;">
	                    <a href="download/1.docx" class="btn btn-primary">评阅人评审表</a>
	                    <a href="#" class="btn btn-primary">答辩记录表</a>
	                    <a href="#" class="btn btn-primary">指导老师评审表</a>
	                    <a href="#" class="btn btn-primary">成绩评定总表</a>
	                </div>
	                <div class="panel panel-default">
                       <div class="panel-heading">
                              <h4 class="panel-title">
                                  <a data-toggle="collapse" data-parent="#accordion" href="#collapseTwo" style="font-weight: bold;">导师修改意见：</a>
                              </h4>
                       </div>
                       <div id="collapseTwo" class="panel-collapse in" style="height: auto;">
                              <div class="panel-body">
                              		<!-- 此处填写意见 -->
                              		此处填写意见
                              </div>
                       </div>
	                </div>
	                <div style="padding-bottom: 20px;"">
	                    <a class="btn btn-primary" style="background-color: #EFEFEF;color: blue;"><input type="file"></a>
	                    <a href="#" class="btn btn-primary">下载论文</a>
	                </div>
				</div>
			</div>
		</div>
		<!--End Advanced Tables -->
	</div>
</div>
</body>
</html>