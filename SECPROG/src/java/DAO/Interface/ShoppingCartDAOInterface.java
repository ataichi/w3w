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

import Beans.ShoppingCartBean;
import Beans.CreditCardBean;
import Beans.ProductOrderBean;

public interface ShoppingCartDAOInterface {
    public void viewCardDetails (CreditCardBean card);
    public boolean checkOut ();
    public boolean updateCart (ShoppingCartBean shoppingCart);
    public boolean removeCart(ShoppingCartBean shoppingCart);
    public boolean addtoCart (ProductOrderBean productOrder);
    public void cancelOrder();
}
