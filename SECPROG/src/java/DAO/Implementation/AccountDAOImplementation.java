
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

        int rowsAffected = 0;
        String query = "INSERT INTO account(firstName, lastName, middleInitial, username, password, emailAdd, type) values (?,?,?,?,?,?,?)";

        try {

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, accountBean.getFirstName());
            preparedStatement.setString(2, accountBean.getLastName());
            preparedStatement.setString(3, accountBean.getMiddleInitial());
            preparedStatement.setString(4, accountBean.getUsername());
            preparedStatement.setString(5, accountBean.getPassword());
            preparedStatement.setString(6, accountBean.getEmailAdd());
            preparedStatement.setString(7, accountBean.getAccountType());
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

    public boolean updateAccount(AccountBean accountBean) {
        int rowsAffected = 0;
        String query = "UPDATE account SET name=?, email=?, password=?, confirmpass=?, birthday=?, sex=?, biography=? WHERE username=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
  /*          preparedStatement.setString(1, accountBean.getName());
            preparedStatement.setString(2, accountBean.getEmail());
            preparedStatement.setString(3, accountBean.getPassword());
            preparedStatement.setString(4, accountBean.getConfirmpass());
            preparedStatement.setString(5, accountBean.getBirthday());
            preparedStatement.setString(6, accountBean.getSex());
            preparedStatement.setString(7, accountBean.getBiography());
            preparedStatement.setString(8, accountBean.getUsername());
*/
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
}
   
