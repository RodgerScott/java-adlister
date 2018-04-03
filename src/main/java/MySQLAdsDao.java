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
  Long id = (long) 0;
  try {
   String query = "INSERT INTO ads(user_id, title, description) VALUES (" + ad.getUserId() + ", '" + ad.getTitle() + "', '" + ad.getDescription() + "')";
   Statement stmt = connection.createStatement();
   stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
   ResultSet rs = stmt.getGeneratedKeys();
   if(rs.next()){
    id = rs.getLong(1);
   }
  } catch (SQLException e) {
   throw new RuntimeException("No worky worky");
  }
  return id;
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


