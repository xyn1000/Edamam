package exam.util;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.dbcp2.BasicDataSourceFactory;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * The type Db util helps to connect to the database.
 */
public class DBUtil {

    /* sourcecode
    https://commons.apache.org/proper/commons-dbcp/apidocs/org/apache/commons/dbcp2/BasicDataSource.html
    https://examples.javacodegeeks.com/core-java/apache/commons/dbcp/dbcp-connection-pooling-example/
    https://examples.javacodegeeks.com/core-java/apache/commons/org-apache-commons-dbcp2-basicdatasource-example/
     */

    /**
     * The constant PROPERTY.
     */
    private static final Properties PROPERTY = new Properties();
    /**
     * The constant ds.
     */
    private static DataSource ds = new BasicDataSource();

    static {
        try {
            PROPERTY.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("db.properties"));
            ds = BasicDataSourceFactory.createDataSource(PROPERTY);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Gets connection.
     *
     * @return the connection
     */
    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = ds.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return conn;
    }

    /**
     * Close.
     *
     * @param connection the connection
     * @param statement  the sql statement
     * @param rs         the resultset
     */
    public static void close(Connection connection, Statement statement, ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    /**
     * Close.
     *
     * @param connection the connection
     * @param statement  the sql statement
     */
    public static void close(Connection connection, Statement statement) {
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    /**
     * Close.
     *
     * @param connection the connection
     */
    public static void close(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
