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
    <style>
        .ibox {
            margin-bottom: 0px;
        }

        .font-right {
            text-align: right;
            white-space: nowrap;
        }

        .font-left {
            text-align: left;
        }

        .close_panel {
            width: 100%;
            height: 30px;
            background: #1a5087;
            color: white;
            line-height: 30px;
            text-align: center;
            cursor: pointer;
        }

        .close_panel:hover {
            background: #3673b1;
        }

        .info_panel {
            width: 0;
            height: 100%;
            /*border: 1px solid red;*/
            position: absolute;
            top: 0;
            right: 0;
            z-index: 100;
            background: white;
            box-shadow: 0 0 4px #a39b9b;
            /*display: none;*/
            transition:width 2s;
        }
				.table{
					margin-bottom:0;
				}
    </style>
</head>
<body>
    <div class="row" style="height: 60%;">
        <div class="col-sm-12 animated fadeInRight">
            <div class="ibox float-e-margins">
                <div class="ibox-content">
                    <div class="row">
                        <button class="btn btn-primary project_list" style="float: left;margin-left: 15px;">任务分配</button>
                        <div class="col-sm-3" style="float: right;">
                            <div class="input-group">
                                <input type="text" placeholder="请输入项目名" class="input-sm form-control"> <span class="input-group-btn">
                                    <button type="button" class="btn btn-sm btn-primary"> 搜索</button> </span>
                            </div>
                        </div>
                    </div>
                    <div class="table-responsive"><table class="table">
                        <table class="table table-bordered">
                            <thead>
                                <tr>
                                    <th>所属项目名称</th>
                                    <th>项目模块名称</th>
                                    <th>开发人姓名</th>
                                    <th>任务分配时间</th>
                                    <th>审核人姓名</th>
                                    <th>审核时间</th>
                                    <th>完成提交时间</th>
                                    <th>操作</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>运费保理</td>
                                    <td>系统管理</td>
                                    <td>张三</td>
                                    <td>2018.03.15</td>
                                    <td>李四</td>
                                    <td>2018.03.19</td>
                                    <td>2018.03.18</td>
                                    <td></td>
                                </tr>
                                <tr>
                                    <td>运费保理</td>
                                    <td>系统管理</td>
                                    <td>张三</td>
                                    <td>2018.03.15</td>
                                    <td>李四</td>
                                    <td>2018.03.19</td>
                                    <td>2018.03.18</td>
                                    <td></td>
                                </tr>
                                <tr>
                                    <td>运费保理</td>
                                    <td>系统管理</td>
                                    <td>张三</td>
                                    <td>2018.03.15</td>
                                    <td>李四</td>
                                    <td>2018.03.19</td>
                                    <td>2018.03.18</td>
                                    <td></td>
                                </tr>
                                <tr>
                                    <td>运费保理</td>
                                    <td>系统管理</td>
                                    <td>张三</td>
                                    <td>2018.03.15</td>
                                    <td>李四</td>
                                    <td>2018.03.19</td>
                                    <td>2018.03.18</td>
                                    <td></td>
                                </tr>
                                <tr>
                                    <td>运费保理</td>
                                    <td>系统管理</td>
                                    <td>张三</td>
                                    <td>2018.03.15</td>
                                    <td>李四</td>
                                    <td>2018.03.19</td>
                                    <td>2018.03.18</td>
                                    <td></td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>


    <div id="main" class="row" style="margin: 0 auto;height: 40%;">
        <div class="col-sm-12 animated fadeInRight">
            <div class="ibox float-e-margins" style="border: 1px solid #e7eaec;">
                <div id="top_height" class="ibox-title">
                    <h5>详情</h5>
                </div>
                <div id="main_bottom" class="ibox-content">
                    <div class="row">
                        <div class="col-md-3">
                            <p class="col-md-5 font-right">
                                项目名称:
                            </p>
                            <p class="col-md-7 font-left">
                                绩效考评管理系统
                            </p>
                        </div>
                        <div class="col-md-3">
                            <p class="col-md-5 font-right">
                                项目模块名称:
                            </p>
                            <p class="col-md-7 font-left">
                                系统管理
                            </p>
                        </div>
                        <div class="col-md-3">
                            <p class="col-md-5 font-right">
                                开发人姓名:
                            </p>
                            <p class="col-md-7 font-left">
                                王莽
                            </p>
                        </div>
                        <div class="col-md-3">
                            <p class="col-md-5 font-right">
                                任务分配时间:
                            </p>
                            <p class="col-md-7 font-left">
                                2018.03.16
                            </p>
                        </div>
                        <div class="col-md-3">
                            <p class="col-md-5 font-right">
                                要求完成时间:
                            </p>
                            <p class="col-md-7 font-left">
                                2018.03.18
                            </p>
                        </div>
                        <div class="col-md-3">
                            <p class="col-md-5 font-right">
                                完成提交时间:
                            </p>
                            <p class="col-md-7 font-left">
                                2018.03.18
                            </p>
                        </div>
                        <div class="col-md-6">
                            <p class="col-md-3 font-right" style="width: 20%;">
                                完成提交描述:
                            </p>
                            <p class="col-md-9 font-left">
                                --
                            </p>
                        </div>
                        <div class="col-md-3">
                            <p class="col-md-5 font-right">
                                进度评价:
                            </p>
                            <p class="col-md-7 font-left">
                                --
                            </p>
                        </div>
                        <div class="col-md-3">
                            <p class="col-md-5 font-right">
                                质量评价:
                            </p>
                            <p class="col-md-7 font-left">
                                --
                            </p>
                        </div>
                        <div class="col-md-6">
                            <p class="col-md-3 font-right" style="width: 20%;">
                                评价描述:
                            </p>
                            <p class="col-md-9 font-left">
                                --
                            </p>
                        </div>
                        <div class="col-md-3">
                            <p class="col-md-5 font-right">
                                任务完成得分:
                            </p>
                            <p class="col-md-7 font-left">
                                98
                            </p>
                        </div>
                        <div class="col-md-3">
                            <p class="col-md-5 font-right">
                                审核人姓名:
                            </p>
                            <p class="col-md-7 font-left">
                                赵秦
                            </p>
                        </div>
                        <div class="col-md-3">
                            <p class="col-md-5 font-right">
                                审核时间:
                            </p>
                            <p class="col-md-7 font-left">
                                2018.03.18
                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <div class="info_panel">
        <div class="close_panel" >
            关闭
        </div>
        <form class="form-horizontal form_none" style="padding: 10px;display: none;">
            <div class="form-group">
                <label class="col-sm-4 control-label font-right" style="width: 31.5%;">项目名称:</label>
                <div class="col-sm-8" style="padding-left: 22px;padding-right: 10px;">
                    <input class="form-control" placeholder="请输入项目名称" type="text">
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-4 control-label font-right">项目模块名称：</label>
                <div class="col-sm-8">
                    <input class="form-control" placeholder="请输入项目模块名称" type="text">
                </div>
            </div>
            <div class="form-group" style="margin-bottom: 0;">
                <label class="col-sm-4 control-label font-right">开发人姓名：</label>
                <div class="col-sm-8">
                    <select name="" id="" class="form-control m-b">
                        <option value="#">成员一</option>
                        <option value="#">成员二</option>
                        <option value="#">成员三</option>
                        <option value="#">成员四</option>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-4 control-label font-right">任务分配时间：</label>
                <div class="col-sm-8">
                    <input class="form-control" placeholder="请输入任务分配时间" type="text">
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-4 control-label font-right">要求完成时间：</label>
                <div class="col-sm-8">
                    <input class="form-control" placeholder="请输入要求完成时间" type="text">
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-4 control-label font-right" style="width: 31.5%;">审核人姓名:</label>
                <div class="col-sm-8" style="padding-left: 22px;padding-right: 10px;">
                    <input class="form-control" placeholder="请输入审核人姓名" type="text">
                </div>
            </div>
            <button class="btn btn-w-m btn-primary sola" style="position: absolute;border: 0;right: 50%;margin-right: -70px;">创建</button>
        </form>
    </div>


    <!-- 全局js -->
    <script src="../js/jquery.min.js"></script>
    <script src="../js/bootstrap.min.js?v=3.3.6"></script>

    <!-- 自定义js -->
    <script src="js/content.js?v=1.0.0"></script>


    <!-- Bootstrap table -->
    <script src="../js/plugins/bootstrap-table/bootstrap-table.min.js"></script>
    <script src="../js/plugins/bootstrap-table/bootstrap-table-mobile.min.js"></script>
    <script src="../js/plugins/bootstrap-table/locale/bootstrap-table-zh-CN.min.js"></script>

    <!-- Peity -->
    <script src="../js/bootstrap-table-demo.js"></script>

    <script>
        $(function(){
            var mainHeight = $("#main").outerHeight();
            var top_height = $("#top_height").outerHeight();
            var bottom_height = mainHeight - top_height - 50;
            $("#main_bottom").height(bottom_height);


            $(".project_list").click(function(){
                // $(".panel_width").css({
                //     "width":"75%"
                // })

                $(".form_none").css({
                    "display":"block"
                });

                $(".info_panel").css({
                    "width":"25%"
                });
            });

            $(".close_panel").click(function(){
                $(".info_panel").css({
                    "width":"0",
                    "overflow":"hidden"
                });
            });
        })
    </script>
</body>
</html>
