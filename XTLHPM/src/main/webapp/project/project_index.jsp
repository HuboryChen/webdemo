<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
	<meta charset="UTF-8">
	<title>Document</title>
    <link href="../css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="../css/font-awesome.css?v=4.4.0" rel="stylesheet">
    <link href="../css/animate.css" rel="stylesheet">
    <link href="../css/style.css?v=4.1.0" rel="stylesheet">
    <link href="../css/plugins/bootstrap-table/bootstrap-table.min.css" rel="stylesheet">
    <link href="../css/plugins/footable/footable.core.css" rel="stylesheet">
    <style>
		.ibox {
			border: 1px solid #e7eaec;
			margin-bottom: 19px;
		}

		.mar_top {
			margin-top: 15px;
		}

		.height_half {
			height: 48%;
		}

		.height_ninety {
			height: 95%;
		}

		.height_eighty {
			height: 80%;
			overflow: auto;
		}

		.Progress {
			list-style: none;
			padding: 0;
		}

		.Progress li {
			width: 14%;
			float: left;
			background: #f0f0f0;
			padding-top: 5px;
			padding-bottom: 5px;
			text-align: center;
			background: url(../img/gray.png) no-repeat 100% 0 #E4E4E4;
		}

		.green {
			color: white;
			background-color: #29773A !important;
		}

		.green_img {
			color: white;
			background: url(../img/green.png) no-repeat 100% 0 #29773A  !important;
		}

		.green_img_orange {
			color: white;
			background: url(../img/orange.png) no-repeat 100% 0 #29773A !important;
		}

		.orange_img_gray {
			color: white;
			background: url(../img/gray.png) no-repeat 100% 0 #f59409 !important;
		}


    </style>
