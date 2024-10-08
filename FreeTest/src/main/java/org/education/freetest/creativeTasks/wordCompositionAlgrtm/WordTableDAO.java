package org.education.freetest.creativeTasks.wordCompositionAlgrtm;

import services.DBService;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class WordTableDAO {
    private DBService dbService;

    public void connectionDB() {
        try (Connection connection = dbService.getConnection()){
            System.out.println("Connection to DB succesfull");
        } catch (Exception e) {
            System.err.println("Connection to DB Failed");
            e.printStackTrace();
        }
    }
    public List<String> getAllString(){
        List<String> allString = new ArrayList<>();
        try {
            Connection connection = dbService.getConnection();
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
