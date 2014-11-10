/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Implementation;

import Beans.ProductBean;
import DAO.Interface.ProductDAOInterface;
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
public class ProductDAOImplementation implements ProductDAOInterface {

    ProductBean bean = new ProductBean();
    int productID;
    String type, title, summary, genre;
    int year;
    double price;
    String query;
    
    @Override
    public ProductBean getProduct(int ID) {
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
                summary = resultSet.getString("summary");
                genre = resultSet.getString("genre");
                year = resultSet.getInt("year");
                price = resultSet.getDouble("price");
                
                bean = new ProductBean();
                
                bean.setProductID(productID);
                bean.setType(type);
                bean.setTitle(title);
                bean.setSummary(summary);
                bean.setGenre(genre);
                bean.setYear(year);
                bean.setPrice(price);
            }
            connection.close();
            return bean;
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAOImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public boolean addProduct(ProductBean product) {
        try {
            Connector c = new Connector();
            Connection connection = c.getConnection();
            query = "insert into product (type, title, summary, genre, price, year) values (?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, product.getType());
            ps.setString(2, product.getTitle());
            ps.setString(3, product.getSummary());
            ps.setString(4, product.getGenre());
            ps.setDouble(5, product.getPrice());
            ps.setInt(6, product.getYear());
            ps.executeUpdate();
            connection.close();
            return true;
        
        
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAOImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean editProduct(ProductBean product) {
        try {
            Connector c = new Connector();
            Connection connection = c.getConnection();
            query = "update product set type = ?, title = ?, summary = ? genre = ? price = ? year = ? where productID = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, product.getType());
            ps.setString(2, product.getTitle());
            ps.setString(3, product.getSummary());
            ps.setString(4, product.getGenre());
            ps.setDouble(5, product.getPrice());
            ps.setInt(6, product.getYear());
            ps.executeUpdate();
            
            connection.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAOImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
            return false;
    }

    @Override
    public boolean deleteProduct(ProductBean product) {
        
        try {
            Connector c = new Connector();
            Connection connection = c.getConnection();
            query = "delete from product where productID = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, product.getProductID());
            connection.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAOImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    
    
    }
    
}
