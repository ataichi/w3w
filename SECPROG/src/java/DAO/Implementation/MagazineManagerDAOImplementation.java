/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Implementation;

import Beans.MagazineBean;
import DAO.Interface.MagazineManagerDAOInterface;
import DBConnection.Connector;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Danica
 */
public class MagazineManagerDAOImplementation implements MagazineManagerDAOInterface{
    MagazineBean bean = new MagazineBean();
    int magazineID, magazine_accountID, volumeNo, issueNo;
    String publisher;
    java.util.Date datePublished = new java.util.Date();
    String query;
    
    @Override
    public MagazineBean getMagazine(int ID) {
        try {
            Connector c = new Connector();
            Connection connection = c.getConnection();
            query = "select * from magazine where magazineID = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, ID);
            
            ResultSet resultSet = ps.executeQuery();
            
            while(resultSet.next()) {
                magazineID = resultSet.getInt("magazineID");
                //magazine_accountID = resultSet.getInt("magazine_accountID");
                volumeNo = resultSet.getInt("volumeNo");
                issueNo = resultSet.getInt("issueNo");
                publisher = resultSet.getString("publisher");
                datePublished = resultSet.getDate("datePublished");
                
                bean = new MagazineBean();
                
                bean.setMagazineID(magazineID);
                bean.setIssueNo(issueNo);
                bean.setVolumeNo(volumeNo);
                bean.setPublisher(publisher);
                bean.setDatePublished((Date) datePublished);
            }
            connection.close();
            return bean;
            
        } catch (SQLException ex) {
            Logger.getLogger(MagazineManagerDAOImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public boolean addMagazine(MagazineBean magazine) {
        try {
            Connector c = new Connector();
            Connection connection = c.getConnection();
            query = "insert into magazine (magazine_productID, volumeNo, issueNo, publisher, datePublished) values (?, ?, ?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, magazine.getMagazine_productID());
            ps.setInt(2, magazine.getVolumeNo());
            ps.setInt(3, magazine.getIssueNo());
            ps.setString(4, magazine.getPublisher());
            ps.setDate(5, magazine.getDatePublished());
            ps.executeUpdate();
            connection.close();
            return true;
        
        
        } catch (SQLException ex) {
            Logger.getLogger(MagazineManagerDAOImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean editMagazine(MagazineBean magazine) {
        try {
            Connector c = new Connector();
            Connection connection = c.getConnection();
            query = "update magazine set volumeNo = ?, issueNo = ?, publisher = ? datePublished = ? where magazineID = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, magazine.getVolumeNo());
            ps.setInt(2, magazine.getIssueNo());
            ps.setString(3, magazine.getPublisher());
            ps.setDate(4, magazine.getDatePublished());
            ps.setInt(5, magazine.getMagazineID());
            ps.executeUpdate();
            
            connection.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(MagazineManagerDAOImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
            return false;
    }

    @Override
    public boolean deleteMagazine(MagazineBean magazine) {
        
        try {
            Connector c = new Connector();
            Connection connection = c.getConnection();
            query = "delete from magazine where magazineID = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, magazine.getMagazineID());
            connection.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(MagazineManagerDAOImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    
    }

    @Override
    public ArrayList<MagazineBean> viewAllMagazine() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean restockMagazine(int productID, int num) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<MagazineBean> searchMagazinebyTitle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
