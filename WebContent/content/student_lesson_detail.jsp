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
					课题详情
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
                        		<%
                        			out.print("<div>名称："+request.getParameter("sb_name")+"</div>");
	                        		out.print("<div>学院："+request.getParameter("sb_college")+"</div>");
	                        		out.print("<div>专业："+request.getParameter("sb_major")+"</div>");
	                        		out.print("<div>类型："+request.getParameter("sb_type")+"</div>");
                        		%>
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
                        	<%
                       			out.print(request.getParameter("sb_content"));
                        	%>
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
                        	<%
                       			out.print(request.getParameter("sb_comments"));
                        	%>
                        </div>
                    </div>
					<div style="text-align: left;">
						<button onclick="loadView('content/student_lesson_choose.jsp','student/lesson/choose',{page_number:"+<%=Integer.parseInt(request.getParameter("page_number"))%>+"})" style="margin: auto;">返回</button>
					</div>
					<div style="text-align: center;margin-top: -25px;">
						<button onclick="loadView('content/student_lesson.jsp','student/lesson',{sb_id:"+<%=Integer.parseInt(request.getParameter("sb_id"))%>+"})" style="margin: auto;">选择课题</button>
					</div>
				</div>
			</div>
		</div>
		<!--End Advanced Tables -->
	</div>
</div>
</body>
</html>