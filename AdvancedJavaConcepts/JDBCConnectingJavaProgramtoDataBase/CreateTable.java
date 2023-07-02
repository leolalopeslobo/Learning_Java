
import java.sql.*;
public class CreateTable{
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
        
        //4. Execute Queries and process the results (Business Logic)
        //Creating Table
        String cquery = "create table cdac_java_web_programming.employee(eid int, ename varchar(20), esal double);";
        int status = st.executeUpdate(cquery);
        
        if (status>=0) //if not created then answer = -1
            System.out.println("Table Created");
        else
            System.out.println("Table Creation failed");
        
        
        //Inserting
        String iquery = "insert into cdac_java_web_programming.employee values (167,'LM',7.6),(726,'USAIN',2.3);";
        int i = st.executeUpdate(iquery);  //rs - contains all the records of the executed query
        
        //Checking if the query execution was a success or not
        if(i>0) //this means at least one row was affected
            System.out.println("Insertion Success");
        else
            System.out.println("Insertion Failed");
        
        String squery = "select * from cdac_java_web_programming.employee;";
        ResultSet rs = st.executeQuery(squery);
        //printing the results stored in ResultSet
        while(rs.next()){
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3));  //accessing by column index
        }
        
        st.close();
        rs.close();
        con.close();
    }  
}
