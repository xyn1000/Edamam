package exam.Dao;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.sql.SQLException;

public class EdamamDaoImplTest {
    private EdamamDao dao;
    @Before
    public void setUp(){
        dao = new EdamamDaoImpl();
    }

    @Test
    public void insert() throws SQLException {
        dao.insert("texttext","infoinfo");
        assertEquals("infoinfo",dao.searchInfo("texttext"));
        dao.delete("texttext");
    }

    @Test
    public void delete() throws SQLException {
        dao.insert("test2","info2");
        dao.delete("test2");
        assertNull(dao.searchInfo("test2"));
    }


    @Test
    public void searchInfo() throws SQLException {
        dao.insert("test3","info3");
        dao.insert("test4","info4");
        dao.delete("test4");
        assertNull(dao.searchInfo("test4"));
        assertEquals("info3",dao.searchInfo("test3"));

        dao.delete("test3");
    }

    @Test
    public void insertNutrition() throws SQLException {
        dao.insertNutrition("foodId","measure uri","nutrition info");
        assertEquals("nutrition info",dao.searchNutrition("foodId","measure uri"));
        dao.deleteNutrition("foodId","measure uri");
    }

    @Test
    public void deleteNutrition() throws SQLException {
        dao.insertNutrition("foodId","measure uri","nutrition info");
        dao.deleteNutrition("foodId","measure uri");
        assertNull(dao.searchNutrition("foodId","measure uri"));
    }

    @Test
    public void searchNutrition() throws SQLException{
        dao.insertNutrition("foodId","measure uri","nutrition info1");
        dao.insertNutrition("foodId2","measure uri","nutrition info2");
        dao.deleteNutrition("foodId","measure uri");
        assertNull(dao.searchNutrition("foodId","measure uri"));
        assertEquals("nutrition info2",dao.searchNutrition("foodId2","measure uri"));
        dao.deleteNutrition("foodId2","measure uri");


    }
}