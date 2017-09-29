<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head lang="en">
<meta charset="UTF-8">
<title></title>
<style>
.header {
	/*background-color: red;*/
	padding: 10px;
	border-bottom: 1px solid black;
}
</style>
</head>
<body>
			<div class="row">
				<div class="col-md-12">
					<div class="header">
						&nbsp <a href="#">我的选课</a>>选择课题
					</div>
					<!--这里插入-->
					<div class="row">
						<div class="col-md-12">
							<!-- Advanced Tables -->
							<div class="panel panel-default">
								<div class="panel-heading">选课：</div>
								<div class="panel-body">
									<div class="table-responsive">
										<table class="table table-striped table-bordered table-hover"
											id="dataTables-example">
											<thead>
												<tr>
													<th>课题编号</th>
													<th>课程名称</th>
													<th>课程类型(s)</th>
													<th>院系</th>
													<th>状态</th>
												</tr>
											</thead>
											<tbody>
												<%
													while(true){
														out.print("<tr class=\"gradeX\">");
														out.print("<td><div class=\"radio\"> <label> <input type=\"radio\" name=\"optionsRadios"+"\" id=\"optionsRadios"+"\" value=\"option\" >"+request.getParameter("name")+"</label> </div></td>");
														out.print("<td>"+"</td>");
														out.print("<td>"+"</td>");
														out.print("<td class=\"center\">"+"</td>");
														out.print("<td class=\"center\">"+"</td>");
														out.print("</tr>");
														break;
													}
												%>
												<tr class="gradeX">
													<td><div class="radio"> <label> <input type="radio" name="optionsRadios" id="optionsRadios1" value="option1" >Radio 1 </label> </div></td>
													<td>Internet Explorer 4.0</td>
													<td>Win 95+</td>
													<td class="center">4</td>
													<td class="center">X</td>
												</tr>
												<tr class="gradeX">
													<td><div class="radio"> <label> <input type="radio" name="optionsRadios" id="optionsRadios1" value="option1" >Radio 1 </label> </div></td>
													<td>Lynx</td>
													<td>Text only</td>
													<td class="center">-</td>
													<td class="center">X</td>
												</tr>
											</tbody>
										</table>
									</div>

								</div>
							</div>
							<!--End Advanced Tables -->
						</div>
					</div>
				</div>
			</div>
</body>
</html>