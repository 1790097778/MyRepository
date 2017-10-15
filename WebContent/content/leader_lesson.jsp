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
					审核课题
				</div>
			</div>
			<div class="panel-body">
				<div class="table-responsive">
					<!-- 此处填充内容 -->
					<table class="table table-striped table-bordered table-hover" id="dataTables-example">
						<thead>
							<tr>
								<th>课题编号</th>
								<th>出题人</th>
								<th>课程名称</th>
								<th>课程类型</th>
								<th>院系</th>
								<th>详情</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody>
							<%
								while(true){
									out.print("<tr class=\"gradeX\">");
									out.print("<td>0002405</td>");
									out.print("<td>"+request.getParameter("name")+"</td>");
									out.print("<td>"+"叶绿体的能量转换率"+"</td>");
									out.print("<td>"+"科研项目"+"</td>");
									out.print("<td class=\"center\">"+"理学院"+"</td>");
									out.print("<td class=\"bluestyle\">"+"<a onclick=\"loadView('content/teacher_lesson_create.jsp','aaa',{id:3})\">查看详情</a>"+"</td>");
									out.print("<td class=\"center\">"
												+"<div class=\"radio\"> <label> <input type=\"radio\" name=\"optionsRadios1\" value=\"y\" >通过</label></div>"
												+"<div class=\"radio\"> <label> <input type=\"radio\" name=\"optionsRadios1\" value=\"n\" >不通过</label> </div>"+
											  "</td></tr>");
									break;
								}
							%>
							<tr class="gradeX">
								<td>0002405</td>
								<td>张三</td>
								<td>太阳能电池效率研究</td>
								<td>科研项目</td>
								<td class="center">理学院</td>
								<td class="bluestyle"><a onclick="loadView('content/teacher_lesson_create.jsp','aaa',{id:3})">查看详情</a></td>
								<td class="center">
									<div class="radio"> <label> <input type="radio" name="optionsRadios2" value="y" >通过</label> </div>
									<div class="radio"> <label> <input type="radio" name="optionsRadios2" value="n" >不通过</label> </div>
								</td>
							</tr>
							<tr class="gradeX">
								<td>0002406</td>
								<td>李四</td>
								<td>共享汽车的商业模式</td>
								<td>社会调查</td>
								<td class="center">计算机学院</td>
								<td class="bluestyle"><a onclick="loadView('content/teacher_lesson_create.jsp','aaa',{id:3})">查看详情</a></td>
								<td class="center">
									<div class="radio"> <label> <input type="radio" name="optionsRadios3" value="y" >通过</label> </div>
									<div class="radio"> <label> <input type="radio" name="optionsRadios3" value="n" >不通过</label> </div>
								</td>
							</tr>
						</tbody>
					</table>
					<div style="text-align: right;"><button style="margin: auto;width: 120px;">保存</button></div>
					<div style="text-align: center;margin-top: -25px;">
						<div style="margin: auto;">
							<button style="padding-right: 10px;" onclick="bb()">上一页</button>
							1/1
							<button style="padding-left: 10px;">下一页</button>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!--End Advanced Tables -->
	</div>
</div>
<script type="text/javascript">
function bb(){
	var radionum = document.getElementById("radios123");
	if(radionum!=null)alert(radionum.value);
	else alert("test:NullExcpetion!");
}
</script>
</body>
</html>