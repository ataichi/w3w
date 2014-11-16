/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Beans.AccountBean;
import Beans.AudioCDBean;
import Beans.BookBean;
import Beans.ProductBean;
import Beans.ProductManagerBean;
import DAO.Implementation.AudioCDManagerDAOImplementation;
import DAO.Implementation.BookManagerDAOImplementation;
import DAO.Implementation.ProductManagerDAOImplementation;
import DAO.Interface.AudioCDManagerDAOInterface;
import DAO.Interface.BookManagerDAOInterface;
import DAO.Interface.ProductManagerDAOInterface;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(name = "AddProductServlet", urlPatterns = {"/AddProductServlet"})
public class AddProductServlet extends HttpServlet {

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
            productManager = pdao.getProductManagerBeanById(homeproduct.getAccountID());
            AudioCDManagerDAOInterface cdao = new AudioCDManagerDAOImplementation();
            BookManagerDAOInterface bdao = new BookManagerDAOImplementation();
            
            ProductBean product = new ProductBean();
            String type, title, summary, genre;
            double price;
            int year, numberStocks;

            type = productManager.getProdType();
            title = request.getParameter("productTitle");
            summary = request.getParameter("productSummary");
            genre = request.getParameter("productGenre");
            price = Double.parseDouble(request.getParameter("productPrice"));
            year = Integer.parseInt(request.getParameter("productYear"));
            numberStocks = Integer.parseInt(request.getParameter("productStocks"));

            product.setGenre(genre);
            product.setNumberStocks(numberStocks);
            product.setPrice(price);
            product.setSummary(summary);
            product.setTitle(title);
            product.setType(type);
            product.setYear(year);

            boolean addProduct = false;
            if (type.equals("Audio CD")) {// add audio cd
                AudioCDBean cd = new AudioCDBean();
                String artist, recordCompany;

                artist = request.getParameter("cdArtist");
                recordCompany = request.getParameter("cdRecord");

                boolean addCD = false;

                addProduct = pdao.addProduct(product);
                product = pdao.getLastProduct();

                if (addProduct) {
                    cd.setAudiocd_productID(product.getProductID());
                    cd.setArtist(artist);
                    cd.setRecordCompany(recordCompany);

                    addCD = cdao.addAudioCD(cd);

                    if (addCD) { // success
                        response.sendRedirect("productmanagerHOME.jsp");
                    } else { //error
                        response.sendRedirect("addproduct.jsp");
                    }
                } else { // may error
                    response.sendRedirect("productmanagerHOME.jsp");
                }

            } else if (type.equals("Books")) {// add books
                BookBean bean = new BookBean();
                String author, publisher, bookDatePublished;
                java.util.Date date;
                java.sql.Date sqlDate;

                author = request.getParameter("bookAuthor");
                publisher = request.getParameter("bookPublisher");
                DateFormat formatter;
                bookDatePublished = request.getParameter("bookDatePublished");

                
                formatter = new SimpleDateFormat("yyyy-MM-dd");
                try {
                    date = formatter.parse(bookDatePublished);
                    sqlDate = new java.sql.Date(date.getTime());
                    bean.setDatePublished(sqlDate);
                    out.println(formatter.format(sqlDate));
                } catch (ParseException ex) {
                    Logger.getLogger(AddProductServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
               
                
                bean.setAuthor(author);
                bean.setPublisher(publisher);
                
                addProduct=pdao.addProduct(product);
                boolean addBook = false;
                if(addProduct){
                    product = pdao.getLastProduct();
                    int book_productID = product.getProductID();
                    bean.setBook_productID(book_productID);
                    addBook = bdao.addBook(bean);
                    if(addBook){
                        response.sendRedirect("productmanagerHOME.jsp");
                    }else{
                        response.sendRedirect("addproduct.jsp");
                    }
                }else{
                    out.println("productmanagerHOME.jsp");
                }
                
                
                
            }

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
