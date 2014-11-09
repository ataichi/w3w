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

import Beans.ProductBean;

public interface ProductOrderDAOInterface {
    public boolean addProduct (int ID);
    public boolean removeProduct (int ID);
}
