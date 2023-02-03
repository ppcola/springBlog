<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="css/bootstrap.css"/>
    <link rel="stylesheet" type="text/css" href="css/bootstrap-responsive.css"/>
    <link rel="stylesheet" type="text/css" href="css/style.css"/>
    <%--<script type="text/javascript" src="js/jquery2.js"></script>--%>
    <%--<script type="text/javascript" src="js/jquery2.sorted.js"></script>--%>
    <script type="text/javascript" src="js/bootstrap.js"></script>
    <script type="text/javascript" src="js/ckform.js"></script>
    <script type="text/javascript" src="js/common.js"></script>
    <script src="js/jquery.min.js?v=2.1.4"></script>
    <style type="text/css">
        body {
            font-size: 20px;
            padding-bottom: 40px;
            background-color: #e9e7ef;
        }

        .sidebar-nav {
            padding: 9px 0;
        }

        @media ( max-width: 980px) {
            /* Enable use of floated navbar text */
            .navbar-text.pull-right {
                float: none;
                padding-left: 5px;
                padding-right: 5px;
            }
        }
    </style>
    <script>
        $(function () {
            findByPage(1);
        })

        function findByPage(pageNum){

            $.get("blog/queryAll?pageNum="+pageNum+"&pageSize=2", function (data) {
                $("#tbody").empty();
                $(data.list).each(function (index, el) {
                    var tr = '\t\t   <tr align="center">\n' +
                        '\t\t\t   <td>' + el.btitle + '</td>\n' +
                        '\t\t\t   <td>' + el.btype.typename + '</td>\n' +
                        '\t\t\t   <td>' + el.user.uname + '</td>\n' +
                        '\t\t\t   <td>' + changDate(el.date) + '</td>\n' +
                        '\t\t\t   <td>\n' +
                        '\t\t\t\t   <a href="javascript:void(0)" onclick="deleteInfo('+el.bid+')">删除 </a>\n' +
                        '\t\t\t\t   &nbsp;&nbsp;&nbsp;&nbsp;\n' +
                        '\t\t\t\t   <a href="blog_detail.jsp?bid='+el.bid+'">博客详情</a>\n' +
                        '\t\t\t   </td>\n' +
                        '\t\t   </tr>';
                    $("#tbody").append(tr);
                })
                //动态添加分页按钮
                $("#tfoot").empty();
                var str = '';
                $(data.navigatepageNums).each(function (i, num) {
                    str +='<a href="javascripe:toPage('+num+')">'+num+'</a>'+"&nbsp;&nbsp;";
                })
                var tp = '<tr>'+
                    '<td colspan="5">'+
                    '<a href="javascript:toPage(1)">首页</a>&nbsp;&nbsp;'+
                    '<a href="javascript:toPage('+data.prePage+')">上一页</a>&nbsp;&nbsp;'+
                    str+
                    '<a href="javascript:toPage('+data.nextPage+')">下一页</a>&nbsp;&nbsp;'+
                    '<a href="javascript:toPage('+data.pages+')">尾页</a>&nbsp;&nbsp;'+
                    '</td>'+
                    '</tr>';
                $("#tfoot").append(tp);
            })
        }

        //toPage分页跳转查询
        function toPage(page){
            findByPage(page);
        }

        function changDate(ms) {
            var date = new Date(ms);
            var y = date.getFullYear();
            var m = date.getMonth();
            var d = date.getDate();
            return y + "-" + m + "-" + d;
        }


        //删除博客
        function deleteInfo(bid){

            if (confirm("是否要删除？")){
                $.get("blog/del?bid="+bid,function (data){
                    console.log(data);
                    alert(data.msg);
                    location.reload();
                })
            }

        }
    </script>
</head>
<body>
<form class="form-inline definewidth m20" action="#" method="get">
    <a href="documentAdd.jsp">发布博客</a>

</form>
<table class="table table-bordered table-hover definewidth m10">
    <thead>
    <tr align="center">
        <th>博客标题</th>
        <th>博客类别</th>
        <th>作者</th>
        <th>发布日期</th>
        <th>管理菜单</th>
    </tr>
    </thead>
    <tbody id="tbody">
    <%--存放行数据--%>
    <tr align="center">
        <td>蒹葭</td>
        <td>策</td>
        <td>小强</td>
        <td>2016.07.22</td>
        <td>
            <a href="javascript:deleteInfo('+el.bid+')">删除 </a>
            &nbsp;&nbsp;&nbsp;&nbsp;
            <a href="blog_detail.jsp">博客详情</a>
        </td>
    </tr>
    </tbody>
    <tfoot id="tfoot">
    <%--设置分页信息--%>
    <tr>
        <td>
            <a href="">首页</a>&nbsp;
            <a href="">上一页</a>&nbsp;
            <a href="">1</a>&nbsp;
            <a href="">下一页</a>&nbsp;
            <a href="">首页</a>
        </td>
    </tr>
    </tfoot>
</table>

</body>
</html>
