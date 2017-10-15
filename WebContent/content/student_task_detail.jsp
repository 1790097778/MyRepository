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
					<a onclick="loadView('content/student_task.jsp','aaa',{id:3})">任务</a>>任务详情
				</div>
			</div>
			<div class="panel-body">
				<div class="table-responsive">
					<!-- 此处填充内容 -->
					<%
					try{
						String status=request.getParameter("tk_state"),
							   time=request.getParameter("tk_lasttime"),
							   context=request.getParameter("tk_content"),
							   report=request.getParameter("tr_content"),
							   file=request.getParameter("tr_data"),
							   remark=request.getParameter("tr_remark");
						if(!status.equals("2"))out.print("<form action=\"upload/student/task/detail\" onsubmit=\"return check()\">");
						if(status.equals("0"))out.print("<div class=\"inner\" style=\"font-weight: bold;padding-bottom: 15px;\">状态：未通过</div>");
						if(status.equals("1"))out.print("<div class=\"inner\" style=\"font-weight: bold;padding-bottom: 15px;\">状态：审核中</div>");
						if(status.equals("2"))out.print("<div class=\"inner\" style=\"font-weight: bold;padding-bottom: 15px;\">状态：已通过</div>");
						out.print("<div class=\"inner\" style=\"font-weight: bold;padding-bottom: 15px;\">截止时间："+time+"</div>");
					%>
	                <div class="panel panel-default" style="padding-bottom: 15px;">
                       <div class="panel-heading">
                              <h4 class="panel-title">
                                  <a data-toggle="collapse" data-parent="#accordion" href="#collapseTwo" style="font-weight: bold;">任务内容：</a>
                              </h4>
                       </div>
                       <div id="collapseTwo" class="panel-collapse in" style="height: auto;">
                              <div class="panel-body">
                              		<!-- 此处填充内容 -->
                              		<%=context %>
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
                              		<%
                              			if(status.equals("2"))out.print(report);
                              			else out.print("<textarea class=\"form-control\" rows=\"7\" style=\"resize:none;\">11</textarea>");
                              		%>
                              </div>
                       </div>
	                </div>
	                <div style="padding-bottom: 15px;font-weight: bold;">
	                	附件：
	                	<%
	                		if(status.equals("2")){
	                			if(file!=null||!file.equals(""))out.print("<a href=\""+file+"\" class=\"btn btn-primary\" style=\"margin-left: 10px;\">查看附件</a>");
	                		}else{
                				out.print("<a class=\"btn btn-primary\" style=\"background-color: #EFEFEF;color: blue;padding-bottom: 10px;\"><input type=\"file\"></a>");
	                			if(file!=null||!file.equals(""))out.print("<a href=\""+file+"\" class=\"btn btn-primary\" style=\"margin-left: 10px;\">查看附件</a>");
	                		}
	                	%>
	                	<a class="btn btn-primary" style="background-color: #EFEFEF;color: blue;padding-bottom: 10px;"><input type="file"></a>
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
                              		<%=remark %>
                              </div>
                       </div>
	                </div>
					<%
						if(!status.equals("2")){
							out.print("<input type=\"submit\" style=\"font-size: 17px;\" value=\"提交\">");
							out.print("</form>");
						}
					}catch(Exception e){}
					%>
				</div>
			</div>
		</div>
		<!--End Advanced Tables -->
	</div>
</div>
</body>
</html>