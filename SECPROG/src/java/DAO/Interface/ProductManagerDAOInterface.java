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
import Beans.ProductManagerBean;
import Beans.ProductBean;
import DAO.Interface.ProductDAOInterface;

public interface ProductManagerDAOInterface {
    public ProductManagerBean getProductManager (int ID);
    public boolean addProductManager(ProductManagerBean productManager);
    public boolean editProductManager (ProductManagerBean productManager);
    public ProductBean viewProduct (int ID);
    public boolean addProduct (ProductBean product);
    public boolean editProduct (ProductBean product);
    public boolean removeProduct (ProductBean product);
    
}
