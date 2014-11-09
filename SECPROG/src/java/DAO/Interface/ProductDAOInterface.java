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

public interface ProductDAOInterface {
    public ProductBean getProduct (int ID);
    public boolean addProduct (ProductBean product);
    public boolean editProduct (ProductBean product);
    public boolean deleteProduct (ProductBean product);
}
