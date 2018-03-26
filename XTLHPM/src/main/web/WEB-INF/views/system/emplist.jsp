<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">


    <title>团队成员</title>
    <meta name="keywords" content="">
    <meta name="description" content="">

    <link rel="shortcut icon" href="favicon.ico">
    <link href="../css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="../css/font-awesome.css?v=4.4.0" rel="stylesheet">

    <link href="../css/animate.css" rel="stylesheet">
    <link href="../css/style.css?v=4.1.0" rel="stylesheet">
    <style>
        #modal-form .col-sm-4{
          padding-right: 0;
        }
        #modal-form .col-sm-8{
          padding-left: 0;
          padding-bottom:5px;
        }
        #modal-form  img{
          padding-top:10px;
          padding-bottom:10px;
        }
        .m-btn span{
          display: inline-block;
          padding:8px 15px;
          border-radius: 5px;
        }
    </style>

</head>

<body class="gray-bg">
    <div class="wrapper wrapper-content animated ">
        <div class="row">
            <div class="col-sm-4">
                <div class="contact-box">
                        <div class="col-sm-4">
                            <div class="text-center">
                                <img alt="image" class="img-circle m-t-xs img-responsive" src="../img/1.png">
                            </div>
                        </div>
                        <div class="col-sm-8">
                            <h3><strong>北京星通联华</strong></h3>
														<h5>研发部</h5>
														<p class="text-danger">
                                  <i class="fa fa-plus"></i>
                                   <a data-toggle="modal" class="" href="emplist.html#modal-form">新增员工</a>
                             </p>
                            <address style="opacity:0;">
		                            <a href=""></a><br>
		                            <abbr title="Phone">111
                            </address>

                        </div>
                        <div class="clearfix"></div>
                </div>
            </div>

						<div class="col-sm-4">
                <div class="contact-box">
                        <div class="col-sm-4">
                            <div class="text-center">
                                <img alt="image" class="img-circle m-t-xs img-responsive" src="../img/2.png">
																	<h3>某某</h3>
                                <div class="m-t-xs font-bold text-danger"><a href="">修改</a></div>
                            </div>
                        </div>
                        <div class="col-sm-8">
                            <h3><strong>北京星通联华</strong></h3>
														<h5>研发部</h5>
                            <p><i class="fa fa-circle"></i>飞人只会跳</p>
                            <address>
                            邮箱:<a href=""></a><br>
                            <abbr title="Phone">手机</abbr> (123) 456-7890
                        </address>
                        </div>
                        <div class="clearfix"></div>
                </div>
            </div>

						<div class="col-sm-4">
                <div class="contact-box">
                        <div class="col-sm-4">
                            <div class="text-center">
                                <img alt="image" class="img-circle m-t-xs img-responsive" src="../img/3.png">
																	<h3>某某</h3>
                                <div class="m-t-xs font-bold  text-danger"><a href="">修改</a></div>
                            </div>
                        </div>
                        <div class="col-sm-8">
                            <h3><strong>北京星通联华</strong></h3>
														<h5>研发部</h5>
                            <p><i class="fa fa-circle"></i>飞人只会跳</p>
                            <address>
                            邮箱:<a href=""></a><br>
                            <abbr title="Phone">手机</abbr> (123) 456-7890
                        </address>
                        </div>
                        <div class="clearfix"></div>
                </div>
            </div>

						<div class="col-sm-4">
                <div class="contact-box">
                        <div class="col-sm-4">
                            <div class="text-center">
                                <img alt="image" class="img-circle m-t-xs img-responsive" src="../img/4.png">
																	<h3>某某</h3>
                                <div class="m-t-xs font-bold  text-danger"><a href="">修改</a></div>
                            </div>
                        </div>
                        <div class="col-sm-8">
                            <h3><strong>北京星通联华</strong></h3>
														<h5>研发部</h5>
                            <p><i class="fa fa-circle"></i>飞人只会跳</p>
                            <address>
                            邮箱:<a href=""></a><br>
                            <abbr title="Phone">手机</abbr> (123) 456-7890
                        </address>
                        </div>
                        <div class="clearfix"></div>
                </div>
            </div>
        </div>
    </div>


    <div id="modal-form" class="modal fade" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-body">
                    <h3 class="m-t-none m-b text-center">增加新成员</h3>
                    <div class="row">
                        <div class="col-sm-8 b-r">
                                    <form role="form form-horizontal ">
                                      <div class="form-group">
                                          <label class="col-sm-4 control-label">账号:</label>
                                          <div class="col-sm-8">
                                              <input type="" placeholder="请输入账号" class="form-control">
                                          </div>
                                      </div>

                                      <div class="form-group">
                                          <label class="col-sm-4 control-label">密码：</label>
                                          <div class="col-sm-8">
                                              <input type="" placeholder="请输入密码" class="form-control">
                                          </div>
                                      </div>

                                      <div class="form-group">
                                          <label class="col-sm-4 control-label">用户类型：</label>
                                          <div class="col-sm-8">
                                              <input type="" placeholder="请输入用户类型" class="form-control">
                                          </div>
                                      </div>

                                      <div class="form-group">
                                          <label class="col-sm-4 control-label">姓名：</label>
                                          <div class="col-sm-8">
                                              <input type="" placeholder="请输入姓名" class="form-control">
                                          </div>
                                      </div>

                                      <div class="form-group">
                                          <label class="col-sm-4 control-label">所属公司：</label>
                                          <div class="col-sm-8">
                                              <input type="" placeholder="请输入所属公司" class="form-control">
                                          </div>
                                      </div>

                                      <div class="form-group">
                                          <label class="col-sm-4 control-label">所属部门：</label>
                                          <div class="col-sm-8">
                                              <input type="" placeholder="请输入所属部门" class="form-control">
                                          </div>
                                      </div>

                                      <div class="form-group">
                                          <label class="col-sm-4 control-label">邮箱：</label>
                                          <div class="col-sm-8">
                                              <input type="" placeholder="请输入邮箱" class="form-control">
                                          </div>
                                      </div>

                                      <div class="form-group">
                                          <label class="col-sm-4 control-label">手机：</label>
                                          <div class="col-sm-8">
                                              <input type="" placeholder="请输入手机" class="form-control">
                                          </div>
                                      </div>

                                    </form>
                        </div>
                        <div class="col-sm-4">
                            <p class="text-center">
                                <img alt="image" class="img-circle m-t-xs img-responsive" src="../img/3.png">
                                <a href="form_basic.html">点击上传头像</a>
                            </p>
                            <p class="m-btn text-center"><span class="btn-success">提 交</span></p>
                            <p class="m-btn text-center"><span class="btn-danger" data-dismiss="modal">取 消</span></p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

		<!-- 全局js -->
    <script src="../js/jquery.min.js?v=2.1.4"></script>
    <script src="../js/bootstrap.min.js?v=3.3.6"></script>



    <!-- 自定义js -->
    <script src="../js/content.js?v=1.0.0"></script>



    <script>
        $(document).ready(function () {
            $('.contact-box').each(function () {
                animationHover(this, 'pulse');
            });
        });
    </script>



</body>

</html>
