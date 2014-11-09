
package DAO.Implementation;

import Beans.ProductBean;
import Beans.ProductManagerBean;
import DAO.Interface.ProductManagerDAOInterface;
import DBConnection.Connector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Danica
 */
public class ProductManagerDAOImplementation implements ProductManagerDAOInterface {
    ProductManagerBean bean = new ProductManagerBean();
    int productmanagerID, prodmanager_accountID;
    String prodType;
    String query;
    
       public boolean addProductManager(ProductManagerBean productManager) {
        try {
            Connector c = new Connector();
            Connection connection = c.getConnection();
            String query = "insert into productmanager (productmanager_accountID) values (?)";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, productManager.getProdmanager_accountID());
            ps.executeUpdate();
            connection.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAOImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    
    @Override
    public ProductManagerBean getProductManager(int ID) {
        try {
            Connector c = new Connector();
            Connection connection = c.getConnection();
            query = "select * from product where productID = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, ID);
            
            ResultSet resultSet = ps.executeQuery();
            
            while(resultSet.next()) {
                productmanagerID = resultSet.getInt("productmanagerID");
                prodmanager_accountID = resultSet.getInt("prodmanager_accountID");
                prodType = resultSet.getString("prodType");
                
                bean = new ProductManagerBean();
                
                bean.setProdType(prodType);
                bean.setProdmanager_accountID(prodmanager_accountID);
                bean.setProductmanagerID(productmanagerID);
            }
            connection.close();
            return bean;
            
        } catch (SQLException ex) {
            Logger.getLogger(MagazineDAOImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public boolean editProductManager(ProductManagerBean productManager) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ProductBean viewProduct(int ID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addProduct(ProductBean product) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editProduct(ProductBean product) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeProduct(ProductBean product) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
