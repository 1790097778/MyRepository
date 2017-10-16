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
								<th>查看详情</th>
								<th>状态</th>
							</tr>
						</thead>
						<tbody>
							<%
								int data_number = Integer.parseInt(request.getParameter("data_number"));
								String sb_id[]=request.getParameterValues("sb_id"),
									   sb_name[]=request.getParameterValues("sb_name"),
									   sb_type[]=request.getParameterValues("sb_type"),
									   sb_college[]=request.getParameterValues("sb_college"),
									   sb_major[]=request.getParameterValues("sb_major"),
									   sb_status[]=request.getParameterValues("sb_status");
								for(int i=0;i<data_number;i++){
									out.print("<tr class=\"gradeX\">");
									sb_id[i]=("000000"+sb_id[i]).substring(("000000"+sb_id[i]).length()-7, ("000000"+sb_id[i]).length());
									out.print("<td><div class=\"radio\"> <label> <input type=\"radio\" id=\"radios"+i+"\" name=\"optionsRadios\" value=\""+Integer.parseInt(sb_id[i])+"\" >"+sb_id[i]+"</label> </div></td>");
									out.print("<td>"+sb_name[i]+"</td>");
									out.print("<td>"+sb_type[i]+"</td>");
									out.print("<td class=\"center\">"+sb_college[i]+"-"+sb_major[i]+"</td>");
									out.print("<td class=\"bluestyle\">"+"<a onclick=\"loadView('content/student_lesson_detail.jsp','student/lesson/detail',{id:"+Integer.parseInt(sb_id[i])+"})\">查看详情</a>"+"</td>");
									out.print("<td class=");
									if(sb_status[i].equals("1"))out.print("\"redstyle\">"+"可选"+"</td>");
									else out.print("\"center\">"+"不可选"+"</td>");
									out.print("</tr>");
								}
							%>
						</tbody>
					</table>
					<div style="text-align: left;"><button style="margin: auto;width: 120px;" onclick="cheak()">添加选课</button></div>
					<div style="text-align: center;margin-top: -25px;">
						<div style="margin: auto;">
							<%
								int page_number=Integer.parseInt(request.getParameter("page_number")),
								    page_maxnumber=Integer.parseInt(request.getParameter("page_maxnumber"));
								if(page_number>1)out.print("<button style=\"padding-right: 10px;\" onclick=\"loadView('content/student_lesson_choose.jsp','student/lesson/choose',{page_number:"+(page_number-1)+"})\">上一页</button>");
								out.print(page_number+"/"+page_maxnumber);
								if(page_number<page_maxnumber)out.print("<button style=\"padding-right: 10px;\" onclick=\"loadView('content/student_lesson_choose.jsp','student/lesson/choose',{page_number:"+(page_number+1)+"})\">下一页</button>");
							%>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!--End Advanced Tables -->
	</div>
</div>
<script type="text/javascript">
function cheak(){
	var radio = document.getElementById("radios0");
	for(var i=1;radio!=null;i++){
		if(radio.checked)
			loadView('content/student_lesson.jsp','student/lesson',{sb_id:radio.value});
		radio = document.getElementById("radios"+i);
	}
	alert("亲，当前没有选中任何课程哟~");
}
</script>
</body>
</html>