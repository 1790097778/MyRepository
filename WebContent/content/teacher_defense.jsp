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
					答辩分配
				</div>
			</div>
			<div class="panel-body">
				<div class="table-responsive">
					<!-- 此处填充内容 -->
					<div class="inner">
						<%
							String teacher[] = request.getParameterValues("ra_teacher"),
								   student[] = request.getParameterValues("ra_student"),
								   time = request.getParameter("ra_time"),
								   place = request.getParameter("ra_place"),teachers="",students="";
							for(int i=0;i<teacher.length;i++)teachers=teachers+teacher[i]+"，";
							teachers = teachers.substring(0, teachers.length());
							for(int i=0;i<student.length;i++)students=students+student[i]+"，";
							students = students.substring(0, students.length());
							out.print("<div style=\"padding-bottom: 10px;\">"+students+"</div>");
							out.print("<div style=\"padding-bottom: 10px;\">"+teachers+"</div>");
							out.print("<div style=\"padding-bottom: 10px;\">时间："+time+"</div> ");
							out.print("<div style=\"padding-bottom: 10px;\">地点："+place+"</div>");
						%>
		            </div>
				</div>
			</div>
		</div>
		<!--End Advanced Tables -->
	</div>
</div>
</body>
</html>