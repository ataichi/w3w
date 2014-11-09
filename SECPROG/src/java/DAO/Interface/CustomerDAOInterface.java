/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO.Interface;

import Beans.CustomerBean;
import Beans.ProductBean;
import java.util.ArrayList;

/**
 *
 * @author Giodee
 */
public interface CustomerDAOInterface {
       public boolean addCustomer(CustomerBean customerBean);
       public boolean editCustomer(CustomerBean customerBean);
       public boolean removeCustomer(CustomerBean customerBean);
       public boolean viewCustomer(CustomerBean customerBean);
       public boolean addToCart (ProductBean product);
       public boolean removeFromCart (ProductBean product);
       public ArrayList<ProductBean> viewCart();
       public boolean purchase();
       public ProductBean viewProduct (int ProductID);
       public ProductBean searchProduct (int ProductID);
       
       
       
 
}
