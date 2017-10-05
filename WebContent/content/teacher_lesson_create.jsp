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
					<a onclick="loadView('content/teacher_lesson.jsp','aaa',{id:3})">课程管理</a>>创建课题
				</div>
			</div>
			<div class="panel-body">
				<div class="table-responsive">
					<!-- 此处填充内容 -->
					<div class="panel panel-default">
                        <div class="panel-heading">
                            <h4 class="panel-title">
                              	 基本信息
                            </h4>
                        </div>
                        <div class="panel-body">
                      		    <div>名称：<input type="text" name="name"></div>
                      		    <div>学院：理学院</div>
                      		    <div>专业：光电专业</div>
                      		    <div>类型：<input type="text" name="type"></div>
                        </div>
                    </div>
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h4 class="panel-title">
                               	 课题内容：
                            </h4>
                        </div>
                        <div class="panel-body">
                        	<!-- 此处应有内容 -->
                        	<textarea class="form-control" rows="7" style="resize:none;"></textarea>
                        </div>
                    </div>
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h4 class="panel-title">
                         		 课题要求：
                            </h4>
                        </div>
                        <div class="panel-body">
                        	<!-- 此处应有要求 -->
                        	<textarea class="form-control" rows="7" style="resize:none;"></textarea>
                        </div>
                    </div>
                    <div style="text-align: center;"><button onclick="loadView('content/teacher_lesson.jsp','aaa',{id:3})" style="margin: auto;width: 120px;">保存</button></div>
				</div>
			</div>
		</div>
		<!--End Advanced Tables -->
	</div>
</div>
</body>
</html>