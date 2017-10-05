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
					<a href="#">课程管理</a>>未选题学生
				</div>
			</div>
			<div class="panel-body">
				<div class="table-responsive">
					<!-- 此处填充内容 -->
					<table class="table table-striped table-bordered table-hover" id="dataTables-example">
						<thead>
							<tr>
								<th>姓名</th>
								<th>学院</th>
								<th>班级</th>
								<th>联系方式</th>
								<th>课题状态</th>
							</tr>
						</thead>
						<tbody>
							<%
								while(true){
									out.print("<tr class=\"gradeX\">");
									out.print("<td><div class=\"radio\"> <label> <input type=\"radio\" name=\"optionsRadios"+"\" id=\"optionsRadios"+"\" value=\"option\" >"+request.getParameter("name")+"</label> </div></td>");
									out.print("<td>"+"理学院"+"</td>");
									out.print("<td>"+"信科"+"</td>");
									out.print("<td class=\"center\">"+"1790097778@qq.com"+"</td>");
									out.print("<td class=\"redstyle\">"+"未选题"+"</td>");
									out.print("</tr>");
									break;
								}
							%>
							<tr class="gradeX">
								<td><div class="radio"> <label> <input type="radio" name="optionsRadios" id="optionsRadios1" value="option1" >张三</label> </div></td>
								<td>理学院</td>
								<td>信科</td>
								<td class="center">2655813058@qq.com</td>
								<td class="redstyle">未选题</td>
							</tr>
							<tr class="gradeX">
								<td><div class="radio"> <label> <input type="radio" name="optionsRadios" id="optionsRadios1" value="option1" >李四</label> </div></td>
								<td>理学院</td>
								<td>光电</td>
								<td class="center">无</td>
								<td class="redstyle">未选题</td>
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