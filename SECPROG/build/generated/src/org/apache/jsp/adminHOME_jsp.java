package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminHOME_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            #logo {\n");
      out.write("                float:left;\n");
      out.write("                height:50px;\n");
      out.write("                width:60px;\n");
      out.write("                margin-left:10px;\n");
      out.write("                margin-right:-100px;\n");
      out.write("                margin-top:10px;\n");
      out.write("                position: absolute;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #logoimg {\n");
      out.write("                height:100px;\n");
      out.write("                width:auto;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #content{\n");
      out.write("                background-color: #FFFFF;\n");
      out.write("                margin-left:-10px;\n");
      out.write("                margin-right:-10px;\n");
      out.write("                margin-top:-10px;\n");
      out.write("                height: 130px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #navbar {\n");
      out.write("                padding-top: 75px;\n");
      out.write("                padding-left: 1000px;\n");
      out.write("                background-color:#FD97BE;\n");
      out.write("                text-align: left;\n");
      out.write("                height: 40px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #navbar li {\n");
      out.write("                list-style-type: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #navbar a {\n");
      out.write("                color: blueviolet;\n");
      out.write("                text-decoration: none;\n");
      out.write("                font-family:Arial;\n");
      out.write("                font-size: 20px;\n");
      out.write("                padding: 30px;\n");
      out.write("            }\t\n");
      out.write("\n");
      out.write("            #navbar a:hover{ \n");
      out.write("                color: red;\n");
      out.write("                font-weight:bold;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #actions {\n");
      out.write("                padding-top:150px;\n");
      out.write("                padding-left:-10px;\n");
      out.write("\n");
      out.write("                background-color: bisque;\n");
      out.write("                height: 30px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div id=\"logo\"><img id=\"logoimg\" src=\"images/logo.png\"/></div>\n");
      out.write("\n");
      out.write("        <div id=\"content\">\n");
      out.write("            <div id=\"navbar\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"actions\">\n");
      out.write("            <a href=\"signup_productmanager.html\">Add Product Manager</a>\n");
      out.write("            <br>\n");
      out.write("            <a href=\"signup_accountingmanager.html\">Add Accounting Manager</a>\n");
      out.write("            <br>\n");
      out.write("            <a href=\"viewlogs.html\">View Activity Log </a>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
