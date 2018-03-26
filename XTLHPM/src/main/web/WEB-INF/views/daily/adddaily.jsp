<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">


    <title>新增日常绩效考核</title>
    <meta name="keywords" content="">
    <meta name="description" content="">

    <link rel="shortcut icon" href="favicon.ico">
     <link href="../css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="../css/font-awesome.css?v=4.4.0" rel="stylesheet">
    <link href="../css/plugins/iCheck/custom.css" rel="stylesheet">
    <link href="../css/animate.css" rel="stylesheet">
    <link href="../css/style.css?v=4.1.0" rel="stylesheet">
    <link href="../css/pd.css" rel="stylesheet">


</head>

<body class="gray-bg">
        <div class="wrapper wrapper-content ">
             <div class="row">
                   <div class="col-sm-12">
                          <div class=" float-e-margins">
                            <div class="ibox-title">
                                <h3>新增日常绩效</h3>
                            </div>
                            <div class="ibox-content" style="color:#333">
                                <form role="form" class="form-horizontal " style="margin-top:15px;">
                                  <div class="form-group">
                                      <label class="col-sm-2 control-label" style="text-indent:10px;">成员姓名:</label>
                                      <div class="col-sm-3">
                                          <select class="form-control m-b" name="account">
                                              <option>选项 1</option>
                                              <option>选项 2</option>
                                              <option>选项 3</option>
                                              <option>选项 4</option>
                                          </select>
                                      </div>
                                      <label class="col-sm-2 control-label">绩效类型:</label>

                                      <div class="col-sm-3">
                                          <select class="form-control m-b" name="account">
                                              <option>选项 1</option>
                                              <option>选项 2</option>
                                              <option>选项 3</option>
                                              <option>选项 4</option>
                                          </select>
                                      </div>
                                      <label class="col-sm-2 control-label">等级:</label>

                                      <div class="col-sm-3">
                                          <select class="form-control m-b" name="account">
                                              <option>选项 1</option>
                                              <option>选项 2</option>
                                              <option>选项 3</option>
                                              <option>选项 4</option>
                                          </select>
                                      </div>
                                  </div>
                                  <div class="form-group" style="margin-left:10px;">
                                          <label class="col-sm-2 control-label">得分：</label>
                                          <div class="score" style="margin-left:15px;"></div>
                                  </div>
                                  <div class="form-group" style="margin-left:10px;">
                                          <label class="col-sm-2 control-label">说 明：</label>
                                          <div class="col-sm-8">
                                              <textarea id="ccomment" name="comment" class="form-control" required="" aria-required="true"></textarea>
                                          </div>
                                </div>
                                </form>
                              </div>
                          </div>
                   </div>
             </div>


             <div class="row">
                 <div class="col-sm-12">
                     <div class="ibox float-e-margins">
                         <div class="ibox-title">
                             <h3>添加附件</h3>
                         </div>
                         <div class="ibox-content" style="color:#333;height:100px;">

                         </div>
                     </div>
                 </div>
             </div>

             <p class="bottom-btn text-center">
               <span class="btn-danger">取 消</span>
               <span class="btn-success">提 交</span>
             </p>
          </div>


    <!-- 全局js -->
    <script src="../js/jquery.min.js?v=2.1.4"></script>
    <script src="../js/bootstrap.min.js?v=3.3.6"></script>

    <!-- 自定义js -->
    <script src="../js/content.js?v=1.0.0"></script>


</body>

</html>
