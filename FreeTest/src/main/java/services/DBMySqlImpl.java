package services;

import org.education.freetest.creativeTasks.solidLibraryTest.library.Library;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class DBMySqlImpl implements DBService{

    @Override
    public void connectionDB() {
        try (Connection connection = getConnection()){
            System.out.println("Connection to DB succesfull");
        } catch (Exception e) {
            System.err.println("Connection to DB Failed");
            e.printStackTrace();
        }
    }

    @Override
    public Connection getConnection() throws SQLException, IOException {
        Properties properties = new Properties();
        URL dbResourse = ClassLoader.getSystemResource("database.properties");
        try (InputStream in = dbResourse.openStream()){
                properties.load(in);
        }
        String url = properties.getProperty("url");
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");

        return DriverManager.getConnection(url,user,password);
    }

    public ArrayList<String> getAllString(){
        ArrayList<String> allString = new ArrayList<>();
        try {
            Connection connection = this.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM rusword");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                allString.add(resultSet.getString("Word"));
            }

        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }


        return allString;
    }

}
