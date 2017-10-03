<%@page pageEncoding="UTF-8"%>

<li class="dropdown">
    <a class="dropdown-toggle" data-toggle="dropdown" href="#" aria-expanded="false">
        <i class="fa fa-user fa-fw"></i> <i class="fa fa-caret-down"></i>
    </a>
    <ul class="dropdown-menu dropdown-user">
        <li><a onclick="loadView('content/user_info.jsp','aaa',{id:3})"><i class="fa fa-user fa-fw"></i> 个人信息</a>
        </li>
        <li><a onclick="loadView('content/user_changepassword.jsp','aaa',{id:3})"><i class="fa fa-gear fa-fw"></i> 个人设置</a>
        </li>
        <li class="divider"></li>
        <li><a href="login.jsp"><i class="fa fa-sign-out fa-fw"></i> 注销登录</a>
        </li>
    </ul>
    <!-- /.dropdown-user -->
</li>