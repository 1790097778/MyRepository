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
					成绩管理
				</div>
			</div>
			<div class="panel-body">
				<div class="table-responsive">
					<!-- 此处填充内容 -->
					<div style="padding-bottom: 10px;">
						<%
							out.print("<a href=\""+request.getParameter("url")+"\" class=\"btn btn-primary\">导出所有材料</a>");
						%>
	                </div>
	                <div class="panel panel-default">
                       <div class="panel-heading">
                              <h4 class="panel-title">
                                  <a data-toggle="collapse" data-parent="#accordion" href="#collapseTwo" style="font-weight: bold;">总成绩：</a>
                              </h4>
                       </div>
                       <div id="collapseTwo" class="panel-collapse in" style="height: auto;">
                              <div class="panel-body">
                              		<!-- 此处填写成绩详情 -->
                              		<%
										out.print("总成绩："+request.getParameter("grades"));
									%>
                              </div>
                       </div>
	                </div>
				</div>
			</div>
		</div>
		<!--End Advanced Tables -->
	</div>
</div>
</body>
</html>