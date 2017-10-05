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
.bluestyle{
	color: blue;
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
					我的学生
				</div>
			</div>
			<div class="panel-body">
				<div class="table-responsive">
					<!-- 此处填充内容 -->
					<table class="table table-striped table-bordered table-hover" id="dataTables-example">
						<thead>
							<tr>
								<th>课题</th>
								<th>姓名</th>
								<th>学院</th>
								<th>班级</th>
								<th>任务</th>
								<th>论文</th>
								<th>成绩</th>
								<th>联系方式</th>
							</tr>
						</thead>
						<tbody>
							<%
								while(true){
									out.print("<tr class=\"gradeX\">");
									out.print("<td>叶绿体的能量转换率</td>");
									out.print("<td>"+request.getParameter("name")+"</td>");
									out.print("<td>理学院</td>");
									out.print("<td>"+"信科"+"</td>");
									out.print("<td>"+"16信科2"+"</td>");
									out.print("<td class=\"bluestyle\"><a onclick=\"loadView('content/teacher_student_task.jsp','aaa',{id:3})\">任务管理</a>"+"</td>");
									out.print("<td class=\"bluestyle\"><a onclick=\"loadView('content/teacher_student_paper.jsp','aaa',{id:3})\">批改论文</a>"+"</td>");
									out.print("<td class=\"center\">"+"15971360801"+"</td></tr>");
									break;
								}
							%>
							<tr class="gradeX">
								<td>太阳能电池效率研究</td>
								<td>张三</td>
								<td>理学院</td>
								<td>光电</td>
								<td>16光电1</td>
								<td class="bluestyle"><a onclick="loadView('content/teacher_student_task.jsp','aaa',{id:3})">任务管理</a></td>
								<td class="bluestyle"><a onclick="loadView('content/teacher_student_paper.jsp','aaa',{id:3})">批改论文</a></td>
								<td class="center">18162547852</td>
							</tr>
							<tr class="gradeX">
								<td>共享汽车的商业模式</td>
								<td>李四</td>
								<td>艺术设计学院</td>
								<td>物流管理</td>
								<td>16物管2</td>
								<td class="bluestyle"><a onclick="loadView('content/teacher_student_task.jsp','aaa',{id:3})">任务管理</a></td>
								<td class="bluestyle"><a onclick="loadView('content/teacher_student_paper.jsp','aaa',{id:3})">批改论文</a></td>
								<td class="center">17671071521</td>
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