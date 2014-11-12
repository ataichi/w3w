/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Implementation;

import Beans.AdminBean;
import DAO.Interface.AdminDAOInterface;
import java.util.ArrayList;

/**
 *
 * @author Danica
 */
public class AdminDAOImplementation implements AdminDAOInterface {

    @Override
    public AdminBean getAdmin(int ID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAdmin(AdminBean admin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editAdmin(int adminID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AdminBean getAdminById(int adminID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<AdminBean> getAdminByFullName(String firstname, String lastname) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean unlockAccount(int AccountID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
