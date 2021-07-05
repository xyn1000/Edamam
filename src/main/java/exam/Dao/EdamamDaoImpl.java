package exam.Dao;

import exam.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EdamamDaoImpl implements EdamamDao {
    @Override
    public boolean insert(String text, String info) throws SQLException {
        Connection connection = DBUtil.getConnection();
        String sql = "INSERT OR REPLACE INTO edamamFood VALUES(?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1,text);
        statement.setString(2,info);
        statement.execute();
        DBUtil.close(connection,statement);
        return true;
    }

    @Override
    public boolean delete(String text) throws SQLException {
        Connection connection = DBUtil.getConnection();
        String sql = "delete from edamamFood where search_text = ? ";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1,text);
        statement.execute();
        DBUtil.close(connection,statement);
        return true;
    }


    @Override
    public String searchInfo(String text) throws SQLException {
        Connection connection = DBUtil.getConnection();
        String sql = "SELECT item_info FROM edamamFood where search_text = ? ";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1,text);
        ResultSet rs = statement.executeQuery();
        String result=null;
        if (rs.isBeforeFirst()) {
            result = rs.getString(1);
        }
        DBUtil.close(connection,statement,rs);
        return result;
    }

    @Override
    public boolean insertNutrition(String foodId, String measureURI, String nutrition) throws SQLException {
        Connection connection = DBUtil.getConnection();
        String sql = "INSERT OR REPLACE INTO edamamNutrition VALUES(?,?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1,foodId);
        statement.setString(2,measureURI);
        statement.setString(3,nutrition);
        statement.execute();
        DBUtil.close(connection,statement);
        return true;
    }

    @Override
    public boolean deleteNutrition(String foodId, String measureURI) throws SQLException {
        Connection connection = DBUtil.getConnection();
        String sql = "delete from edamamNutrition where food_id = ? and measure_uri = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1,foodId);
        statement.setString(2,measureURI);
        statement.execute();
        DBUtil.close(connection,statement);
        return true;
    }

    @Override
    public String searchNutrition(String foodId, String measureURI) throws SQLException {
        Connection connection = DBUtil.getConnection();
        String sql = "SELECT nutrition FROM edamamNutrition where food_id = ? and measure_uri = ? ";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1,foodId);
        statement.setString(2,measureURI);
        ResultSet rs = statement.executeQuery();
        String result=null;
        if (rs.isBeforeFirst()) {
            result = rs.getString(1);
        }
        DBUtil.close(connection,statement,rs);
        return result;
    }
}
