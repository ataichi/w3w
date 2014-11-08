
package DAO.Interface;

import Beans.AccountBean;

public interface AccountDAOInterface {
    public boolean addAccount(AccountBean accountBean);
    public AccountBean getUser(String username);
    public boolean doesUserExist(String username, String password);
    public boolean isAdmin(String username, String password);
}
