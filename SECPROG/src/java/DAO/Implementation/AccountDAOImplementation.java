
package DAO.Implementation;

import Beans.AccountBean;
import DBConnection.Connector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AccountDAOImplementation {
   
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    Connector connector = new Connector();
    Connection connection = connector.getConnection();

    public boolean addAccount(AccountBean accountBean) {

        int rowsAffected = 0;
        String query = "INSERT INTO account(username, name, email, password, confirmpass, birthday, sex, biography) values (?,?,?,?,?,?,?,?)";

        try {

            PreparedStatement preparedStatement = connection.prepareStatement(query);
/*            preparedStatement.setString(1, accountBean.getUsername());
            preparedStatement.setString(2, accountBean.getName());
            preparedStatement.setString(3, accountBean.getEmail());
            preparedStatement.setString(4, accountBean.getPassword());
            preparedStatement.setString(5, accountBean.getConfirmpass());
            preparedStatement.setString(6, accountBean.getBirthday());
            preparedStatement.setString(7, accountBean.getSex());
            preparedStatement.setString(8, accountBean.getBiography());
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
}
   
