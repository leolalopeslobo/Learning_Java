import java.sql.*;
import java.util.Scanner;
public class PSTDemo {
    public static void main(String[] args) throws Exception{
        DBConnection dbcon = new DBConnection();
        Connection con = dbcon.getConnection();
        
        if (con!=null)
            System.out.println("Connection established");
        else
            System.out.println("Connection Failed");
        
        Scanner in = new Scanner(System.in);
        //Adding a new row by taking the data from user using Prepared Statement
        String q1 = "insert into cdac_java_web_programming.student values(?,?,?);";
        System.out.print("Enter the sid: ");
        int sid = in.nextInt();
        System.out.print("Enter the sname: ");
        String sname = in.next();
        System.out.print("Enter the cgpa: ");
        double cgpa = in.nextDouble();
        
        PreparedStatement pst = con.prepareStatement(q1);
        pst.setInt(1, sid);
        pst.setString(2, sname);
        pst.setDouble(3, cgpa);
        
        int x = pst.executeUpdate(); //returns int
        if(x>0)
            System.out.println("Number of records inserted: "+x);
        else
            System.out.println("Insertion Failed");
        
        
        //retrieving the data you need a result set
        String q2 = "select * from cdac_java_web_programming.student";
        PreparedStatement pst1 = con.prepareStatement(q2);
        ResultSet rs = pst1.executeQuery();
        while(rs.next()){
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3));
        }
    }
}
