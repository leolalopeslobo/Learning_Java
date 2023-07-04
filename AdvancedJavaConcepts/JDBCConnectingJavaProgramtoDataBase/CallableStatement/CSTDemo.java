import java.sql.*;
public class CSTDemo {
    public static void main(String[] args) throws Exception{
        DBConnection dbcon = new DBConnection();
        Connection con = dbcon.getConnection();
        
        if (con!=null)
            System.out.println("Connection established");
        else
            System.out.println("Connection Failed");
        
        
        //calling stored procedure
        String query = "{call cdac_java_web_programming.first_pro(?,?)}";
        
        CallableStatement cst = con.prepareCall(query);
        cst.setInt(1,25);  //setting input parameter
        cst.registerOutParameter(2, Types.INTEGER);
        
        cst.execute();
        int result = cst.getInt(2);   //result is in parameter 2
        System.out.println("Square of the given number: "+result);
        
    }
}
