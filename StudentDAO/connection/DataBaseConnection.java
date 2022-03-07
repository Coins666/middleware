package connection;

import java.sql.*;

public class DataBaseConnection {
    private final String DBDriver = "org.apache.derby.jdbc.ClientDriver";
    private final String DBURL = "jdbc:derby://localhost:1527/myeclipse";
    private final String DBUSER = "classiccars";
    private final String DBPASSWORD = "classiccars";
    private Connection conn = null;

    //������
    public DataBaseConnection() {
        try {
            Class.forName(DBDriver);
            conn = DriverManager.getConnection(DBURL, DBUSER, DBPASSWORD);
        } catch (Exception e) {
        }
    }

    //�������
    public Connection getConnection() {
        return this.conn;
    }

    //�ر�����
    public void close() throws SQLException {
        this.conn.close();
    }
} 
