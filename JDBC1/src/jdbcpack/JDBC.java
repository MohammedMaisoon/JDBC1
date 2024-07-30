package jdbcpack;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class JDBC {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/Your Database Name","Your User Name","Your Password");

        Statement stmt=con.createStatement();

        int n=stmt.executeUpdate("Delete from users where userid=500");

        System.out.println("No of rows deleted...:"+n);


    }
}
