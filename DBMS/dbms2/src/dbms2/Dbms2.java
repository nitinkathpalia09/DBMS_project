/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dbms2;
import java.sql.*;
import java.sql.DriverManager;
        import java.sql.DriverManager;
import java.sql.SQLException;
import oracle.net.aso.n;


public class Dbms2 {

    public static void main(String[] args) {
        Connection conn=null;
        try{
        String driverName="oracle.jdbc.driver.OracleDriver";
        Class.forName(driverName);
        String serverName="DESKTOP-U7ESS73";
        String serverPort="1521";
        String sid="XE";
        String url="jdbc:oracle:thin:@"+serverName+":"+serverPort+":"+sid;
        String username="SYSTEM";
        String password="howareyou9";
        conn=DriverManager.getConnection(url,username,password);
        System.out.println("Successfully Connected to the Database!");
        }catch(ClassNotFoundException e){
        System.out.println("Could not find the database Driver"+e.getMessage());
        }catch(SQLException ex){
        System.out.println("Could Not connect to the Database"+ex.getMessage());
        }
    
     NewJFrame n=new NewJFrame();
     n.setVisible(true); 
}
}
