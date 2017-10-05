<%@page pageEncoding="UTF-8"%>

<li class="dropdown">
    <a class="dropdown-toggle" data-toggle="dropdown" href="#" aria-expanded="false">
        <i class="fa fa-tasks fa-fw"></i> <i class="fa fa-caret-down"></i>
    </a>
    <ul class="dropdown-menu dropdown-tasks">
        <li>
            <a onclick="loadView('content/student_task_detail.jsp','aaa',{id:3})">
                <div>
                    <p>
                        <strong>Task 1</strong>
                        <span class="pull-right text-muted">60% Complete</span>
                    </p>
                    <div class="progress progress-striped active">
                        <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%">
                            <span class="sr-only">60% Complete (success)</span>
                        </div>
                    </div>
                </div>
            </a>
        </li>
        <li class="divider"></li>
        <li>
            <a class="text-center" onclick="loadView('content/student_task.jsp','aaa',{id:3})">
                <strong>See All Tasks</strong>
                <i class="fa fa-angle-right"></i>
            </a>
        </li>
    </ul>
    <!-- /.dropdown-tasks -->
</li>