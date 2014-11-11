package DAO.Interface;

import Beans.AccountBean;
import Beans.AdminBean;
import Beans.ProductManagerBean;
import Beans.AccountingManagerBean;
import Beans.ProductBean;
import java.util.ArrayList;

public interface AdminDAOInterface {
    public AdminBean getAdmin (int ID);
    public boolean addAdmin(AdminBean admin);
    public boolean editAdmin(int adminID);
    public AdminBean getAdminById(int adminID);
    public ArrayList<AdminBean> getAdminByFullName(String firstname, String lastname);
    
    //Create Product Manager
    public ProductManagerBean getProductManager (int ID);
    public boolean addProductManager(ProductManagerBean productManager);
    public boolean editProductManager (ProductManagerBean productManager);
    public ProductBean viewProduct (int ID);
    
    public boolean unlockAccount (int AccountID);
    public void viewActivityLog(); //Log bean :(
//    public void viewActivityProductManager (ProductManagerBean manager);
//    public void viewActivityAccountingManager (AccountingManagerBean manager);
    public ArrayList<AccountBean> searchUserByFirstName(String firstname);
    
}
