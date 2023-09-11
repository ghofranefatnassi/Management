
package management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Bd {


    public static Connection mycon (){
       
        Connection con = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/management","root","");
            return con;
        }catch (ClassNotFoundException | SQLException e){
            
            System.out.println(e);
            return null;
        }
    } 

    
    
    
}
