import java.sql.*;
public class AggrDemo2 {
    
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
        String queries = "select count(*), max(cgpa), min(cgpa), avg(cgpa), sum(cgpa) from cdac_java_web_programming.student;";
        ResultSet rs = st.executeQuery(queries);
        if(rs.next()){
            int count = rs.getInt(1);
            double max = rs.getDouble(2);
            double min = rs.getDouble(3);
            double avg = rs.getDouble(4);
            double sum = rs.getDouble(5);
            System.out.println("Count of records: "+count+"\tMax Value: "+max+"\tMin Value: "+min+"\tAvg Value: "+avg+"\tSum Value: "+sum);
            
        }
        
        
        st.close();
        rs.close();
        con.close();
        
    }
}
