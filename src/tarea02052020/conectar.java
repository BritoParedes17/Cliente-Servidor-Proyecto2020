/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea02052020;

/**
 *
 * @author hecmquej
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conectar {
    Connection conectar=null;
    public Connection conectar()
    {
       try{
           Class.forName("com.mysql.jdbc.Driver");
           conectar=DriverManager.getConnection("jdbc:mysql://localhost/mecatronica", "root", "");
        
            }catch (ClassNotFoundException | SQLException e){ System.out.print(e.getMessage());     }
    return conectar;
    }
    
}
