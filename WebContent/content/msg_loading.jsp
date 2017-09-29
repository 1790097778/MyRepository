<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Loading...</title>
<style type="text/css">
.loadText{
	text-align: center;
    margin-top: 20%;
    color: rgb(32, 31, 36);
    font-size: 30px;
}
</style>
</head>
<body>
<div class="loadText ">
	<img id="currentImg" onload="alog && alog('speed.set', 'c_firstPageComplete', +new Date); alog.fire && alog.fire('mark');" src="assets/data/load.gif" width="115" height="115" style="top: 82px; left: 181px; width: 128px; height: 128px;" log-rightclick="p=5.102" title>
</div>
</body>
</html>