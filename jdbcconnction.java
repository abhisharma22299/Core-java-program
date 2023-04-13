import java.sql.*;
public class jdbcconnction {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/information_schema";
            String username = "root";
            String password = "7586";
            Connection con = DriverManager.getConnection(url, username, password);

String q = "create table table1 (tId(20) primary key auto_increament ,tName varchar(400) not null," +
        "tCity varchar(400),  )";
Statement stmt =con.createStatement();
stmt.executeUpdate(q);
            System.out.println("table created in database");
con.close();



        }

        catch (Exception e){
            e.printStackTrace();
        }
    }
}
