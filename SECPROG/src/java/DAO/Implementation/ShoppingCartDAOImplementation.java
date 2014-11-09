/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Implementation;

import Beans.CreditCardBean;
import Beans.ProductOrderBean;
import Beans.ShoppingCartBean;
import DAO.Interface.ShoppingCartDAOInterface;

/**
 *
 * @author Danica
 */
public class ShoppingCartDAOImplementation implements ShoppingCartDAOInterface {

    @Override
    public void viewCardDetails(CreditCardBean card) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean checkOut() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateCart(ShoppingCartBean shoppingCart) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeCart(ShoppingCartBean shoppingCart) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addtoCart(ProductOrderBean productOrder) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cancelOrder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
