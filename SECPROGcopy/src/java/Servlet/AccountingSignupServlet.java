/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Beans.AccountBean;
import Beans.AccountingManagerBean;
import DAO.Implementation.AccountDAOImplementation;
import DAO.Implementation.AccountingManagerDAOImplementation;
import DAO.Interface.AccountDAOInterface;
import DAO.Interface.AccountingManagerDAOInterface;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Giodee
 */
@WebServlet(name = "AccountingSignupServlet", urlPatterns = {"/AccountingSignupServlet"})
public class AccountingSignupServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            HttpSession session = request.getSession();
            AccountBean account = new AccountBean();
            AccountingManagerBean accountingManager = new AccountingManagerBean();
            AccountDAOInterface userdao = new AccountDAOImplementation();
            AccountingManagerDAOInterface amdao = new AccountingManagerDAOImplementation();

            String firstname = request.getParameter("fname");
            String lastname = request.getParameter("lname");
            String mInitial = request.getParameter("mname");
            String email = request.getParameter("email");
            String username = request.getParameter("uname");
            String pass1 = request.getParameter("pass1");
            boolean checkAccount, checkAccountingManager;
            boolean locked=false;
            
            account.setFirstName(firstname);
            account.setLastName(lastname);
            account.setMiddleInitial(mInitial);
            account.setPassword(pass1);
            account.setEmailAdd(email);
            account.setUsername(username);
            account.setAccountType("accounting manager");
            account.setLocked(locked);
            
            checkAccount = userdao.addAccount(account);
            
            int accountingmanager_accountID = userdao.getUserByUsername(username).getAccountID();
            
            accountingManager.setAccountingManager_accountID(accountingmanager_accountID);
            checkAccountingManager = amdao.addAccountingManager(accountingManager);
            
            if(checkAccount && checkAccountingManager){
                response.sendRedirect("adminHOME.jsp");
                //successful
            }else{
                response.sendRedirect("signupfail.jsp");
            }

        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
