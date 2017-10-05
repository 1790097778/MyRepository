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
					我的课题
				</div>
			</div>
			<div class="panel-body">
				<div class="table-responsive">
					<!-- 此处填充内容 -->
					<table class="table table-striped table-bordered table-hover" id="dataTables-example">
						<thead>
							<tr>
								<th>课题编号</th>
								<!-- <th>出题人</th> -->
								<th>课程名称</th>
								<th>课程类型</th>
								<th>院系</th>
								<th>详情</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody>
							<tr class="gradeX">
								<td>0002405</td>
								<td>叶绿体的能量转换率</td>
								<td>科研项目</td>
								<td class="center">理学院</td>
								<td class="redstyle"><a onclick="loadView('content/student_lesson_detail.jsp','aaa',{id:3})">查看详情</a></td>
								<td class="center"><button onclick="loadView('content/student_lesson_choose.jsp','aaa',{id:3})">放弃选题</button></td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
		<!--End Advanced Tables -->
	</div>
</div>
</body>
</html>