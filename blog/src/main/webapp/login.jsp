<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>博客管理系統登录</title>
    <link rel="stylesheet" type="text/css" href="css/styles.css">
    <script src="js/jquery.min.js?v=2.1.4"></script>
</head>
<body>
<div class="wrapper">

    <div class="container">
        <h1>博客后台管理系统</h1>
        <form id="userForm" class="form" action="user/login">
            <span id="error" style="color: red"></span>
            <input type="text" name="uname" id="uname" placeholder="Username">
            <input type="password" name="upass" id="upass" placeholder="Password"><br>
            <input type="submit"  value="提交"  id="login-button"/>
        </form>
    </div>
    <ul class="bg-bubbles">
        <li></li>
        <li></li>
    </ul>
</div>
</body>
</html>
