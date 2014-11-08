
package Servlet;

import javax.servlet.http.HttpServlet;
import Beans.AccountBean;
import javax.servlet.annotation.WebServlet;
    
@WebServlet(name = "AddAccount", urlPatterns = {"/AddAccount"})
public class AddAccount extends HttpServlet{

}