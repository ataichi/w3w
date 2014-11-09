/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Implementation;

import Beans.AccountingManagerBean;
import DAO.Interface.AccountingManagerDAOInterface;
import DBConnection.Connector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Giodee
 */
public class AccountingManagerDAOImplementation implements AccountingManagerDAOInterface {

    @Override
    public boolean addAccountingManager(AccountingManagerBean accountingManager) {
        try {
            Connector c = new Connector();

            Connection connection = c.getConnection();
            String query = "insert into accountingmanager (accounting_accountID) values (?)";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, accountingManager.getAccountingManager_accountID());
            
            ps.executeUpdate();
            connection.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAOImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean editAccountingManager(AccountingManagerBean accountingManager) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteAccountingManager(int accountingManagerID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AccountingManagerBean getAccountingManagerByID(int ID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
