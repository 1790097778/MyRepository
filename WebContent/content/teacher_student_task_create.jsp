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
					<a onclick="loadView('content/teacher_student.jsp','aaa',{id:3})">我的学生</a>
					<a onclick="loadView('content/teacher_student_task.jsp','aaa',{id:3})">>任务</a>>任务管理
				</div>
			</div>
			<div class="panel-body">
				<div class="table-responsive">
					<!-- 此处填充内容 -->
					<div class="inner" style="font-weight: bold;padding-bottom: 15px;">状态：</div>
	                <div class="inner" style="font-weight: bold;padding-bottom: 15px;">截止时间：<input type="text" name="name"></div>
	                <div class="panel panel-default" style="padding-bottom: 15px;">
                       <div class="panel-heading">
                              <h4 class="panel-title">
                                  <a data-toggle="collapse" data-parent="#accordion" href="#collapseTwo" style="font-weight: bold;">任务内容：</a>
                              </h4>
                       </div>
                       <div id="collapseTwo" class="panel-collapse in" style="height: auto;">
                              <div class="panel-body">
                              		<!-- 此处填充内容 -->
                              		<textarea class="form-control" rows="7" style="resize:none;"></textarea>
                              </div>
                       </div>
	                </div>
	                <div class="panel panel-default" style="padding-bottom: 15px;">
                       <div class="panel-heading">
                              <h4 class="panel-title">
                                  <a data-toggle="collapse" data-parent="#accordion" href="#collapseTwo" style="font-weight: bold;">任务汇报：</a>
                              </h4>
                       </div>
                       <div id="collapseTwo" class="panel-collapse in" style="height: auto;">
                              <div class="panel-body">
                              		<!-- 此处填充任务汇报 -->
                              		此处填充任务汇报
                              </div>
                       </div>
	                </div>
	                <div style="padding-bottom: 15px;font-weight: bold;">
	                	附件：****<a href="#" class="btn btn-primary">下载查看附件</a>
	                </div>
	              	<div class="panel panel-default" style="padding-bottom: 15px;">
                       <div class="panel-heading">
                              <h4 class="panel-title">
                                  <a data-toggle="collapse" data-parent="#accordion" href="#collapseTwo" style="font-weight: bold;">导师评语：</a>
                              </h4>
                       </div>
                       <div id="collapseTwo" class="panel-collapse in" style="height: auto;">
                              <div class="panel-body">
                              		<!-- 此处填写评语 -->
                              		<textarea class="form-control" rows="7" style="resize:none;"></textarea>
                              </div>
                       </div>
	                </div>
	                <div style="text-align: center;"><button onclick="loadView('content/teacher_student_task.jsp','aaa',{id:3})" style="margin: auto;width: 120px;">保存</button></div>
				</div>
			</div>
		</div>
		<!--End Advanced Tables -->
	</div>
</div>
</body>
</html>