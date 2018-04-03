import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.Driver;

public class MySQLAdsDao implements Ads {

 private Connection connection;


 public MySQLAdsDao(Config config) {
  try {
   DriverManager.registerDriver(new Driver());

   connection = DriverManager.getConnection(
           config.getUrl(),
           config.getUser(),
           config.getPassword()
   );

  } catch (SQLException e) {
     e.printStackTrace();
  }

 }

 @Override
 public Long insert(Ad ad) {
  return null;
 }


 @Override
 public List<Ad> all() {
  try {
  List<Ad> thisAd = new ArrayList<>();
   Statement stmt = connection.createStatement();
   ResultSet rs = stmt.executeQuery("SELECT * FROM ads");

  while ( rs.next() ) {
   Ad sequence = new Ad();
   sequence.setId(rs.getLong("id"));
   sequence.setTitle(rs.getString("title"));
   sequence.setDescription(rs.getString("description"));
   thisAd.add(sequence);
  }
  return thisAd;

  } catch (SQLException e) {
   e.printStackTrace();
   return null;
  }
 }

}


