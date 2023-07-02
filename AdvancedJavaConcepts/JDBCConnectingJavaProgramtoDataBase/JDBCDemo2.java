
import java.sql.*;
public class JDBCDemo2{
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
        
        
        //3. Create Statement - this is done to issue SQL Commands
        Statement st = con.createStatement();
        
        //4. Execute Queries and process the results
        String query = "select * from cdac_java_web_programming.student";
        ResultSet rs = st.executeQuery(query);  //rs - contains all the records of the executed query
        System.out.println(rs.getClass());
        System.out.println(rs.toString());
        
        //printing the results stored in ResultSet
        while(rs.next()){
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3));  //accessing by column index
        }
        
        st.close();
        rs.close();
        con.close();
    }  
}