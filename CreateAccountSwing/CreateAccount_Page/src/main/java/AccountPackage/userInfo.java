package AccountPackage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class userInfo {
    private static final String url = "jdbc:mysql://localhost:3306/logincredentials_db";
    private static final String user = "root";
    private static final String password = "";

    public static <Connection> void saveLogin(){
        String sql = "INSERT INTO logform(userName,email,password) values(?, ?, ?)";

        try(Connection connection = DriverManager.getConnection(url,user,password);
            PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setString(1,Login_SignUp.enterUser.getText());
            preparedStatement.setString(2, Login_SignUp.enterMail.getText());
            preparedStatement.setString(3, Login_SignUp.enterPassword.getText());

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Data saved successfully!");
            }
        }
        catch (Exception e)
        {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

}
