
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isuru
 */
public class db {
    public static Statement dbConnection()
    {
        try {
            Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/jfinal","root","");
            Statement st=(Statement) con.createStatement();
            return st;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    public static int idu(String sql)
    {
        try {
            
            
            int ret=dbConnection().executeUpdate(sql);
             dbConnection().close();
            return ret;
        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }
    
   
    
}
