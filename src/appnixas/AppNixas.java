
package appnixas;

import com.formdev.flatlaf.FlatDarkLaf;
import java.sql.SQLException;
import modelo.dataBase;
import vista.*;
import controlador.*;


public class AppNixas {

 
    public static void main(String[] args) throws SQLException {
        FlatDarkLaf.setup();
        ventanaLogin login = new ventanaLogin();
        loginCtrl lox = new loginCtrl(login);
        login.setVisible(true);
              //   m.setVisible(true);
                 
                 
               //  login.setVisible(false);
        //Prueba de conexion    
        dataBase db = new dataBase();
        db.getConnection();
       

        
        
    }
    
}
