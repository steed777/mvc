import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class Main {
    public static void main(String[] args)  throws Exception{



       /// https://proselyte.net/tutorials/jdbc/simple-application-example/


        String url = "jdbc:postgresql://localhost/test";
        Properties props = new Properties();
        props.setProperty("user","fred");
        props.setProperty("password","secret");
        props.setProperty("ssl","true");
        Connection conn = DriverManager.getConnection(url, props);


        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from users");



        resultSet


//
//        String url = "jdbc:postgresql://localhost/test?user=fred&password=secret&ssl=true";
//        Connection conn = DriverManager.getConnection(url);
    }
}
