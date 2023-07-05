import java.sql.*;
public class BatchDemo {
    public static void main(String[] args) throws Exception{
      DBConnection dbcon = new DBConnection();
      Connection con = dbcon.getConnection();

      if (con!=null)
          System.out.println("Connection established");
      else
          System.out.println("Connection Failed");
    
    
    Statement st = con.createStatement();
    st.addBatch("insert into cdac_java_web_programming.student values(399,'TYU',8.9);");
    st.addBatch("update cdac_java_web_programming.student set sname='ASDF' where sid=200;");
    st.addBatch("delete from cdac_java_web_programming.student where cgpa between 8 and 9;");
    
    
    int[] res = st.executeBatch(); //return an array
    for (int i=0; i<res.length; i++){
        System.out.println(res[i]);
    }
    con.close();
    
    }
}
