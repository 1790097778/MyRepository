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
					任务
				</div>
			</div>
			<div class="panel-body">
				<div class="table-responsive">
					<!-- 此处填充内容 -->
					<table class="table table-striped table-bordered table-hover" id="dataTables-example">
						<thead>
							<tr>
								<th>任务编号</th>
								<th>截止日期</th>
								<th>任务内容</th>
								<th>状态</th>
								<th>详情</th>
							</tr>
						</thead>
						<tbody>
							<%
								int task_number=Integer.parseInt(request.getParameter("task_number"));
								String status[]=request.getParameterValues("tk_state"),
									   id[]=request.getParameterValues("tk_id"),
								   	   time[]=request.getParameterValues("tk_lasttime"),
								   	   context[]=request.getParameterValues("tk_content");
								for(int i=0;i<task_number;i++){
									out.print("<tr class=\"gradeX\">");
									id[i]=("000000"+id[i]).substring(("000000"+id[i]).length()-7, ("000000"+id[i]).length());
									out.print("<td>"+id[i]+"</td>");
									out.print("<td>"+time[i]+"</td>");
									out.print("<td>"+context[i].substring(0,15)+"...</td>");
									if(status[i].equals("2"))out.print("<td class=\"center\">"+"完成"+"</td>");else out.print("<td class=\"redstyle\">"+"未完成"+"</td>");
									out.print("<td class=\"center\">"+"<a onclick=\"loadView('content/student_task_detail.jsp','student/task/detail',{tk_id:"+Integer.parseInt(id[i])+"})\">查看详情</a>"+"</td>");
									out.print("</tr>");
									break;
								}
							%>
						</tbody>
					</table>
				</div>
			</div>
		</div>
		<!--End Advanced Tables -->
	</div>
</div>
</body>
</html>