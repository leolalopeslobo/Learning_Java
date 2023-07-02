
import java.sql.*;
public class JDBCDemo3{
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
        //Inserting
        String iquery = "insert into cdac_java_web_programming.student values (167,'LM',7.6);";
        int i = st.executeUpdate(iquery);  //rs - contains all the records of the executed query
        
        //Checking if the query execution was a success or not
        if(i>0) //this means at least one row was affected
            System.out.println("Insertion Success");
        else
            System.out.println("Insertion Failed");
        
        
        //Update
        String uquery = "update cdac_java_web_programming.student set cgpa=9.3 where sid=199;";
        int j = st.executeUpdate(uquery);
        //Checking if the query execution was a success or not
        if(j>0) //this means at least one row was affected
            System.out.println("Updation Success");
        else
            System.out.println("Updation Failed");
        
        //Delete
        String dquery = "delete from cdac_java_web_programming.student where sname='PQR';";
        int k = st.executeUpdate(dquery);
        //Checking if the query execution was a success or not
        if(k>0) //this means at least one row was affected
            System.out.println("Deletion Success");
        else
            System.out.println("Deletion Failed");
        
        String squery = "select * from cdac_java_web_programming.student;";
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
