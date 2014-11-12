/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Implementation;

import Beans.CreditCardBean;
import DAO.Interface.CreditCardDAOInterface;
import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author Danica
 */
public class CreditCardImplementation implements CreditCardDAOInterface {

    @Override
    public boolean addCreditCard(CreditCardBean creditCard) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editCreditCard(CreditCardBean creditCard) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteCreditCard(int creditCardID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<CreditCardBean> getCreditCardByCardName(String cardName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CreditCardBean getCreditCardByCardNo(String cardNo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<CreditCardBean> getCreditCardByCardType(String cardType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<CreditCardBean> getCreditCardByExpDate(Date from, Date to) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<CreditCardBean> getUserCreditCard(int customerID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
