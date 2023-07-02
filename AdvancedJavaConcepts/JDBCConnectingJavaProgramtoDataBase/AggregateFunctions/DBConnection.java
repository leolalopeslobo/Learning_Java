import java.sql.*;
//This class helps establish connections
public class DBConnection {
    Connection con;
    
    public Connection getConnection(){ //datatype is Connection since it should give a Connection Object
        try{
            //1. Loading the driver class
            Class.forName("com.mysql.cj.jdbc.Driver"); //Driver Name
        
            //2. Create/Establish a connection
            String url = "jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String username = "root";
            String password = "cdac@123";
            con = DriverManager.getConnection(url, username, password); //this takes 3 parameters
        }
        catch(Exception e){
            System.out.println(e);
        }
        return con;
    }
}
