import java.sql.*;
import java.util.List;

import com.mysql.cj.jdbc.Driver;

public class MySQLAdsDao {


 public static void main(String[] args) {
  try {

      // Connection Statement
   DriverManager.registerDriver(new Driver());

   Config config = new Config();

    Connection connection = DriverManager.getConnection (
           config.getUrl(),
           config.getPassword(),
           config.getUser()
   );

  } catch (SQLException e) {
   e.printStackTrace();
  }
 }
}
