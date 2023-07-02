
import java.sql.*;

public class SQDemo {
    public static void main(String[] args) throws Exception{
        DBConnection dbcon = new DBConnection();
        Connection con = dbcon.getConnection();
        
        if (con!=null)
            System.out.println("Connection established");
        else
            System.out.println("Connection Failed");
        
        
        Statement st = con.createStatement();
        String q1 = "select sname from cdac_java_web_programming.student where cgpa = (select max(cgpa) from cdac_java_web_programming.student);";
        ResultSet rs = st.executeQuery(q1);
        if(rs.next())
            System.out.println(rs.getString(1));
        
        rs.close();
        st.close();
        con.close();
    }
}