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

import Beans.AdminBean;
import Beans.ProductManagerBean;
import Beans.AccountingManagerBean;
import java.util.ArrayList;

public interface AdminDAOInterface {
    public AdminBean getAdmin (int ID);
    public boolean addAdmin(AdminBean admin);
    public boolean editAdmin(int adminID);
    public AdminBean getAdminById(int adminID);
    public ArrayList<AdminBean> getAdminByFullName(String firstname, String lastname);
        
    public boolean unlockAccount (int AccountID);
        
//    public void viewActivityProductManager (ProductManagerBean manager);
//    public void viewActivityAccountingManager (AccountingManagerBean manager);
    
}
