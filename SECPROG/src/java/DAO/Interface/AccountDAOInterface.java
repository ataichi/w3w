
package DAO.Interface;

import Beans.AccountBean;

public interface AccountDAOInterface {
    public boolean addAccount(AccountBean accountBean);
    public boolean lockAccount (AccountBean accountBean);
    public AccountBean getUser(String username);
    public boolean doesUserExist(String username, String password);
    /*
    public boolean isAdmin(String username, String password);
<<<<<<< HEAD
    public boolean updateAccount(AccountBean accountBean);
    
=======
    public boolean isCustomer(String username, String password);
    public boolean isProductManager(String username, String password);
    public boolean isAccountingManager(String username, String password);
    */
>>>>>>> bcd00a1da24e726bf712eb800991af451fa63989
}
