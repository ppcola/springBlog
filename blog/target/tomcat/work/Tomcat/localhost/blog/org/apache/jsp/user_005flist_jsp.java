/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2023-02-02 10:05:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title></title>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap-responsive.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/bootstrap.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/ckform.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/common.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery.min.js?v=2.1.4\"></script>\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("        body {font-size: 20px;\r\n");
      out.write("            padding-bottom: 40px;\r\n");
      out.write("            background-color:#e9e7ef;\r\n");
      out.write("        }\r\n");
      out.write("        .sidebar-nav {\r\n");
      out.write("            padding: 9px 0;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        @media (max-width: 980px) {\r\n");
      out.write("            /* Enable use of floated navbar text */\r\n");
      out.write("            .navbar-text.pull-right {\r\n");
      out.write("                float: none;\r\n");
      out.write("                padding-left: 5px;\r\n");
      out.write("                padding-right: 5px;\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("    <script>\r\n");
      out.write("        //加载就绪函数\r\n");
      out.write("        $(function (){\r\n");
      out.write("            $.get(\"user/queryAll\",function (data){\r\n");
      out.write("               // console.log(data)\r\n");
      out.write("                //循环动态绑定数据\r\n");
      out.write("                $(\"#tbody\").empty();\r\n");
      out.write("                $(data).each(function (index,el){\r\n");
      out.write("                    var tr = '       <tr>\\n' +\r\n");
      out.write("                        '           <td><a href=\"user_detail.jsp?uid='+el.uid+'\">'+el.uname+'</a></td>\\n' +\r\n");
      out.write("                        '           <td>'+el.truename+'</td>\\n' +\r\n");
      out.write("                        '           <td>'+el.email+'</td>\\n' +\r\n");
      out.write("                        '           <td>'+changDate(el.utime)+'</td>\\n' +\r\n");
      out.write("                        '           <td><button onclick=\"del('+el.uid+')\">注销</button></td>\\n' +\r\n");
      out.write("                        '       </tr> ';\r\n");
      out.write("                    $(\"#tbody\").append(tr);\r\n");
      out.write("                })\r\n");
      out.write("            })\r\n");
      out.write("            //模糊查询\r\n");
      out.write("            $(\"#search\").click(function (){\r\n");
      out.write("                var uname =$(\"#uname\").val();\r\n");
      out.write("                $.get(\"user/queryByCondition?uname=\"+uname,function (data){\r\n");
      out.write("                    //console.log(data)\r\n");
      out.write("                    //循环动态绑定数据\r\n");
      out.write("                    $(\"#tbody\").empty();\r\n");
      out.write("                    $(data).each(function (index,el){\r\n");
      out.write("                        var tr = '       <tr>\\n' +\r\n");
      out.write("                            '           <td><a href=\"user_detail.jsp?uid='+el.uid+'\">'+el.uname+'</a></td>\\n' +\r\n");
      out.write("                            '           <td>'+el.truename+'</td>\\n' +\r\n");
      out.write("                            '           <td>'+el.email+'</td>\\n' +\r\n");
      out.write("                            '           <td>'+changDate(el.utime)+'</td>\\n' +\r\n");
      out.write("                            '           <td><button onclick=\"del('+el.uid+')\">注销</button></td>\\n' +\r\n");
      out.write("                            '       </tr> ';\r\n");
      out.write("                        $(\"#tbody\").append(tr);\r\n");
      out.write("                    })\r\n");
      out.write("                })\r\n");
      out.write("            })\r\n");
      out.write("        })\r\n");
      out.write("        //删除用户\r\n");
      out.write("        function del(uid){\r\n");
      out.write("            if(confirm(\"是否确定删除？\")){\r\n");
      out.write("                $.get(\"user/del?uid=\"+uid,function (data){\r\n");
      out.write("                    alert(data.msg);\r\n");
      out.write("                    location.reload();\r\n");
      out.write("                })\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        function changDate(ms){\r\n");
      out.write("            var date = new Date(ms);\r\n");
      out.write("            var y = date.getFullYear();\r\n");
      out.write("            var m = date.getMonth();\r\n");
      out.write("            var d = date.getDate();\r\n");
      out.write("            return y+\"-\"+m+\"-\"+d;\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<form id=\"form1\" class=\"form-inline definewidth m20\" action=\"#\" method=\"get\">\r\n");
      out.write("     <font color=\"#777777\"><strong>用户名：</strong></font>\r\n");
      out.write("    <input type=\"text\" name=\"uname\" id=\"uname\" class=\"abc input-default \" placeholder=\"请填写用户名\" value=\"\">&nbsp;&nbsp;\r\n");
      out.write("    <button type=\"button\" id=\"search\" class=\"btn btn-primary queryBtn\">查询</button>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<table id=\"usertable\" class=\"table table-bordered table-hover definewidth m10\">\r\n");
      out.write("    <thead>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <th>用户名</th>\r\n");
      out.write("        <th>真实姓名</th>\r\n");
      out.write("        <th>Email</th>\r\n");
      out.write("        <th>注册日期</th>\r\n");
      out.write("        <th>冻结账户</th>\r\n");
      out.write("     </tr>\r\n");
      out.write("    </thead>\r\n");
      out.write("   <tbody id=\"tbody\">\r\n");
      out.write("       ");
      out.write("\r\n");
      out.write("       <tr>\r\n");
      out.write("           <td><a href=\"user_detail.jsp\">小强</a></td>\r\n");
      out.write("           <td>何方强</td>\r\n");
      out.write("           <td>154987@163.com</td>\r\n");
      out.write("           <td>2021-4-4 15:45</td>\r\n");
      out.write("           <td><button type=\"submit\">注销</button></td>\r\n");
      out.write("       </tr>\r\n");
      out.write("   </tbody>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
