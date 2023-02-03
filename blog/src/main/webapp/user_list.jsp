<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title></title>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="css/bootstrap-responsive.css" />
    <link rel="stylesheet" type="text/css" href="css/style.css" />
    <script type="text/javascript" src="js/bootstrap.js"></script>
    <script type="text/javascript" src="js/ckform.js"></script>
    <script type="text/javascript" src="js/common.js"></script>
    <script src="js/jquery.min.js?v=2.1.4"></script>
    <style type="text/css">
        body {font-size: 20px;
            padding-bottom: 40px;
            background-color:#e9e7ef;
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
        //加载就绪函数
        $(function (){
            $.get("user/queryAll",function (data){
               // console.log(data)
                //循环动态绑定数据
                $("#tbody").empty();
                $(data).each(function (index,el){
                    var tr = '       <tr>\n' +
                        '           <td><a href="user_detail.jsp?uid='+el.uid+'">'+el.uname+'</a></td>\n' +
                        '           <td>'+el.truename+'</td>\n' +
                        '           <td>'+el.email+'</td>\n' +
                        '           <td>'+changDate(el.utime)+'</td>\n' +
                        '           <td><button onclick="del('+el.uid+')">注销</button></td>\n' +
                        '       </tr> ';
                    $("#tbody").append(tr);
                })
            })
            //模糊查询
            $("#search").click(function (){
                var uname =$("#uname").val();
                $.get("user/queryByCondition?uname="+uname,function (data){
                    //console.log(data)
                    //循环动态绑定数据
                    $("#tbody").empty();
                    $(data).each(function (index,el){
                        var tr = '       <tr>\n' +
                            '           <td><a href="user_detail.jsp?uid='+el.uid+'">'+el.uname+'</a></td>\n' +
                            '           <td>'+el.truename+'</td>\n' +
                            '           <td>'+el.email+'</td>\n' +
                            '           <td>'+changDate(el.utime)+'</td>\n' +
                            '           <td><button onclick="del('+el.uid+')">注销</button></td>\n' +
                            '       </tr> ';
                        $("#tbody").append(tr);
                    })
                })
            })
        })
        //删除用户
        function del(uid){
            if(confirm("是否确定删除？")){
                $.get("user/del?uid="+uid,function (data){
                    alert(data.msg);
                    location.reload();
                })
            }
        }

        function changDate(ms){
            var date = new Date(ms);
            var y = date.getFullYear();
            var m = date.getMonth();
            var d = date.getDate();
            return y+"-"+m+"-"+d;
        }
    </script>
</head>
<body>

<form id="form1" class="form-inline definewidth m20" action="#" method="get">
     <font color="#777777"><strong>用户名：</strong></font>
    <input type="text" name="uname" id="uname" class="abc input-default " placeholder="请填写用户名" value="">&nbsp;&nbsp;
    <button type="button" id="search" class="btn btn-primary queryBtn">查询</button>
</form>

<table id="usertable" class="table table-bordered table-hover definewidth m10">
    <thead>
    <tr>
        <th>用户名</th>
        <th>真实姓名</th>
        <th>Email</th>
        <th>注册日期</th>
        <th>冻结账户</th>
     </tr>
    </thead>
   <tbody id="tbody">
       <%--填写用户列表数据--%>
       <tr>
           <td><a href="user_detail.jsp">小强</a></td>
           <td>何方强</td>
           <td>154987@163.com</td>
           <td>2021-4-4 15:45</td>
           <td><button type="submit">注销</button></td>
       </tr>
   </tbody>
</table>

</body>
</html>