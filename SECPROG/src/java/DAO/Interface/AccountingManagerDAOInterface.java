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

import Beans.AccountingManagerBean;
import java.util.ArrayList;

public interface AccountingManagerDAOInterface {
  public AccountingManagerBean getAccountingManager (int ID);
  public boolean editAccountingManager (AccountingManagerBean accountingManager);  
  /**public viewSales ();
  public viewSalesByProductType ();
  public viewSalesByYear ();
  public viewSalesByMonth ();
  public viewSalesByWeek ();
  public viewSalesByDaw ();**/
}
