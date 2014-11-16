package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginfail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/home.html");
  }

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Failed Login Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>HOMEPAGE</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width\">\r\n");
      out.write("        <script src=\"jquery-2.1.0.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"js-homepage.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"js-logincheck.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"js-general.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        \r\n");
      out.write("        <style type=\"text/css\">\r\n");
      out.write("            #loginform {\r\n");
      out.write("                display : none;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            #log, #sign, #loginbutton, #signupbutton {\r\n");
      out.write("                font-weight : bold;\r\n");
      out.write("                color : black;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            #signupform {\r\n");
      out.write("                display : none;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            #piclink {\r\n");
      out.write("                margin-left : 20px;\r\n");
      out.write("            }\r\n");
      out.write("            #logo {\r\n");
      out.write("                float:left;\r\n");
      out.write("                height:50px;\r\n");
      out.write("                width:60px;\r\n");
      out.write("                margin-left:10px;\r\n");
      out.write("                margin-right:-100px;\r\n");
      out.write("                margin-top:10px;\r\n");
      out.write("                position: absolute;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            #logoimg {\r\n");
      out.write("                height:100px;\r\n");
      out.write("                width:auto;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("        </style>\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <div id=\"logo\"><img id=\"logoimg\" src=\"images/logo.png\"/></div>\r\n");
      out.write("\r\n");
      out.write("        <div id=\"content\">\r\n");
      out.write("            <div id=\"navbar\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <object width=\"600\" height=\"600\" data=\"book.swf\"></object>\r\n");
      out.write("        \r\n");
      out.write("        <div id='member'>\r\n");
      out.write("            <!--LOG IN-->\r\n");
      out.write("            <div id=\"login\">\r\n");
      out.write("\r\n");
      out.write("                <div style=\"font-weight:bold;\">Already a member<input type='button' id='loginbutton' value='login'>\r\n");
      out.write("                </div> <!--login button-->\r\n");
      out.write("\r\n");
      out.write("                <div id=\"loginform\">\r\n");
      out.write("                    <form id=\"logform\" name=\"login\" onsubmit=\"return logcheck();\" method=\"post\" action=\"LoginServlet\">\r\n");
      out.write("                        <table>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td>Username</td>\r\n");
      out.write("                                <td><input type='text' id='loguser' name='loguser' onblur=\"usernameCheck();\" onfocus=\"backWhite(this);\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td>Password</td>\r\n");
      out.write("                                <td><input type='password' id='logpass' name='logpass' onblur=\"passwordCheck();\" onfocus=\"backWhite(this);\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td></td>\r\n");
      out.write("                                <td><input type='submit' id=\"log\" value=\"Login\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </table>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div> <!--login form-->\r\n");
      out.write("\r\n");
      out.write("            </div> <!--end of login-->\r\n");
      out.write("\r\n");
      out.write("            <!--SIGN UP-->\r\n");
      out.write("            <div id=\"signup\">\r\n");
      out.write("\r\n");
      out.write("                <div style=\"font-weight:bold;\">Not yet a member<input type='button' id='signupbutton' value='signup'>\r\n");
      out.write("                </div> <!--signup button-->\r\n");
      out.write("\r\n");
      out.write("                <div id=\"signupform\">\r\n");
      out.write("                    <a href=\"signup.html\"> Sign up </a>\r\n");
      out.write("                </div> <!--signup form-->\r\n");
      out.write("\r\n");
      out.write("            </div> <!--end of signup-->\r\n");
      out.write("        </div> <!--account-->\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("        <h4 style=\"position: absolute; color: red; top:87%; left:45%;\">Please try again!<br>\r\n");
      out.write("            Your username or password is incorrect</h4>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
