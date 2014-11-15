
package DAO.Interface;

import Beans.AccountBean;
import java.util.ArrayList;

public interface AccountDAOInterface {
    public boolean addAccount(AccountBean accountBean);
    public boolean lockAccount (AccountBean accountBean);
    public AccountBean getUserByUsername(String username);
    public boolean doesUserExist(String username, String password);
    public boolean updateAccount(AccountBean accountBean);
    
    public ArrayList<AccountBean> getAccountByName(String firstname, String lastname);
    public ArrayList<AccountBean> getAccountByFirstName(String firstname);
    public ArrayList<AccountBean> getAccountByLastName(String lastname);
    public ArrayList<AccountBean> getAllAccounts();
    public boolean deleteAccount(int accountID);

    /*
    public boolean isAdmin(String username, String password);
    
    public boolean isCustomer(String username, String password);
    public boolean isProductManager(String username, String password);
    public boolean isAccountingManager(String username, String password);
    */
}
