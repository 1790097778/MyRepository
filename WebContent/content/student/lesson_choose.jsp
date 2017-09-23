<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title></title>
    <style>
        .header{
            /*background-color: red;*/
            padding: 10px 10px;
            border-bottom:1px solid black;
        }
        .inner{
            padding:10px 20px;
        }
    </style>
</head>
<body>
        <div class="row">
            <div class="col-md-12">
                <div class="header">&nbsp <a href="#">审核网页</a>>发布公告</div>
            </div>

            <div class="inner"><div class="form-group">
                <label>公告：</label>
                <textarea class="form-control" rows="3"> :<%=request.getParameter("name")%>，<%=request.getParameter("age") %></textarea>
            </div> </div>
            <div class="inner"><a href="#" class="btn btn-primary btn-sm">发送</a></div>
        </div>
        <!-- /. ROW  -->
</body>
</html>