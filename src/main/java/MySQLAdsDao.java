import java.sql.DriverManager;

public class MySQLAdsDao implements Ads {
 DriverManager.registerDriver (new Driver());
}
