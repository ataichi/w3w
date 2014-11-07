package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leif
 */
public class Connector {
    private String username = "root";
    private String password = "root";
    private String url = "jdbc:mysql://localhost:3306/foobar";
    private String driver = "com.mysql.jdbc.Driver";
    
    public Connection getConnection(){
        try {
            Class.forName(driver);
            Connection c = DriverManager.getConnection(url, username, password);
            return c;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Connector.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Connector.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