</head>
<body>
	<div class="row" style="height: 100%;">
		<div class="col-md-9 animated fadeInRight" style="height: 100%;padding-right: 0;">
			<div class="col-md-6 mar_top height_half">
				<div class="ibox float-e-margins height_ninety">
                    <div class="ibox-title">
                        <h5>项目总览</h5>
                        <!-- <div class="ibox-tools">
                            <a class="collapse-link">
                                <i class="fa fa-chevron-up"></i>
                            </a>
                        </div> -->
                    </div>
                    <div class="ibox-content height_eighty">
                		<table class="footable table table-stripped toggle-arrow-tiny" data-page-size="8">
                            <thead>
	                            <tr>

	                                <th data-toggle="true">项目名</th>
	                                <th>负责人</th>
	                                <th data-hide="all">团队成员</th>
	                                <th data-hide="all">项目模块名称</th>
	                                <th data-hide="all">项目来源</th>
	                                <th data-hide="all">项目描述</th>
	                                <th>状态</th>
	                            </tr>
                            </thead>
                            <tbody>
	                            <tr>
	                                <td>绩效考评管理系统</td>
	                                <td>袁岳</td>
	                                <td>袁岳&nbsp;张大富&nbsp;陈独秀&nbsp;</td>
	                                <td><span class="pie">项目绩效&nbsp;定期考评&nbsp;日常绩效&nbsp;分析报告&nbsp;系统管理</span></td>
	                                <td>内部项目</td>
	                                <td>公司内部考评专用</td>
	                                <td><span class="badge badge-primary">上线运行</span></td>
	                            </tr>
	                            <tr>
	                                <td>绩效考评管理系统</td>
	                                <td>付守永</td>
	                                <td>袁岳&nbsp;张大富&nbsp;陈独秀&nbsp;</td>
	                                <td><span class="pie">项目绩效&nbsp;定期考评&nbsp;日常绩效&nbsp;分析报告&nbsp;系统管理</span></td>
	                                <td>内部项目</td>
	                                <td>公司内部考评专用</td>
	                                <td><span class="badge badge-warning">开发中</span></td>
	                            </tr>
	                            <tr>
	                                <td>绩效考评管理系统</td>
	                                <td>张有为</td>
	                                <td>袁岳&nbsp;张大富&nbsp;陈独秀&nbsp;</td>
	                                <td><span class="pie">项目绩效&nbsp;定期考评&nbsp;日常绩效&nbsp;分析报告&nbsp;系统管理</span></td>
	                                <td>内部项目</td>
	                                <td>公司内部考评专用</td>
	                                <td><span class="badge badge-danger">停滞</span></td>
	                            </tr>
	                            <tr>
	                                <td>绩效考评管理系统</td>
	                                <td>李全福 </td>
	                                <td>袁岳&nbsp;张大富&nbsp;陈独秀&nbsp;</td>
	                                <td><span class="pie">项目绩效&nbsp;定期考评&nbsp;日常绩效&nbsp;分析报告&nbsp;系统管理</span></td>
	                                <td>内部项目</td>
	                                <td>公司内部考评专用</td>
	                                <td><span class="badge">已终止</span></td>
	                            </tr>
                            </tbody>
                            <!-- <tfoot>
    	                            <tr>
    	                                <td colspan="5">
    	                                    <ul class="pagination pull-right"></ul>
    	                                </td>
    	                            </tr>
                            </tfoot> -->
                        </table>
                    </div>
                </div>
			</div>
			<div class="col-md-6 mar_top height_half">
				<div class="ibox float-e-margins height_ninety">
                    <div class="ibox-title">
                        <h5>待办任务</h5>
                        <!-- <div class="ibox-tools">
                            <a class="collapse-link">
                                <i class="fa fa-chevron-up"></i>
                            </a>
                        </div> -->
                    </div>
                    <div class="ibox-content height_eighty">
                        <ul class="sortable-list connectList agile-list" style="padding-top: 0;">
                            <li class="warning-element">
                                绩效考核管理平台，页面设计
                                <div class="agile-detail">
                                    <a href="#" class="pull-right btn btn-xs btn-white">绩效考评管理系统</a>
                                    <i class="fa fa-clock-o"></i> 2018.03.15 ~ 2018.03.18
                                </div>
                            </li>
                            <li class="success-element">
                                绩效考核管理平台，数据库字段确立，讨论主要功能模块
                                <div class="agile-detail">
                                    <a href="#" class="pull-right btn btn-xs btn-white">绩效考评管理系统</a>
                                    <i class="fa fa-clock-o"></i> 2018.03.15 ~ 2018.03.18
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
			</div>
			<div class="col-md-12 height_half">
				<div class="ibox float-e-margins height_ninety">
                    <div class="ibox-title">
                        <h5>项目流程</h5>
                        <!-- <div class="ibox-tools">
                            <a class="collapse-link">
                                <i class="fa fa-chevron-up"></i>
                            </a>
                        </div> -->
                    </div>
                    <div class="ibox-content height_eighty">
                    	<table class="table">
                            <thead>
                                <tr>
                                    <th>项目名称</th>
                                    <th>项目进展阶段</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>绩效考核管理平台</td>
                                    <td>
                                    	<ul class="Progress">
                                    		<li class="green_img">立项</li>
                                    		<li class="green_img">需求分析</li>
                                    		<li class="green_img">总体设计</li>
                                    		<li class="green_img">详细设计</li>
                                    		<li class="green_img">编码及测试</li>
                                    		<li class="green_img">试运行</li>
                                    		<li class="green" style="background-image: none;">技术维保</li>
                                    	</ul>
                                    </td>
                                </tr>
                                <tr>
                                    <td>绩效考核管理平台</td>
                                    <td>
                                    	<ul class="Progress">
                                    		<li class="green_img">立项</li>
                                    		<li class="green_img">需求分析</li>
                                    		<li class="green_img">总体设计</li>
                                    		<li class="green_img_orange">详细设计</li>
                                    		<li class="orange_img_gray">编码及测试</li>
                                    		<li>试运行</li>
                                    		<li style="background-image: none;">技术维保</li>
                                    	</ul>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
			</div>
		</div>
		<div class="col-md-3 animated fadeInRight" style="height: 100%;padding-left: 0;">
			<div class="col-md-12 mar_top" style="height: 94%;">
				<div class="ibox float-e-margins" style="height: 100%">
	                <div class="ibox-title">
	                    <h5>已完成任务</h5>
	                    <!-- <div class="ibox-tools">
	                        <a class="collapse-link">
	                            <i class="fa fa-chevron-up"></i>
	                        </a>
	                    </div> -->
	                </div>
	                <div class="ibox-content" style="height: 90%;overflow: auto;">
                        <ul class="sortable-list connectList agile-list" style="padding-top: 0;">
                            <li class="warning-element">
                                绩效考核管理平台，页面设计
                                <div class="agile-detail">
                                    <a href="#" class="pull-right btn btn-xs btn-white">绩效考评管理系统</a>
                                    <i class="fa fa-clock-o"></i> 2018.03.15 ~ 2018.03.18
                                </div>
                            </li>
                            <li class="success-element">
                                绩效考核管理平台，数据库字段确立，讨论主要功能模块
                                <div class="agile-detail">
                                    <a href="#" class="pull-right btn btn-xs btn-white">绩效考评管理系统</a>
                                    <i class="fa fa-clock-o"></i> 2018.03.15 ~ 2018.03.18
                                </div>
                            </li>
                            <li class="info-element">
                                绩效考核管理平台，数据库字段确立，讨论主要功能模块
                                <div class="agile-detail">
                                    <a href="#" class="pull-right btn btn-xs btn-white">绩效考评管理系统</a>
                                    <i class="fa fa-clock-o"></i> 2018.03.15 ~ 2018.03.18
                                </div>
                            </li>
                            <li class="danger-element">
                                绩效考核管理平台，页面设计
                                <div class="agile-detail">
                                    <a href="#" class="pull-right btn btn-xs btn-white">绩效考评管理系统</a>
                                    <i class="fa fa-clock-o"></i> 2018.03.15 ~ 2018.03.18
                                </div>
                            </li>
                            <li class="warning-element">
                                绩效考核管理平台，页面设计
                                <div class="agile-detail">
                                    <a href="#" class="pull-right btn btn-xs btn-white">绩效考评管理系统</a>
                                    <i class="fa fa-clock-o"></i> 2018.03.15 ~ 2018.03.18
                                </div>
                            </li>
                            <li class="success-element">
                                绩效考核管理平台，数据库字段确立，讨论主要功能模块
                                <div class="agile-detail">
                                    <a href="#" class="pull-right btn btn-xs btn-white">绩效考评管理系统</a>
                                    <i class="fa fa-clock-o"></i> 2018.03.15 ~ 2018.03.18
                                </div>
                            </li>
                            <li class="info-element">
                                绩效考核管理平台，数据库字段确立，讨论主要功能模块
                                <div class="agile-detail">
                                    <a href="#" class="pull-right btn btn-xs btn-white">绩效考评管理系统</a>
                                    <i class="fa fa-clock-o"></i> 2018.03.15 ~ 2018.03.18
                                </div>
                            </li>
                            <li class="danger-element">
                                绩效考核管理平台，页面设计
                                <div class="agile-detail">
                                    <a href="#" class="pull-right btn btn-xs btn-white">绩效考评管理系统</a>
                                    <i class="fa fa-clock-o"></i> 2018.03.15 ~ 2018.03.18
                                </div>
                            </li>
                        </ul>
	                </div>
	            </div>
			</div>
		</div>
	</div>





    <!-- 全局js -->
    <script src="../js/jquery.min.js"></script>
    <script src="../js/bootstrap.min.js?v=3.3.6"></script>


    <!-- Peity -->
    <script src="../js/plugins/peity/jquery.peity.min.js"></script>

    <!-- 自定义js -->
    <script src="../js/content.js?v=1.0.0"></script>


    <!-- Bootstrap table -->
    <script src="../js/plugins/bootstrap-table/bootstrap-table.min.js"></script>
    <script src="../js/plugins/bootstrap-table/bootstrap-table-mobile.min.js"></script>
    <script src="../js/plugins/bootstrap-table/locale/bootstrap-table-zh-CN.min.js"></script>

    <script src="../js/plugins/jquery-ui/jquery-ui.min.js"></script>
    <script src="../js/plugins/footable/footable.all.min.js"></script>

    <!-- iCheck -->
    <script src="../js/plugins/iCheck/icheck.min.js"></script>

    <!-- Peity d data  -->
    <script src="../js/demo/peity-demo.js"></script>
    <script>
        $(document).ready(function() {

            $('.footable').footable();
            $('.footable2').footable();

        });

    </script>


</body>
</html>