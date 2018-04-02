import java.sql.*;
import java.util.List;

import com.mysql.cj.jdbc.Driver;

public class MySQLAdsDao implements Ads {

 private Connection connection = null;



 public static void main(String[] args) {
  try {

      // Connection Statement
   DriverManager.registerDriver(new Driver());

   Connection connection = DriverManager.getConnection(
           "jdbc:mysql://localhost/adlister_db?serverTimezone=UTC&useSSL=false",
           "root",
           "codeup"
   );

  } catch (SQLException e) {
   e.printStackTrace();
  }
 }
}
