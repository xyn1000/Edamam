package exam.util;

import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.Assert.*;

public class DBUtilTest {

    @Test
    public void getConnection() throws SQLException {
        Connection c=DBUtil.getConnection();
        assertFalse(c.isClosed());
        assertNotNull(c);
    }

    @Test
    public void close() throws SQLException {
        Connection c = DBUtil.getConnection();
        DBUtil.close(c);
        assertTrue(c.isClosed());
    }
}