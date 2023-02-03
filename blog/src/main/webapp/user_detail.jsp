<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="css/bootstrap-responsive.css" />
    <link rel="stylesheet" type="text/css" href="css/style.css" />
    <%--<script type="text/javascript" src="js/jquery.js"></script>
    <script type="text/javascript" src="js/jquery.sorted.js"></script>--%>
    <script type="text/javascript" src="js/bootstrap.js"></script>
    <script type="text/javascript" src="js/ckform.js"></script>
    <script type="text/javascript" src="js/common.js"></script>
    <script type="text/javascript" src="js/showdate.js"></script>
	<script src="js/jquery.min.js?v=2.1.4"></script>
    <style type="text/css">
        body {font-size: 20px;
             padding-bottom: 40px;
             background-color:#e9e7ef;
             font-size:17px;
        }
        .sidebar-nav {
            padding: 9px 0;
        }

        @media (max-width: 980px) {
            /* Enable use of floated navbar text */
            .navbar-text.pull-right {
                float: none;
                padding-left: 5px;
                padding-right: 5px;
            }
        }
    </style>
	<script>
		$(function (){
			//获取uid
			var url =location.href;
			var uid = url.substring(url.lastIndexOf("=")+1);
			//请求服务器查询
			$.get("user/queryByUid?uid="+uid,function (data){
				//console.log(data);
				//将数据显示到页面
				$("#uname").text(data.uname);
				$("#truename").text(data.truename);
				$("#uname").text(data.uname);
				$("#utype").text(data.role.rolename);
				$("#email").text(data.email);
				$("#utime").text(changDate(data.utime));
			})
		})

		//时间格式转换
		function changDate(ms){
			var date = new Date(ms);
			var y = date.getFullYear();
			var m = date.getMonth();
			var d = date.getDate();
			return y+"-"+m+"-"+d;
		}
	</script>
</head>
<h3><strong>基本信息：</strong></h3>
   <table class="table table-condensed">
               <tr>              
	              <td width="18%" height="30" align="center">用 户 名：</td>
	              <td width="82%" class="word_grey" id="uname"></td>
	            </tr>
				<tr>              
	              <td width="18%" height="30" align="center">真实姓名：</td>
	              <td width="82%" class="word_grey" id="truename"></td>
	            </tr>
	            <tr>
	              <td height="28" align="center">密&nbsp;&nbsp;&nbsp;&nbsp;码：</td>
	              <td height="28">******</td>
	            </tr>
				<tr>
	              <td height="28" align="center">用户类型：</td>
	              <td height="28" id="utype"></td>
	            </tr>
	            <tr>
	              <td height="28" align="center">E-mail：</td>
	              <td height="28" id="email"></td>
	            </tr> 
			   
	            <tr>
	              <td height="28" align="center">创建时间：</td>
	              <td height="28" id="utime"></td>
	            </tr>
			   <tr>
				   <td height="28" align="center">
					   <button onclick="history.back()">返回</button>
				   </td>
			   </tr>
   </table>
       

</body>
</html>
