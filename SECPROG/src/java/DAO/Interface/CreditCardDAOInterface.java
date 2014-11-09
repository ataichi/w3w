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

import Beans.CreditCardBean;

public interface CreditCardDAOInterface {
    public CreditCardBean getCreditCard (int CardNumber);
    public boolean addCreditCard (CreditCardBean creditCard);
    public boolean editCreditCard (CreditCardBean creditCard);
    public boolean deleteCreditCard (CreditCardBean creditCard);
}
