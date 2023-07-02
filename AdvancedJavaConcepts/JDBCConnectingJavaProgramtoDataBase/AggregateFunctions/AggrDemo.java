import java.sql.*;
public class AggrDemo {
    
    public static void main(String[] args) throws Exception{
        DBConnection dbcon = new DBConnection();
        Connection con = dbcon.getConnection();
        
        if (con!=null)
            System.out.println("Connection established");
        else
            System.out.println("Connection Failed");
        
        
        Statement st = con.createStatement();
        
        //Business Logic
         //1. Finding number of records in a table
        String q1 = "select count(*) from cdac_java_web_programming.employee;";
        ResultSet rs = st.executeQuery(q1);
        if(rs.next()){
            int i = rs.getInt(1);
            System.out.println("Count of records: "+i);
        }
        
        
        st.close();
        rs.close();
        con.close();
        
    }
}
