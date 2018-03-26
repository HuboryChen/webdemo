<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
	<meta charset="UTF-8">
	<title>绩效考评管理系统-登陆</title>
	<link href="WEB-INF/views/css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <script src="WEB-INF/views/js/jquery.min.js"></script>
    <script src="WEB-INF/views/js/bootstrap.min.js?v=3.3.6"></script>
	<style>
		html,body {
			width: 100%;
			height: 100%;
			margin: 0;
    		font-family: "open sans", "Helvetica Neue", Helvetica, Arial, sans-serif;
		}

		.head {
			height: 5%;
		}

		.main {
			height: 95%;
			background: url(WEB-INF/views/img/login-bg-icon.jpg) #346c9b;
			background-size: 100%;
			position: relative;
		}

		.login_box {
			width: 32%;
			height: 65%;
			font-size: 14px;
			box-shadow: 0 0 10px #161616 inset;
			border-radius: 50%;
			margin: auto;
			position: absolute;
			top: 0;
			left: 0;
			bottom: 0;
			right: 0;
			background: white;
			/*background: url(img/login-input-bg.png) no-repeat;
			background-size: 100%;*/
		}

		.form_box {
			width: 70%;
			height: 100%;
			margin: auto;
			position: relative;
		}

		.form_son {
			width: 100%;
			height: 58%;
			margin: auto;
			position: absolute;
			top: 0;
			left: 0;
			bottom: 0;
			right: 0;
		}

		.input_box {
			margin-top: 30px;
		}

		.user_name {
			background: url(WEB-INF/views/img/user.png) no-repeat white 95% center;
		}

		.pass_word {
			background: url(WEB-INF/views/img/locked.png) no-repeat white 95% center;
		}

		.errors {
			font-size: 12px;
			color: red;
			padding-top: 10px;
		}

		.footer {
			height: 5%;
			background: #204560;
		}
	</style>
</head>
<body>
	<!-- <div class="head"></div> -->
	<div class="main">
		<div class="login_box">
			<form class="form_box">
				<div class="form_son">
					<img src="WEB-INF/views/img/login-logo.png" alt="" style="width: 100%;">
					<div class="input_box" style="margin-top: 20px;">
						<input class="form-control user_name" type="text" placeholder="用户名">
					</div>
					<div class="input_box">
						<input class="form-control pass_word" type="password" placeholder="密码">
					</div>
					<p class="errors">用户名或密码错误</p>
					<button class="btn btn-success btn-block">登&nbsp;&nbsp;&nbsp;&nbsp;陆</button>
				</div>
			</form>
		</div>
	</div>
	<div class="footer">
		<p class="bottom-p" id="copyright">Copyright © 2017 - 2017&nbsp;北京星通联华科技发展股份有限公司. All Rights Reserved.</p>
	</div>
</body>
</html>