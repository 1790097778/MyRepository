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
	String pageName=request.getParameter("page_name");
	pageName = "Welcome";
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
                   	 		if(true){%><%@include file="left/student_lesson.jsp"%><%;}
                    		if(true){%><%@include file="left/student_paper.jsp" %><%;}
							if(true){%><%@include file="left/student_grades.jsp" %><%;}
							if(true){%><%@include file="left/teacher_lesson.jsp" %><%;}
							if(true){%><%@include file="left/teacher_student.jsp" %><%;}
							if(true){%><%@include file="left/teacher_chat.jsp" %><%;}
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
	    $("#page-inner").empty();
	    $.ajax({
	    	async:true,
	    	type: "post",
	    	dataType:"json",
	    	data:send_data,
	    	url:mothod_name,
	    	beforeSend:function(){
	    		
	    	},
	    	success:function(data){
	    	    $("#page-inner").load(page_name,data,null);
	    	},
	    	error: function(){
	              //请求出错处理
	            alert("RequstError!");
	        }
	    });
	}
	</script>

</body>
</html>