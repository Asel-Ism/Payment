
package payment;

import java.sql.*;
import javax.swing.*;

public class ConnectMsSql {
    Connection conn = null;
    public static Connection ConnectDB(){
    try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connsrting = "jdbc:sqlserver://localhost:1433;databaseName=PieceworkPayment;user=asel;password=0000;";
        Connection conn = DriverManager.getConnection(connsrting);
        //JOptionPane.showMessageDialog(null, "Connect");
        return conn;
    }catch(Exception e){
        e.printStackTrace();
        return null;
    }
    } 
}
