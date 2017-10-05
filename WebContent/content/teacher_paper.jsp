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
					论文批改
				</div>
			</div>
			<div class="panel-body">
				<div class="table-responsive">
					<!-- 此处填充内容 -->
	                <div style="padding-bottom: 20px;">
	                    <a href="#" class="btn btn-primary" style="width: 120px;">下载查看论文</a>
	                </div>
					<div class="panel panel-default">
                       <div class="panel-heading">
                              <h4 class="panel-title">
                                  <a data-toggle="collapse" data-parent="#accordion" href="#collapseTwo" style="font-weight: bold;">修改意见：</a>
                              </h4>
                       </div>
                       <div id="collapseTwo" class="panel-collapse in" style="height: auto;">
                              <div class="panel-body">
                              		<!-- 此处填写意见 -->
                              		<textarea class="form-control" rows="7" style="resize:none;"></textarea>
                              </div>
                       </div>
	                </div>
	                <div style="text-align: center;"><button onclick="loadView('content/teacher_lesson.jsp','aaa',{id:3})" style="margin: auto;width: 120px;">提交保存</button></div>
				</div>
			</div>
		</div>
		<!--End Advanced Tables -->
	</div>
</div>
</body>
</html>