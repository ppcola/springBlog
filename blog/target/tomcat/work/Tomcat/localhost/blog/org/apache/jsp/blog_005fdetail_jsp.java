/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2023-02-03 18:11:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class blog_005fdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <script type=\"text/javascript\" src=\"js/showdate.js\"></script>\r\n");
      out.write("\t<script src=\"js/jquery.min.js?v=2.1.4\"></script>\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("        body {font-size: 20px;\r\n");
      out.write("             padding-bottom: 40px;\r\n");
      out.write("             background-color:#e9e7ef;\r\n");
      out.write("             font-size:17px;\r\n");
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
      out.write("\t<script>\r\n");
      out.write("\t\t$(function (){\r\n");
      out.write("\t\t\tvar url = location.href;\r\n");
      out.write("\t\t\tvar bid = url.substring(url.lastIndexOf(\"=\")+1);\r\n");
      out.write("\t\t\t$.get(\"blog/detail?bid=\"+bid+\"\",function (data){\r\n");
      out.write("\t\t\t\t//显示博客信息\r\n");
      out.write("\t\t\t\t$(\"#uname\").text(data.user.uname);\r\n");
      out.write("\t\t\t\t$(\"#email\").text(data.user.email);\r\n");
      out.write("\t\t\t\t$(\"#content\").text(data.bcontent);\r\n");
      out.write("\t\t\t\t$(\"#time\").text(changDate(data.date));\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t//动态显示评论\r\n");
      out.write("\t\t\t\t$(\"#evaluates\").empty();\r\n");
      out.write("\t\t\t\t$(data.evaluateList).each(function (index, element){\r\n");
      out.write("\t\t\t\t\tvar tr='\\t\\t<tr>\\n' +\r\n");
      out.write("\t\t\t\t\t\t\t'\\t\\t\\t<td>'+element.econtent+'</td>\\n' +\r\n");
      out.write("\t\t\t\t\t\t\t'\\t\\t\\t<td>'+changDate(element.etime)+'</td>\\n' +\r\n");
      out.write("\t\t\t\t\t\t\t'\\t\\t\\t<td><button type=\"button\"  id=\"deletecomment\">删除</button></td>\\n' +\r\n");
      out.write("\t\t\t\t\t\t\t'\\t\\t</tr>';\r\n");
      out.write("\t\t\t\t\t$(\"#evaluates\").append(tr);\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t})\r\n");
      out.write("\r\n");
      out.write("\t\tfunction changDate(ms) {\r\n");
      out.write("\t\t\tvar date = new Date(ms);\r\n");
      out.write("\t\t\tvar y = date.getFullYear();\r\n");
      out.write("\t\t\tvar m = date.getMonth();\r\n");
      out.write("\t\t\tvar d = date.getDate();\r\n");
      out.write("\t\t\treturn y + \"-\" + m + \"-\" + d;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("<h3><strong>博客信息：</strong></h3>\r\n");
      out.write("      <table class=\"table table-condensed\">\r\n");
      out.write("               <tr>              \r\n");
      out.write("\t              <td width=\"18%\" height=\"30\" align=\"center\">博主名称：</td>\r\n");
      out.write("\t              <td id=\"uname\" width=\"82%\" class=\"word_grey\">\r\n");
      out.write("\t\t\t\t\t ");
      out.write("\r\n");
      out.write("\t\t\t\t  </td>\r\n");
      out.write("\t            </tr>\r\n");
      out.write("\t            <tr>\r\n");
      out.write("\t              <td height=\"28\" align=\"center\">邮箱</td>\r\n");
      out.write("\t              <td height=\"28\" id=\"email\">fendou@fendou.com</td>\r\n");
      out.write("\t            </tr>\r\n");
      out.write("\t\t\t\t  <tr>\r\n");
      out.write("\t\t\t\t\t  <td height=\"28\" align=\"center\">发布内容：</td>\r\n");
      out.write("\t\t\t\t\t  <td height=\"28\" id=\"content\">的设计费看就看的房间</td>\r\n");
      out.write("\t\t\t\t  </tr>\r\n");
      out.write("\t            <tr>\r\n");
      out.write("\t              <td height=\"28\" align=\"center\">发布时间：</td>\r\n");
      out.write("\t              <td height=\"28\" id=\"time\" >2022-11-15 12:33:23</td>\r\n");
      out.write("\t            </tr>\r\n");
      out.write("\t  </table>\r\n");
      out.write("\r\n");
      out.write("<h3><strong>全部评价内容：</strong></h3>\r\n");
      out.write("<table class=\"table table-bordered\">\r\n");
      out.write("\t<thead>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th>评价内容</th>\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t<th>评价时间</th>\r\n");
      out.write("\t\t\t<th>操作</th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</thead>\r\n");
      out.write("\t<tbody id=\"evaluates\">\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>这是一个不错的电影</td>\r\n");
      out.write("\t\t\t<td>2022-04-01</td>\r\n");
      out.write("\t\t\t<td><button type=\"button\"  id=\"deletecomment\">删除</button></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t</tbody>\r\n");
      out.write("</table>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
