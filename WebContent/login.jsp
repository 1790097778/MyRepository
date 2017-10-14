<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>湖北工业大学-毕业设计系统</title>

<link href="assets/other/font-awesome.min.css" rel="stylesheet">
<link href="assets/other/jquery.fancybox.min.css" rel="stylesheet">
<link type="text/css" href="assets/other/play.built.181cf08c.cache.css"rel="stylesheet" media="all">

<link type="text/css" href="assets/other/global_main.css" rel="stylesheet">
<link type="text/css" href="assets/other/global_fonts.css" rel="stylesheet">
<link type="text/css" href="assets/other/styles.css" rel="stylesheet">

<!-- jQuery Js -->
<script src="assets/js/jquery-1.10.2.js"></script>
</head>

<%
/*
登录界面说明：用户输入用户名（name）和密码（password）后，以POST方式传至loginIn进行处理。
若登录成功，loginIn 应将用户的界面左侧功能列表，和顶部功能列表存储至session，然后跳转至main.jsp.
若登录失败，loginIn 应将错误类型返回至login.jsp: 用户名错误返回{errorType:"name"}, 密码错误返回{errorType:"password"}

备注：session页面功能参数说明，参数left为左侧显示的控制参数，他是一个boolean类型的一维数组，参数top为顶部功能列表选择显示的参数，它也是一个boolean类型的参数，具体的数组与功能控制的对应关系，等所有页面写出来和所有功能做出来再行规定

PS：{name1:value1,name2:value2}表示两个参数，其中参数1（name1）的值为value1、参数2（name2）的值为value2。
以后我页面提交的参数和需要返回什么参数我就已这种形式备注在页面头部，在写相应页面的处理时，要记得先看头部的说明，省的你自己看HTML看半天。。。。

然后push的备注最好以此格式：[year+month+day]/[hour:minute][By+NAME]+特殊备注       例：20170925/21:03ByZhu
*/
%>
<body class="body_UQVCAY" data-c_tl_id="M_c54ddfcffb39c610">
	<%
		String e = request.getParameter("error");
		if(e != null){
			if(e.equals("name")){%><script type="text/javascript">alert("没有此用户，请检查账号！");</script><%;}
			if(e.equals("password")){%><script type="text/javascript">alert("密码错误！");</script><%;}
			if(e.equals("unlogin")){%><script type="text/javascript">alert("请先登录！");</script><%;}
		}
	%>
	
	<div class="container-fluid c-section section_Wl9Fwc c-scrollIn"
		data-c_tl_id="M_79e0641cd4978a2071666829f62732d1">
		<div class="container c-container container_1oVg7Q">
			<div class="row c-row row_Kjbz8z">
				<div
					class="col-lg-6 col-md-6 col-sm-6 col-xs-12 c-column column_EXJ39w">
					<p class="paragraph_ziD2v8">登陆：</p>
						<label class="c-label label_hq1X7i">账号: </label>
						<input autofocus="True" class="c-input input_ju04Ga" placeholder="请输入账号" required="True" type="text" id="name">
						<label class="c-label label_3UG6Ic">密码: </label>
						<input class="c-input input_8FlkY6" title="请填写密码" placeholder="请输入密码" required="True" type="password" id="password">
						<div class="checkbox c-checkbox checkbox_HIxYhD">
							<input class="c-checkbox-input checkboxinput_rJ8h62" name="keepload" type="checkbox">
							<label class="c-form-label formlabel_JHMH8L">保持登陆</label>
						</div>
						<label class="c-label label_pkAnzK">忘记密码？</label>
						<button class="submit_n7xCQ7" onclick="cheak()">登录</button>
				</div>
				<div
					class="col-lg-6 col-md-6 col-sm-6 col-xs-12 c-column column_mvZe5k">
					<p class="paragraph_vKAEtn">湖北工业大学（Hubei University of
						Technology）坐落在有“九省通衢”之称的中部地区中心城市——武汉，是一所以工学为特色，覆盖工学、文学、理学、艺术学、经济学、管理学、法学和教育学等八大学科门类的省属重点多科性大学。学校是湖北省重点建设高校，湖北省“2011计划”牵头高校，武器装备科研生产单位二级保密资质认证高校，教育部本科教学工作水平评估优秀高校，被湖北省委省政府定位为“在湖北省高教体系中起龙头示范作用的、水平较高的骨干大学”。2010年荣获“全国毕业生就业典型经验高校”称号；2011年获批教育部“卓越工程师教育培养计划”高校；2012年、2016年连续两次入选国家“中西部高校基础能力建设工程”；2017年正式成为由教育部、国家外国专家局联合实施的“111计划”高校名单中的一员。</p>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript">
	function cheak(){
		var name=document.getElementById("name");
		var password=document.getElementById("password");
		if(name.value==""){name.focus();return 0;}
		if(password.value==""){password.focus();return 0;}
		if(10>11){
			name.empty();
			name.focus();
			return 0;
		}
		login("login/loginIn.do",{name:name.value,password:password.value});
	}
	function login(mothod_name,send_data){
	    $.ajax({
	    	global:false,
	    	async:true,
	    	type: "post",
	    	dataType:"json",
	    	data:send_data,
	    	url:mothod_name,
	    	beforeSend:function(){
	    	},
	    	success:function(data){
	    		if(data.error=="name")alert("没有此用户，请检查账号！");
	    		if(data.error=="password")alert("密码错误！");
	    		if(data.error=="success"){
	    			location.href ="main.jsp";
	    		}
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