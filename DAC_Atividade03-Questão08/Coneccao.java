import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Coneccao{

    private static final String url = "jdbc:postgresql://localhost:5432/Pessoa";
    private static final String username = "postgres";
    private static final String password = "senha";

    private static Connection conn;

    public static Connection getConnection(){


        try{

            if(conn == null){
                conn = DriverManager.getConnection(url, username ,password);
                return conn;
            }
            else{
                return conn;
            }

        }
        catch(SQLException e){
            e.printStackTrace();
            return null;
        }


    }


}