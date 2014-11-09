package DAO.Interface;

import Beans.ProductManagerBean;
import Beans.ProductBean;
import DAO.Interface.ProductDAOInterface;

public interface ProductManagerDAOInterface {
    public ProductManagerBean getProductManager (int ID);
    public boolean editProductManager (ProductManagerBean productManager);
    public ProductBean viewProduct (int ID);
    public boolean addProduct (ProductBean product);
    public boolean editProduct (ProductBean product);
    public boolean removeProduct (ProductBean product);
    public boolean addProductManager(ProductManagerBean productManager);
}
