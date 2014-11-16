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
 * @author Giodee
 */
public class ProductManagerDAOImplementation implements ProductManagerDAOInterface {

    @Override
    public ProductManagerBean getProductManagerBeanById(int id) {
        try {
            Connector c = new Connector();
            Connection connection = c.getConnection();
            String query = "select * from productmanager where prodmanager_accountID = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, id);

            ResultSet resultSet = ps.executeQuery();

            int productmanagerID, productmanager_accountID;
            String prodType;

            ProductManagerBean bean = new ProductManagerBean();

            while (resultSet.next()) {
                productmanagerID = resultSet.getInt("productmanagerID");
                productmanager_accountID = resultSet.getInt("prodmanager_accountID");
                prodType = resultSet.getString("prodType");

                bean.setProdType(prodType);
                bean.setProdmanager_accountID(productmanager_accountID);
                bean.setProductmanagerID(productmanagerID);

                System.out.println("hssere");

            }
            connection.close();
            return bean;

        } catch (SQLException ex) {
            Logger.getLogger(AccountDAOImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public boolean addProduct(ProductBean product) {
        try {
            Connector c = new Connector();
            Connection connection = c.getConnection();
            String query = "insert into product (type, title, price, summary, genre, year, stocks) "
                    + "values (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, product.getType());
            ps.setString(2, product.getTitle());
            ps.setDouble(3, product.getPrice());
            ps.setString(4, product.getSummary());
            ps.setString(5, product.getGenre());
            ps.setInt(6, product.getYear());
            ps.setInt(7, product.getNumberStocks());
            ps.executeUpdate();
            connection.close();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(AudioCDManagerDAOImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public ProductBean getLastProduct() {
        try {
            Connector c = new Connector();
            Connection connection = c.getConnection();
            String query = "select * from product "
                    + "order by productID desc "
                    + "limit 1";
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet resultSet = ps.executeQuery();

            ProductBean bean = new ProductBean();
            int productID, year, stocks;
            String type, title, summary, genre;
            double price;
            while (resultSet.next()) {
                productID = resultSet.getInt("productID");
                year = resultSet.getInt("year");
                stocks = resultSet.getInt("stocks");
                
                type = resultSet.getString("type");
                title = resultSet.getString("title");
                summary = resultSet.getString("summary");
                genre = resultSet.getString("genre");
                
                price = resultSet.getDouble("price");

                bean.setProductID(productID);
                bean.setYear(year);
                bean.setNumberStocks(stocks);
                
                bean.setType(type);
                bean.setTitle(title);
                bean.setSummary(summary);
                bean.setGenre(genre);
                
                bean.setPrice(price);
                
                return bean;
            }

        } catch (SQLException ex) {
            Logger.getLogger(AudioCDManagerDAOImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
