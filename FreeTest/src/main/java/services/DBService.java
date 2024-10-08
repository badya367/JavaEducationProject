package services;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public interface DBService {
    void connectionDB();

    Connection getConnection() throws SQLException, IOException;
}
