/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    ProductManagerBean prodmngrbean = new ProductManagerBean();
    ProductBean prodbean = new ProductBean();
    int productmanagerID, prodmanager_accountID;
    String prodType;
    int productID;
    String title, type, summary, genre;
    double price;
    int year;
    String query;
    
    @Override
    public ProductManagerBean getProductManager(int ID) {
        try {
            Connector c = new Connector();
            Connection connection = c.getConnection();
            query = "select * from productmanager where productmanagerID = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, ID);
            
            ResultSet resultSet = ps.executeQuery();
            
            while(resultSet.next()) {
                productmanagerID = resultSet.getInt("productmanagerID");
                prodmanager_accountID = resultSet.getInt("prodmanager_accountID");
                prodType = resultSet.getString("prodType");
                
                prodmngrbean = new ProductManagerBean();
                
                prodmngrbean.setProdType(prodType);
                prodmngrbean.setProdmanager_accountID(prodmanager_accountID);
                prodmngrbean.setProductmanagerID(productmanagerID);
            }
            connection.close();
            return prodmngrbean;
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductManagerDAOImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public boolean editProductManager(ProductManagerBean productManager) {
        try {
            Connector c = new Connector();
            Connection connection = c.getConnection();
            query = "update productmanager set prodmanager_accountID = ? prodType = ? where productmanagerID = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, productManager.getProdmanager_accountID());
            ps.setString(2, productManager.getProdType());
            ps.setInt(3, productManager.getProductmanagerID());
            ps.executeUpdate();
            
            connection.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ProductManagerDAOImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
            return false;
    }

    @Override
    public ProductBean viewProduct(int ID) {
        try {
            Connector c = new Connector();
            Connection connection = c.getConnection();
            query = "select * from product where productID = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, ID);
            
            ResultSet resultSet = ps.executeQuery();
            
            while(resultSet.next()) {
                productID = resultSet.getInt("productID");
                type = resultSet.getString("type");
                title = resultSet.getString("title");
                price = resultSet.getDouble("price");
                summary = resultSet.getString("summary");
                genre = resultSet.getString("genre");
                year = resultSet.getInt("year");
                
                prodbean = new ProductBean();
                
                prodbean.setProductID(productID);
                prodbean.setType(type);
                prodbean.setTitle(title);
                prodbean.setPrice(price);
                prodbean.setSummary(summary);
                prodbean.setGenre(genre);
                prodbean.setYear(year);
                
            }
            
            return prodbean;
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductManagerDAOImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
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
