package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t<style>\r\n");
      out.write("\tp\r\n");
      out.write("\t{\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    text-transform: uppercase;\r\n");
      out.write("    color:black;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\ta:hover\r\n");
      out.write("\t{\r\n");
      out.write("\t\tbackground-color:black;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tol\r\n");
      out.write("\t{\r\n");
      out.write("\tcolor:black;\r\n");
      out.write("\t}\r\n");
      out.write("\t</style>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t\r\n");
      out.write("\t<body background =\"back.jpg\" text = \"white\" style = \"font-family:Comic Sans MS\">\r\n");
      out.write("\t\r\n");
      out.write("\t<center>\r\n");
      out.write("\t<div style=\"background-color:lightblue;height:50px;width:600px;\">\r\n");
      out.write("\t<center><h1><p>Event Management System</p></h1></center>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</center>\r\n");
      out.write("\t\r\n");
      out.write("\t<div style = \"background-color:black;\">\t \r\n");
      out.write("     <pre><marquee behavior = \"alternate\" scrollamount = \"10\"><img src=\"demo.jpg\"  height = 220px >\t<img src=\"demo1.jpg\" height = 220px >\t\t&nbsp<img src=\"demo2.jpg\" height = 220px ></marquee></pre>\r\n");
      out.write("   \t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<br><br>\r\n");
      out.write("\t\r\n");
      out.write("\t<ol type = \"I\">\r\n");
      out.write("\t<div style=\"background-color:lightpink;height:50px;width:345px;\">\r\n");
      out.write("\t<li><h1><a href =\"login.jsp\" style = \"text-decoration:none;color:blue;\">Login to your Account</a></h1></li>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div style=\"background-color:yellow;height:40px;width:535px;\">\r\n");
      out.write("\t<li><h1><a href =\"info.jsp\" style = \"text-decoration:none;color:blue\">About Event Management System</a></h1></li>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t</ol>\r\n");
      out.write("\t\r\n");
      out.write("\t<footer style = \"color:black;\">\r\n");
      out.write("\t<center>\r\n");
      out.write("     <div style=\"background-color:purple;height:60px;width:500px;\">\r\n");
      out.write("\t <h3><center>Event Management System Â© 2018 All rights reserved.</center></h3>\r\n");
      out.write("\t </div>\r\n");
      out.write("\t </center>\r\n");
      out.write("\t \r\n");
      out.write("\t <div style=\"background-color:grey;height:150px;width:400px;\">\r\n");
      out.write("     <h3 style = \"text-align:left\">\r\n");
      out.write("\t  Posted by: Sahil Sood</p>\r\n");
      out.write("     Contact information: <a href=\"mailto:anyonee@example.com\" style = \"text-decoration:none;color:green;\">sahilsood1597@gmail.com</a></p>\r\n");
      out.write("     contact number   1400380028 \t\t\r\n");
      out.write("\t </div>\r\n");
      out.write("     </h3> \r\n");
      out.write("     </footer>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\t");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
