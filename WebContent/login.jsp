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

<script type="text/javascript" language="javascript">
function cheak(){
	
}
</script>

</head>


<body class="body_UQVCAY" data-c_tl_id="M_c54ddfcffb39c610">
	<%
		String e = request.getParameter("e");
		if(e==null){%><script type="text/javascript">alert("sdasda");</script><%;}
		else{
			if(e.equals("name")){%><script type="text/javascript">alert("没有此用户，请检查账号！");</script><%;}
	  		if(e.equals("password")){%><script type="text/javascript">alert("密码错误！");</script><%;}
	  		%><script type="text/javascript">El</script><% 
		}
	%>
	
	<div class="container-fluid c-section section_Wl9Fwc c-scrollIn"
		data-c_tl_id="M_79e0641cd4978a2071666829f62732d1">
		<div class="container c-container container_1oVg7Q">
			<div class="row c-row row_Kjbz8z">
				<div
					class="col-lg-6 col-md-6 col-sm-6 col-xs-12 c-column column_EXJ39w">
					<p class="paragraph_ziD2v8">登陆：</p>
					<form
						action="main.jsp" class="c-form form_mgltEd" data-redirect="/success" method="post"
						name="form" onsubmit="cheak()">
						<label class="c-label label_hq1X7i">账号: </label><input
							autofocus="True" class="c-input input_ju04Ga" name="name"
							placeholder="请输入账号" required="True" type="text"><label
							class="c-label label_3UG6Ic">密码:</label>
							<input class="c-input input_8FlkY6" title="请填写密码" name="password" placeholder="请输入密码"
							required="True" type="password">
						<div class="checkbox c-checkbox checkbox_HIxYhD">
							<input class="c-checkbox-input checkboxinput_rJ8h62"
								name="keepload" type="checkbox"><label
								class="c-form-label formlabel_JHMH8L">保持登陆</label>
						</div>
						<label class="c-label label_pkAnzK">忘记密码？</label>
						<button class="submit_n7xCQ7" name="" type="submit" wait="">登录</button>
					</form>
				</div>
				<div
					class="col-lg-6 col-md-6 col-sm-6 col-xs-12 c-column column_mvZe5k">
					<p class="paragraph_vKAEtn">湖北工业大学（Hubei University of
						Technology）坐落在有“九省通衢”之称的中部地区中心城市——武汉，是一所以工学为特色，覆盖工学、文学、理学、艺术学、经济学、管理学、法学和教育学等八大学科门类的省属重点多科性大学。学校是湖北省重点建设高校，湖北省“2011计划”牵头高校，武器装备科研生产单位二级保密资质认证高校，教育部本科教学工作水平评估优秀高校，被湖北省委省政府定位为“在湖北省高教体系中起龙头示范作用的、水平较高的骨干大学”。2010年荣获“全国毕业生就业典型经验高校”称号；2011年获批教育部“卓越工程师教育培养计划”高校；2012年、2016年连续两次入选国家“中西部高校基础能力建设工程”；2017年正式成为由教育部、国家外国专家局联合实施的“111计划”高校名单中的一员。</p>
				</div>
			</div>
		</div>
	</div>
</body>
</html>