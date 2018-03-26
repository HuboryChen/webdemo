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
    <style>
        .ibox {
            border: 1px solid #e7eaec;
            margin-bottom: 19px;
        }

        .mar_top {
            margin-top: 15px;
        }
    </style>
</head>
<body>
    <div class="row" class="margin: 0 auto;">
        <div class="col-md-3 mar_top animated fadeInRight">
            <div class="col-md-12">
                <div class="ibox float-e-margins">
                    <div class="ibox-title">
                        <h5>项目成员姓名</h5>
                    </div>
                    <div class="ibox-content">
                            <table class="table">
                                <thead>
                                    <tr>
                                        <th>#</th>
                                        <th>姓名</th>
                                        <th>性别</th>
                                        <th>年龄</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td>1</td>
                                        <td>张三</td>
                                        <td>男</td>
                                        <td>23</td>
                                    </tr>
                                    <tr>
                                        <td>2</td>
                                        <td>李四</td>
                                        <td>男</td>
                                        <td>27</td>
                                    </tr>
                                    <tr>
                                        <td>3</td>
                                        <td>王麻子</td>
                                        <td>男</td>
                                        <td>65</td>
                                    </tr>
                                    <tr>
                                        <td>1</td>
                                        <td>张三</td>
                                        <td>男</td>
                                        <td>23</td>
                                    </tr>
                                    <tr>
                                        <td>2</td>
                                        <td>李四</td>
                                        <td>男</td>
                                        <td>27</td>
                                    </tr>
                                    <tr>
                                        <td>3</td>
                                        <td>王麻子</td>
                                        <td>男</td>
                                        <td>65</td>
                                    </tr>
                                    <tr>
                                        <td>1</td>
                                        <td>张三</td>
                                        <td>男</td>
                                        <td>23</td>
                                    </tr>
                                    <tr>
                                        <td>2</td>
                                        <td>李四</td>
                                        <td>男</td>
                                        <td>27</td>
                                    </tr>
                                    <tr>
                                        <td>3</td>
                                        <td>王麻子</td>
                                        <td>男</td>
                                        <td>65</td>
                                    </tr>
                                    <tr>
                                        <td>1</td>
                                        <td>张三</td>
                                        <td>男</td>
                                        <td>23</td>
                                    </tr>
                                    <tr>
                                        <td>1</td>
                                        <td>张三</td>
                                        <td>男</td>
                                        <td>23</td>
                                    </tr>
                                </tbody>
                            </table>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-md-9 mar_top animated fadeInRight">
            <div class="col-md-12">
                <div class="ibox-content" style="border: 1px solid #e9e9e9;margin-bottom: 15px;padding-bottom: 10px;">
                    <div class="row">
                        <div class="col-md-4">
                            <p class="col-md-4" style="text-align: right;">项目搜索：</p>
                            <select name="" id="" class="col-md-8">
                                <option value="#">项目一</option>
                                <option value="#">项目二</option>
                                <option value="#">项目三</option>
                                <option value="#">项目四</option>
                            </select>
                        </div>
                        <div class="col-md-4">
                            <p class="col-md-4" style="text-align: right;">任务搜索：</p>
                            <select name="" id="" class="col-md-8">
                                <option value="#">任务一</option>
                                <option value="#">任务二</option>
                                <option value="#">任务三</option>
                                <option value="#">任务四</option>
                            </select>
                        </div>
                    </div>
                    <!-- <div class="row">
                        <div class="col-md-12">
                            <div class="form-group">
                                <label class="col-md-2 control-label">项目搜索：</label>
                                <div class="col-md-3">
                                    <select name="account" class="form-control m-b">
                                        <option value="#">项目一</option>
                                        <option value="#">项目二</option>
                                        <option value="#">项目三</option>
                                        <option value="#">项目四</option>
                                    </select>
                                </div>
                                <label class="col-md-2 control-label">项目搜索：</label>
                                <div class="col-md-3">
                                    <select name="account" class="form-control m-b">
                                        <option value="#">项目一</option>
                                        <option value="#">项目二</option>
                                        <option value="#">项目三</option>
                                        <option value="#">项目四</option>
                                    </select>
                                </div>
                            </div>
                        </div>
                    </div> -->
                </div>
            </div>
            <div class="col-md-8">
                <div class="ibox float-e-margins">
                    <div class="ibox-title">
                        <h5>任务得分情况图表</h5>
                    </div>
                    <div class="ibox-content" style="height: 409px;">
                    </div>
                </div>
            </div>
            <div class="col-md-4">
                <div class="ibox float-e-margins">
                    <div class="ibox-title">
                        <h5>任务评价</h5>
                    </div>
                    <div class="ibox-content" style="height: 409px;">
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- 全局js -->
    <script src="../js/jquery.min.js"></script>
    <script src="../js/bootstrap.min.js?v=3.3.6"></script>
</body>
</html>
