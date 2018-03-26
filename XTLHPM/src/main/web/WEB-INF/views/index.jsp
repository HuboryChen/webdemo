<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">


    <title>绩效考核管理系统</title>

    <link rel="shortcut icon" href="favicon.ico"> <link href="css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="css/font-awesome.css?v=4.4.0" rel="stylesheet">
    <link href="css/animate.css" rel="stylesheet">
    <link href="css/style.css?v=4.1.0" rel="stylesheet">
    <link href="css/index.css?v=4.1.0" rel="stylesheet">



</head>

<body class="gray-bg top-navigation">

    <div id="wrapper">
        <div id="page-wrapper" class="gray-bg">
            <div id="top" class="row border-bottom white-bg">
            	<div style="padding-top: 5px;padding-bottom:5px;background: #114f8e;;color: white;">
            		<p style="margin: 0;display: inline-block;font-size: 18px;font-weight: 600;padding-left: 15px;">绩效考评管理系统</p>
            		<a href="#" style="float: right;margin-right: 10px;color: #9e9e9e;margin-left: 5px;line-height: 35px;font-size: 15px;">[退出]</a>
            		<p style="    float: right;line-height: 35px;font-size: 15px;font-weight: 600;">管理员</p>
            	</div>
                <nav class="navbar " role="navigation">
                    <ul id="list">
                        <li class="lis">
                            <span class="">项目绩效</span>
                            <ul>
                                <li><a class="sectitle" id="trigger" href="#">项目首页</a></li>
                                <li><a href="#">项目列表</a></li>
                                <li><a href="#">任务分配</a></li>
                                <li><a href="#">绩效考评</a></li>
                                <li><a href="#">数据分析</a></li>
                            </ul>
                        </li>
                        <li class="lis">
                            <span class="">定期考评</span>
                            <ul>
                                <li><a class="sectitle" href="#">考评结果</a></li>
                                <li><a href="#">数据分析</a></li>
                            </ul>
                        </li>
                        <li class="lis">
                            <span class="">日常绩效</span>
                            <ul>
                                <li><a class="sectitle" href="#">列表展示</a></li>
                                <li><a href="#">数据分析</a></li>
                           </ul>
                        </li>
                        <li class="lis">
                            <span class="">分析报告</span>
                            <ul>
                                <li><a class="sectitle" href="#">分析报告</a></li>
                            </ul>
                        </li>
                        <li class="lis">
                            <span class="">系统管理</span>
                            <ul>
                                <li><a class="sectitle" href="#">团队成员</a></li>
                                <li><a href="#">角色权限</a></li>
                                <li><a href="#">系统日志</a></li>
                           </ul>
                        </li>
                    </ul>
                </nav>
            </div>



			<iframe id="main" src="project/project_index.jsp" frameborder="0" width="100%"></iframe>



            <div id="botton" class="footer">
                <div class="pull-right">
                    By：<a href="http://www.zi-han.net" target="_blank">zihan's blog</a>
                </div>
                <div>
                    <strong>Copyright</strong> H+ &copy; 2014
                </div>
            </div>

        </div>
    </div>



    <!-- 全局js -->
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js?v=3.3.6"></script>



    <!-- 自定义js -->
    <script src="js/content.js?v=1.0.0"></script>
    <script src="js/index.js"></script>


    <!-- Flot -->





</body>

</html>
