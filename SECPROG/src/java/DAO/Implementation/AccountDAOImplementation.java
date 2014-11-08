
package DAO.Implementation;

import Beans.AccountBean;
import DAO.Interface.AccountDAOInterface;
import DBConnection.Connector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AccountDAOImplementation implements AccountDAOInterface{
   
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    Connector connector = new Connector();
    Connection connection = connector.getConnection();

    public boolean addAccount(AccountBean accountBean) {
        
        try {
            Connector c = new Connector();
            Connection connection = c.getConnection();
            String query = "insert into account (firstName, lastName, middleInitial, username, password, emailAdd, accounttype) values (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, accountBean.getFirstName());
            ps.setString(2, accountBean.getLastName());
            ps.setString(3, accountBean.getMiddleInitial());
            ps.setString(4, accountBean.getUsername());
            ps.setString(5, accountBean.getPassword());
            ps.setString(6, accountBean.getEmailAdd());
            ps.setString(7, accountBean.getAccountType());
            ps.executeUpdate();
            connection.close();
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAOImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean updateAccount(AccountBean accountBean) {
        int rowsAffected = 0;
        int index = 1;
        String query = "UPDATE account SET firstName=?, lastName=?, middleInitial=?, username=?, password=?, emailAdd=?, type=? WHERE username=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(index++, accountBean.getFirstName());
            preparedStatement.setString(index++, accountBean.getLastName());
            preparedStatement.setString(index++, accountBean.getMiddleInitial());
            preparedStatement.setString(index++, accountBean.getUsername());
            preparedStatement.setString(index++, accountBean.getPassword());
            preparedStatement.setString(index++, accountBean.getEmailAdd());
            preparedStatement.setString(index++, accountBean.getAccountType());
            rowsAffected = preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAOImplementation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AccountDAOImplementation.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return rowsAffected == 1;
    }

    @Override
    public AccountBean getUser(String username) {
             String query = "select * from account where username = ?";
       
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, username);
            
            ResultSet resultSet = ps.executeQuery();

            String firstName, lastName, middleInitial, uname, password, emailAdd, type;
            int accountID;
            
            AccountBean bean = new AccountBean();

            while (resultSet.next()) {
                firstName = resultSet.getString("firstName");
                lastName = resultSet.getString("lastName");
                middleInitial = resultSet.getString("middleInitial");
                uname = resultSet.getString("username");
                password = resultSet.getString("password");
                emailAdd = resultSet.getString("emailAdd");
                type = resultSet.getString("type");
                accountID = resultSet.getInt("accountID");;

                bean.setAccountID(accountID);
                bean.setAccountType(type);
                bean.setEmailAdd(emailAdd);
                bean.setFirstName(firstName);
                bean.setLastName(lastName);
                bean.setMiddleInitial(middleInitial);
                bean.setPassword(password);
                bean.setUsername(uname);
                
                System.out.println("hssere");
                return bean;
            }

        } catch (SQLException ex) {
            Logger.getLogger(AccountDAOImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    
    }
    
    @Override
    public boolean doesUserExist(String username, String password)
    {
        boolean result = false;
        String query = "SELECT * FROM account WHERE username = ? AND password = ?";
        int index = 1; //use index nabasa ko sa ppt hehe
        try{
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(index++, username);
            ps.setString(index++, password);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                result=true;
            }
            connection.close();
        }
        catch(SQLException ex)
        { 
            ex.printStackTrace();
        }
        return result;
    }

    @Override
    public boolean isAdmin(String username, String password)
    {
        boolean result = false;
        String query = "SELECT * FROM admin WHERE adminUsername = ? AND adminPassword = ?";
        int index = 1;
        try{
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(index++, username);
            ps.setString(index++, password);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                result=true;
            }
            connection.close();
        }
        catch(SQLException ex)
        { ex.printStackTrace();}
        return result;
    }
}
   
