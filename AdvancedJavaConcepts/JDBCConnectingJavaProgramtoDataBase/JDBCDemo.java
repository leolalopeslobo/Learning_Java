
import java.sql.*;
public class JDBCDemo{
    public static void main(String[] args) throws Exception{
        //1. Loading the driver class
        Class.forName("com.mysql.cj.jdbc.Driver"); //Driver Name
        
        //2. Create/Establish a connection
//        String url = "jdbc:mysql://localhost:3306/student";
        String url = "jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String username = "root";
        String password = "cdac@123";
        Connection con = DriverManager.getConnection(url, username, password); //this takes 3 parameters
        
        if(con!=null)
            System.out.println("Connection Successful");
        else
            System.out.println("Connection Failed");
    }  
}