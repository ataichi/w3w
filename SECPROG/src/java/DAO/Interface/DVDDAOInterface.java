/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Interface;

/**
 *
 * @author jao
 */

import Beans.DVDBean;

public interface DVDDAOInterface {
    public DVDBean getDVD (int ID);
    public boolean addDVD (DVDBean DVD);
    public boolean editDVD (DVDBean DVD);
    public boolean deleteDVD (DVDBean DVD);
}
