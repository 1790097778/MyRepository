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
					选择课题
				</div>
			</div>
			<div class="panel-body">
				<div class="table-responsive">
					<!-- 此处填充内容 -->
					<table class="table table-striped table-bordered table-hover" id="dataTables-example">
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
									out.print("<td>"+"无"+"</td>");
									out.print("<td>"+"无"+"</td>");
									out.print("<td class=\"center\">"+"无"+"</td>");
									out.print("<td class=");
									if(true)out.print("\"redstyle\">"+"可选"+"</td>");
									else out.print("\"center\">"+"不可选"+"</td>");
									out.print("</tr>");
									break;
								}
							%>
							<tr class="gradeX">
								<td><div class="radio"> <label> <input type="radio" name="optionsRadios" id="optionsRadios1" value="option1" >0002405</label> </div></td>
								<td>太阳能电池效率研究</td>
								<td>科研项目</td>
								<td class="center">理学院</td>
								<td class="redstyle">可选</td>
							</tr>
							<tr class="gradeX">
								<td><div class="radio"> <label> <input type="radio" name="optionsRadios" id="optionsRadios1" value="option1" >0002406</label> </div></td>
								<td>共享汽车的商业模式</td>
								<td>社会调查</td>
								<td class="center">计算机学院</td>
								<td class="center">不可选</td>
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