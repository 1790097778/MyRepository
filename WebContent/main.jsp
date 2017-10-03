<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>湖北工业大学 毕业设计系统-主页面</title>
    <!-- Bootstrap Styles-->
    <link href="assets/css/bootstrap.css" rel="stylesheet" />
    <!-- FontAwesome Styles-->
    <link href="assets/css/font-awesome.css" rel="stylesheet" />
    <!-- Morris Chart Styles-->
    <link href="assets/js/morris/morris-0.4.3.min.css" rel="stylesheet" />
    <!-- Custom Styles-->
    <link href="assets/css/custom-styles.css" rel="stylesheet" />
    <!-- Google Fonts-->
    <link rel='stylesheet' type='text/css' />
</head>

<body>
	<%
		String userSession[]=session.getValueNames();
		try{
			if(userSession[0]==null){
				%><script type="text/javascript">location.href ="login.jsp?error=\"请先登录！\"";</script><%
			}
		}catch(Exception e){
			%><script type="text/javascript">location.href ="login.jsp?error=unlogin";</script><%
		}
	%>
    <div id="wrapper">
    
    	<!--TOP  -->
        <nav class="navbar navbar-default top-navbar" role="navigation">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="main.jsp">毕业设计系统</a>
            </div>
            <ul class="nav navbar-top-links navbar-right">
            	<%
                	if(true){%><%@include file="top/top_message.jsp"%><%;}
                 	if(true){%><%@include file="top/top_task.jsp" %><%;}
					if(true){%><%@include file="top/top_alert.jsp" %><%;}
				%>
                <%@include file="top/top_userInfo.jsp" %>
            </ul>
        </nav>
        
        <!--LEFT  -->
        <nav class="navbar-default navbar-side" role="navigation">
            	<div class="sidebar-collapse">
                	<ul class="nav" id="main-menu">
                    	<%
                    		//学生左槽
                   	 		if(true){%><%@include file="left/student_lesson.jsp"%><%;}
                    		if(true){%><%@include file="left/student_paper.jsp" %><%;}
							if(true){%><%@include file="left/student_grades.jsp" %><%;}
							//老师左槽
							if(true){%><%@include file="left/teacher_lesson.jsp" %><%;}
							if(true){%><%@include file="left/teacher_student.jsp" %><%;}
							if(true){%><%@include file="left/teacher_chat.jsp" %><%;}
							if(true){%><%@include file="left/teacher_defense.jsp" %><%;}
							if(true){%><%@include file="left/teacher_upload.jsp" %><%;}
							if(true){%><%@include file="left/teacher_paper.jsp" %><%;}
							//负责人左槽
                   	 		if(true){%><%@include file="left/leader_lesson.jsp"%><%;}
                   	 		if(true){%><%@include file="left/leader_defense.jsp"%><%;}
                   	 		if(true){%><%@include file="left/leader_notice.jsp"%><%;}
						%>
                	</ul>
            	</div>
        </nav>
        
        <!--CONTENT  -->
        <div id="page-wrapper">
        	<div id="page-inner">
        	<%@include file="content/Welcome.jsp"%>
      	   </div>
        <!-- /. PAGE INNER  -->
    	</div>
        <!-- /. PAGE WRAPPER  -->
    
    
    </div>
    <!-- /. WRAPPER  -->
    <!-- JS Scripts-->
    <!-- jQuery Js -->
    <script src="assets/js/jquery-1.10.2.js"></script>
    <!-- Bootstrap Js -->
    <script src="assets/js/bootstrap.min.js"></script>
    <!-- Metis Menu Js -->
    <script src="assets/js/jquery.metisMenu.js"></script>
    <!-- Morris Chart Js -->
    <script src="assets/js/morris/raphael-2.1.0.min.js"></script>
    <script src="assets/js/morris/morris.js"></script>
    <!-- Custom Js -->
    <script src="assets/js/custom-scripts.js"></script>

	<script type="text/javascript">
	function loadView(page_name,mothod_name,send_data){
	    $.ajax({
	    	global:false,
	    	async:true,
	    	type: "post",
	    	dataType:"json",
	    	data:send_data,
	    	url:mothod_name,
	    	beforeSend:function(){
	    		$("#page-inner").empty();
	    		$("#page-inner").load("content/msg_loading.jsp");
	    	},
	    	success:function(data){
	    		$("#page-inner").empty();
	    		$("#page-inner").load(page_name,data,null);
	    	},
	    	error: function(XMLHttpRequest, textStatus, errorThrown) {
	    		 var errorMsg="error in $.ajax()"+
	    			 		  "&error=XMLHttpRequest.status:"+XMLHttpRequest.status+
	    		 			  "&error=XMLHttpRequest.readyState:"+XMLHttpRequest.readyState+
	    		 			  "&error=textStatus:"+textStatus+
	    		 			  "&error=errorThrown:"+errorThrown;
	    		 $("#wrapper").empty();
	    		 location.href ="content/msg_error.jsp?error="+errorMsg;
	    	}
	    });
	}
	</script>

</body>
</html>