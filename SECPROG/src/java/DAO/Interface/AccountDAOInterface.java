
package DAO.Interface;

import Beans.AccountBean;

public interface AccountDAOInterface {
    public boolean addAccount(AccountBean accountBean);
    public AccountBean getUser(String username);
}
