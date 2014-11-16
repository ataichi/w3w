/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Beans.AccountBean;
import Beans.AudioCDBean;
import Beans.BookBean;
import Beans.DVDBean;
import Beans.MagazineBean;
import Beans.ProductBean;
import Beans.ProductManagerBean;
import DAO.Implementation.AudioCDDAOImplementation;
import DAO.Implementation.BookDAOImplementation;
import DAO.Implementation.DVDDAOImplementation;
import DAO.Implementation.MagazineDAOImplementation;
import DAO.Implementation.ProductDAOImplementation;
import DAO.Implementation.ProductManagerDAOImplementation;
import DAO.Interface.AudioCDDAOInterface;
import DAO.Interface.BookDAOInterface;
import DAO.Interface.DVDDAOInterface;
import DAO.Interface.MagazineDAOInterface;
import DAO.Interface.ProductDAOInterface;
import DAO.Interface.ProductManagerDAOInterface;
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
@WebServlet(name = "EditProductServlet", urlPatterns = {"/EditProductServlet"})
public class EditProductServlet extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

            HttpSession session = request.getSession();
            AccountBean homeproduct = (AccountBean) session.getAttribute("homeproduct");
            ProductManagerBean productManager = new ProductManagerBean();
            ProductManagerDAOInterface pdao = new ProductManagerDAOImplementation();
            ProductDAOInterface productdao = new ProductDAOImplementation();
            productManager = pdao.getProductManagerBeanById(homeproduct.getAccountID());

            int productID = Integer.parseInt(request.getParameter("product"));
            ProductBean editproduct = new ProductBean();
            editproduct = productdao.getProductById(productID);
            
            if(editproduct.getType().equals("Audio CD")){
                AudioCDBean audiocd = new AudioCDBean();
                AudioCDDAOInterface audiodao = new AudioCDDAOImplementation();
                audiocd = audiodao.getAudioCDByProductId(productID);
                
                session.setAttribute("editaudio", audiocd);
            }else if(editproduct.getType().equals("Books")){
                BookBean book = new BookBean();
                BookDAOInterface bookdao = new BookDAOImplementation();
                book = bookdao.getBookByProductId(productID);
                
                session.setAttribute("editbook", book);
            }else if(editproduct.getType().equals("DVD")){
                DVDBean dvd = new DVDBean();
                DVDDAOInterface dvddao = new DVDDAOImplementation();
                dvd = dvddao.getDVDByProductId(productID);
                
                session.setAttribute("editdvd", dvd);
            }else if(editproduct.getType().equals("Magazine")){
                MagazineBean magazine = new MagazineBean();
                MagazineDAOInterface magazinedao = new MagazineDAOImplementation();
                magazine = magazinedao.getMagazineByProductId(productID);
                
                session.setAttribute("editmagazine", magazine);
            }

            session.setAttribute("editproduct", editproduct);
            response.sendRedirect("editproduct.jsp");

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
