/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Implementation;

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

}
