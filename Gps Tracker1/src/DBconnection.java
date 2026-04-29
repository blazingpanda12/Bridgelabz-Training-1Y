import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBconnection {
    public static void main(String[] args) {
        // Database connection details
        String url = "jdbc:mysql://127.0.0.1:3306/hjk"; // replace 'hjk' with your DB name if different
        String user = "root"; // your MySQL username
        String password = "Vishal@12"; // your MySQL password

        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database!");

            // Create a statement and execute a query
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SHOW TABLES;");

            // Print the tables in the database
            System.out.println("Tables in the database:");
            while (rs.next()) {
                System.out.println(rs.getString(1));
            }

            // Close connections
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}