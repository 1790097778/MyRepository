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
								while(true){
									out.print("<tr class=\"gradeX\">");
									out.print("<td>"+"0000121"+"</td>");
									out.print("<td>"+"2017/10/15"+"</td>");
									out.print("<td>"+request.getParameter("name")+"...</td>");
									if(true)out.print("<td class=\"center\">"+"完成"+"</td>");else out.print("<td class=\"redstyle\">"+"未完成"+"</td>");
									out.print("<td class=\"center\">"+"<a onclick=\"loadView('content/student_task_detail.jsp','aaa',{id:3})\">查看详情</a>"+"</td>");
									out.print("</tr>");
									break;
								}
							%>
							<tr class="gradeX">
								<td>0002405</td>
								<td>2017/10/16</td>
								<td>科研项目...</td>
								<td class="redstyle">未完成</td>
								<td style="color: blue;"><a onclick="loadView('content/student_task_detail.jsp','aaa',{id:3})">查看详情</a></td>
							</tr>
							<tr class="gradeX">
								<td>0002406</td>
								<td>2017/10/19</td>
								<td>社会调查...</td>
								<td class="redstyle">未完成</td>
								<td style="color: blue;"><a onclick="loadView('content/student_task_detail.jsp','aaa',{id:3})">查看详情</a></td>
							</tr>
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