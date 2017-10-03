<%@page pageEncoding="UTF-8"%>

<li class="dropdown">
	<a class="dropdown-toggle"
		data-toggle="dropdown" href="#" aria-expanded="false">
		<i class="fa fa-envelope fa-fw"></i>
		<i class="fa fa-caret-down"></i>
	</a>
	<ul class="dropdown-menu dropdown-messages">
		<li>
			<a href="#">
				<div>
					<strong>张老师</strong>
					<span class="pull-right text-muted">
						<em>2017.10.03</em>
					</span>
				</div>
				<div>Lorem Ipsum has been the industry's standard dummy text ever since the 1500s...</div>
			</a>
		</li>
		<li class="divider"></li>

		<li>
			<a class="text-center" onclick="loadView('content/student_chat.jsp','aaa',{id:3})">
				<strong>所有消息</strong>
				<i class="fa fa-angle-right"></i>
			</a>
		</li>
	</ul> <!-- /.drop down-messages -->
</li>