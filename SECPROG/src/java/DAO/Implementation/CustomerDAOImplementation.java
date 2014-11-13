
package DAO.Implementation;

import Beans.CustomerBean;
import Beans.ProductBean;
import DAO.Interface.CustomerDAOInterface;
import DBConnection.Connector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Giodee
 */
public class CustomerDAOImplementation implements CustomerDAOInterface {

    @Override
    public boolean addCustomer(CustomerBean customerBean) {
    try {
            Connector c = new Connector();
            Connection connection = c.getConnection();
            String query = "insert into customer (apartmentnoBA, streetBA, subdivisionBA, cityBA, postalcodeBA, countryBA,"
                    + " apartmentnoDA, streetDA, subdivisionDA, cityDA, postalcodeDA, countryDA, customer_accountID) "
                    + "values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, customerBean.getApartmentNoBA());
            ps.setString(2, customerBean.getStreetBA());
            ps.setString(3, customerBean.getSubdivisionBA());
            ps.setString(4, customerBean.getCityBA());
            ps.setInt(5, customerBean.getPostalCodeBA());
            ps.setString(6, customerBean.getCountryBA());
            
            ps.setString(7, customerBean.getApartmentNoBA());
            ps.setString(8, customerBean.getStreetBA());
            ps.setString(9, customerBean.getSubdivisionBA());
            ps.setString(10, customerBean.getCityBA());
            ps.setInt(11, customerBean.getPostalCodeBA());
            ps.setString(12, customerBean.getCountryBA());  
            ps.setInt(13, customerBean.getCustomer_accountID());
            ps.executeUpdate();
            connection.close();
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAOImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean editCustomer(CustomerBean customerBean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeCustomer(int customerID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CustomerBean getCustomerById(int customerID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<CustomerBean> getAllCustomers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addToCart(ProductBean product) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeFromCart(ProductBean product) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ProductBean> viewCart() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean purchase(int productID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ProductBean viewProduct(int ProductID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ProductBean searchProduct(int ProductID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



}
