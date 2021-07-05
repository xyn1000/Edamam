package exam.Dao;

import java.sql.SQLException;

/**
 * The interface Edamam dao.
 */
public interface EdamamDao {
    /**
     * Insert text-based search result to the database.
     *
     * @param text the text
     * @param info the result
     * @return the boolean indicates if the insertion succeeds
     * @throws SQLException the sql exception
     */
    boolean insert(String text, String info) throws SQLException;

    /**
     * Delete database entry.
     *
     * @param text the text
     * @return the boolean indicates if the deletion succeeds
     * @throws SQLException the sql exception
     */
    boolean delete(String text) throws SQLException;

    /**
     * Search in the database if there is cached data
     *
     * @param text the text
     * @return the search result
     * @throws SQLException the sql exception
     */
    String searchInfo(String text) throws SQLException;

    /**
     * Insert nutrition result to the database.
     *
     * @param foodId     the food id
     * @param measureURI the measure uri
     * @param nutrition  the nutrition result
     * @return the boolean indicates if the operation succeeds
     * @throws SQLException the sql exception
     */
    boolean insertNutrition(String foodId, String measureURI,String nutrition) throws SQLException;

    /**
     * Delete nutrition result from the db.
     *
     * @param foodId     the food id
     * @param measureURI the measure uri
     * @return the boolean indicates if the operation succeeds
     * @throws SQLException the sql exception
     */
    boolean deleteNutrition(String foodId, String measureURI) throws SQLException;

    /**
     * Search nutrition in the database.
     *
     * @param foodId     the food id
     * @param measureURI the measure uri
     * @return the result of search
     * @throws SQLException the sql exception
     */
    String searchNutrition(String foodId, String measureURI) throws SQLException;
}
