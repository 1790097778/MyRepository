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
					论文
				</div>
			</div>
			<div class="panel-body">
				<div class="table-responsive">
					<!-- 此处填充内容 -->
					<div style="padding-bottom: 10px;">
						<%
							out.print("<a href=\""+request.getParameter("jf_judgerlist")+"\" class=\"btn btn-primary\">评阅人评审表</a>");
							out.print("<a href=\""+request.getParameter("rp_recordlist")+"\" class=\"btn btn-primary\" style=\"margin-left: 10px;\">答辩记录表</a>");
							out.print("<a href=\""+request.getParameter("tf_teacherlist")+"\" class=\"btn btn-primary\" style=\"margin-left: 10px;\">指导老师评审表</a>");
							out.print("<a href=\""+request.getParameter("pp_list")+"\" class=\"btn btn-primary\" style=\"margin-left: 10px;\">成绩评定总表</a>");
						%>
	                </div>
	                <div class="panel panel-default">
                       <div class="panel-heading">
                              <h4 class="panel-title">
                                  <a data-toggle="collapse" data-parent="#accordion" href="#collapseTwo" style="font-weight: bold;">导师修改意见：</a>
                              </h4>
                       </div>
                       <div id="collapseTwo" class="panel-collapse in" style="height: auto;">
                              <div class="panel-body">
                              		<!-- 此处填写意见 -->
                              		<%=request.getParameter("pp_teacheradvice") %>
                              </div>
                       </div>
	                </div>
	                <div style="padding-bottom: 20px;">
	                	<form action="upload/paper" onsubmit="return check()">
		                    <a class="btn btn-primary" style="background-color: #EFEFEF;color: blue;"><input type="file" id="file"></a>
		                    <input class="btn btn-primary" style="padding-left: 20px;" type="submit" value="提交审批">
	                	</form>
	                </div>
				</div>
			</div>
		</div>
		<!--End Advanced Tables -->
	</div>
</div>
<script type="text/javascript">
function check() {
	var file = document.getElementById("file");
	if (file.value == null||file.value == ""){  
        alert("请选择要上传的论文!");  
        return false;
    }  
    if (file.lastIndexOf('.')==-1){    //如果不存在"."    
        alert("路径不正确!");  
        return false;  
    }
	return true;
}
</script>
</body>
</html>