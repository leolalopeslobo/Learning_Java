import java.sql.*;
public class CSTDemo2 {
     public static void main(String[] args) throws Exception{
        DBConnection dbcon = new DBConnection();
        Connection con = dbcon.getConnection();
        
        if (con!=null)
            System.out.println("Connection established");
        else
            System.out.println("Connection Failed");
        
        
        //Calling Function
        String query = "{? = call cdac_java_web_programming.add_func(?,?)}";
        CallableStatement cst = con.prepareCall(query);
        
        cst.setInt(2,123);
        cst.setInt(3, 321);
        cst.registerOutParameter(1, Types.INTEGER);
        
        cst.execute();
        
        int result = cst.getInt(1);
        System.out.println("Sum of two numbers: "+result);
     }
}