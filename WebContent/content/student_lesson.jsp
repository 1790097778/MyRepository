<%@page import="org.apache.catalina.connector.Request"%>
<%@page import="controller.StudentLesson"%>
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
					我的课题
				</div>
			</div>
			<div class="panel-body">
				<div class="table-responsive">
					<!-- 此处填充内容 -->
					<table class="table table-striped table-bordered table-hover" id="dataTables-example">
						<thead>
							<tr>
								<th>课题编号</th>
								<!-- <th>出题人</th> -->
								<th>课程名称</th>
								<th>课程类型</th>
								<th>院系</th>
								<th>详情</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody>
							<tr class="gradeX">
								<%
						
								
									String sb_id=request.getParameter("sb_id"),
									   sb_name=request.getParameter("sb_name"),
									   sb_type=request.getParameter("sb_type"),
									   sb_college=request.getParameter("sb_college"),
									   sb_major=request.getParameter("sb_major"),
									   sb_status=request.getParameter("sb_status");
									sb_id=("000000"+sb_id).substring(("000000"+sb_id).length()-7, ("000000"+sb_id).length());
									out.print("<td>"+sb_id+"</td>");
									out.print("<td>"+sb_name+"</td>");
									out.print("<td>"+sb_type+"</td>");
									out.print("<td class=\"center\">"+sb_college+"-"+sb_major+"</td>");
									out.print("<td class=\"redstyle\"><a onclick=\"loadView('content/student_lesson_detail.jsp','student/lesson/detail',{sb_id:"+Integer.parseInt(sb_id)+"})\">查看详情</a></td>");
									out.print("<td class=\"center\"><button onclick=\"loadView('content/student_lesson_choose.jsp','student/lesson/abandon.do',null)\">放弃选题</button></td></tr>");
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