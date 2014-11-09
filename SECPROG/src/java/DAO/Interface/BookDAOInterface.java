/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Interface;

/**
 *
 * @author jao
 */

import Beans.BookBean;

public interface BookDAOInterface {
    public BookBean getBook (int ID);
    public boolean addBook (BookBean book);
    public boolean editBook (BookBean book);
    public boolean deleteBook (BookBean book);
}
