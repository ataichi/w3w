package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Servlet.SignupServlet;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Signup</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <form id=\"signform\" name=\"signin\" action=\"SignupServlet\" onsubmit=\"return signcheck(this);\" method=\"post\">\n");
      out.write("                        <table>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>First Name</td>\n");
      out.write("                                <td><input type='text' id='fname' name='fname' onblur=\"fnameCheck();\" onfocus=\"backWhite(this);\"></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Middle Initial</td>\n");
      out.write("                                <td><input type='text' id='mname' name='mname' onblur='mnameCheck()' onfocus='backWhite(this)'></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Last Name</td>\n");
      out.write("                                <td><input type='text' id='lname' name='lname' onblur=\"lnameCheck();\" onfocus=\"backWhite(this);\"></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Username</td>\n");
      out.write("                                <td><input type='text' id='user' name='uname' onblur=\"unameCheck();\" onfocus=\"backWhite(this);\"></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Email</td>\n");
      out.write("                                <td><input type='text' id='email' name='email' onblur=\"emailCheck();\" onfocus=\"backWhite(this);\"></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Password</td>\n");
      out.write("                                <td><input type='password' id='pass1' name='pass1' onblur=\"passCheck();\" onfocus=\"backWhite(this);\"></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Verify Password</td>\n");
      out.write("                                <td><input type='password' id='pass2' name='pass2' onblur=\"passCheck();\" onfocus=\"backWhite(this);\"></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td></td>\n");
      out.write("                                <td><input type='submit' id='sign' value='Signup'></td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                    </form>\n");
      out.write("        <script>\n");
      out.write("       \n");
      out.write("            function logcheck() {\n");
      out.write("                var user = usernameCheck();\n");
      out.write("                var pass = passwordCheck();\n");
      out.write("                if (user == false || pass == false) {\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else {\n");
      out.write("                    return true;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function signcheck() {\n");
      out.write("                var first = fnameCheck();\n");
      out.write("                var middle = mnameCheck();\n");
      out.write("                var last = lnameCheck();\n");
      out.write("                var user = unameCheck();\n");
      out.write("                var email = emailCheck();\n");
      out.write("                var pass = passCheck();\n");
      out.write("\n");
      out.write("                if (first == false || last == false || middle == false || user == false || email == false || pass == false) {\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else {\n");
      out.write("                    return true;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function fnameCheck() {\n");
      out.write("                var first = document.forms[\"signin\"][\"fname\"].value;\n");
      out.write("                if (first == \"\" || first == null || !(/^[A-z ]+$/.test(first))) {\n");
      out.write("                    document.forms[\"signin\"][\"fname\"].style.backgroundColor = \"pink\";\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else {\n");
      out.write("                    document.forms[\"signin\"][\"fname\"].style.backgroundColor = \"white\";\n");
      out.write("                    return true;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            function mnameCheck() {\n");
      out.write("                var middle = document.forms[\"signin\"][\"mname\"].value;\n");
      out.write("                if (middle == \"\" || middle == null || !(/^[A-z ]+$/.test(middle))) {\n");
      out.write("                    document.forms[\"signin\"][\"mname\"].style.backgroundColor = \"pink\";\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else {\n");
      out.write("                    document.forms[\"signin\"][\"mname\"].style.backgroundColor = \"white\";\n");
      out.write("                    return true;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function lnameCheck() {\n");
      out.write("                var last = document.forms[\"signin\"][\"lname\"].value;\n");
      out.write("                if (last == \"\" || last == null || !(/^[A-z ]+$/.test(last))) {\n");
      out.write("                    document.forms[\"signin\"][\"lname\"].style.backgroundColor = \"pink\";\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else {\n");
      out.write("                    document.forms[\"signin\"][\"lname\"].style.backgroundColor = \"white\";\n");
      out.write("                    return true;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function unameCheck() {\n");
      out.write("                var user = document.forms[\"signin\"][\"uname\"].value;\n");
      out.write("                if (user == \"\" || user == null) {\n");
      out.write("                    document.forms[\"signin\"][\"uname\"].style.backgroundColor = \"pink\";\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else {\n");
      out.write("                    document.forms[\"signin\"][\"uname\"].style.backgroundColor = \"white\";\n");
      out.write("                    return true;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function emailCheck() {\n");
      out.write("                var email = document.forms[\"signin\"][\"email\"].value;\n");
      out.write("                var atpos = email.indexOf(\"@\");\n");
      out.write("                var dotpos = email.lastIndexOf(\".\");\n");
      out.write("                if (email == \"\" || email == null || atpos < 1 || dotpos < atpos + 2 || dotpos + 2 >= email.length) {\n");
      out.write("                    document.forms[\"signin\"][\"email\"].style.backgroundColor = \"pink\";\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else {\n");
      out.write("                    document.forms[\"signin\"][\"email\"].style.backgroundColor = \"white\";\n");
      out.write("                    return true;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function passCheck() {\n");
      out.write("                var pass1 = document.forms[\"signin\"][\"pass1\"].value;\n");
      out.write("                var pass2 = document.forms[\"signin\"][\"pass2\"].value;\n");
      out.write("                if (pass1 == \"\" || pass1 == null || pass2 == \"\" || pass2 == null || pass1 != pass2) {\n");
      out.write("                    document.forms[\"signin\"][\"pass1\"].style.backgroundColor = \"pink\";\n");
      out.write("                    document.forms[\"signin\"][\"pass2\"].style.backgroundColor = \"pink\";\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else {\n");
      out.write("                    document.forms[\"signin\"][\"pass1\"].style.backgroundColor = \"white\";\n");
      out.write("                    document.forms[\"signin\"][\"pass2\"].style.backgroundColor = \"white\";\n");
      out.write("                    return true;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function backWhite(x) {\n");
      out.write("                x.style.background = \"white\";\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\n");
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
