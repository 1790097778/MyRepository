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
					课程管理
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
								<th>课程类型</th>
								<th>院系</th>
								<th>详情</th>
								<th>状态</th>
							</tr>
						</thead>
						<tbody>
							<%
								String id[]=request.getParameterValues("sb_id"),
									   name[]=request.getParameterValues("sb_name"),
									   type[]=request.getParameterValues("sb_type"),
									   college[]=request.getParameterValues("sb_college"),
									   major[]=request.getParameterValues("sb_major"),
									   content[]=request.getParameterValues("sb_content"),
									   status[]=request.getParameterValues("sb_status");
								for(int i=0;i<name.length;i++){
									id[i]=("000000"+id[i]).substring(("000000"+id[i]).length()-7, ("000000"+id[i]).length());
									out.print("<tr class=\"gradeX\">");
									out.print("<td><div class=\"radio\"> <label> <input type=\"radio\" name=\"optionsRadios"+"\" id=\"optionsRadios"+i+"\" value=\"option\" >"+id[i]+"</label> </div></td>");
									out.print("<td>"+name[i]+"</td>");
									out.print("<td>"+type[i]+"</td>");
									out.print("<td class=\"center\">"+college[i]+"-"+major[i]+"</td>");
									out.print("<td class=\"bluestyle\">"+"<a onclick=\"loadView('content/student_lesson_detail.jsp','student/lesson/detail',{id:"+Integer.parseInt(id[i])+"})\">查看详情</a>"+"</td>");
									out.print("<td class=");
									if(status[i].equals("0"))out.print("\"redstyle\">"+"未通过"+"</td>");
									else out.print("\"center\">"+"已通过"+"</td>");
									out.print("</tr>");
								}
							%>
							<tr class="gradeX">
								<td><div class="radio"> <label> <input type="radio" name="optionsRadios" id="optionsRadios1" value="option1" >0002405</label> </div></td>
								<td>太阳能电池效率研究</td>
								<td>科研项目</td>
								<td class="center">理学院</td>
								<td class="redstyle">未通过</td>
							</tr>
							<tr class="gradeX">
								<td><div class="radio"> <label> <input type="radio" name="optionsRadios" id="optionsRadios1" value="option1" >0002406</label> </div></td>
								<td>共享汽车的商业模式</td>
								<td>社会调查</td>
								<td class="center">计算机学院</td>
								<td class="redstyle">未通过</td>
							</tr>
						</tbody>
					</table>
					<div style="text-align: center;"><button onclick="loadView('content/teacher_lesson_create.jsp','aaa',{id:3})" style="margin: auto;width: 120px;">新建课程</button></div>
				</div>
			</div>
		</div>
		<!--End Advanced Tables -->
	</div>
</div>
</body>
</html>