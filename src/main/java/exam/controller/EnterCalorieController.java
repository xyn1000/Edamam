package exam.controller;

import exam.App;
import exam.util.CacheUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class EnterCalorieController {
    /**
     * The maximum Calorie fld.
     */
    @FXML
    private TextField calorieFld;

    /**
     * The Confirm btn.
     */
    @FXML
    private Button confirmBtn;

    /**
     * Initialize.
     */
    @FXML
    public void initialize(){
        CacheUtil.setMaxCalorie(null);
    }

    /**
     * handle the confirm button.
     */
    public void handleConfirm(ActionEvent actionEvent) {
        String res = calorieFld.getText().trim();
        if ("".equals(res)){
            new Alert(Alert.AlertType.WARNING,"Please type the maximum calorie!").showAndWait();
        }else{
            //try to convert the res to integer
            try{
                Integer tmp = Integer.parseInt(res);
                //check if the integer is between 1 and 1000
                if (tmp<1 || tmp>1000){
                    new Alert(Alert.AlertType.WARNING,"Please give an integer between 1 and 1000!").showAndWait();
                }else{
                    //store the maximum calorie
                    CacheUtil.setMaxCalorie(tmp);
                    //navigate to next page
                    Parent parent = null;
                    parent = FXMLLoader.load(getClass().getResource("/view/FoodResults.fxml"));
                    Scene scene = new Scene(parent);
                    App.primaryStage.setScene(scene);
                    App.primaryStage.setTitle("Food");
                    App.primaryStage.show();
                }
            } catch (NumberFormatException en) {
//                e.printStackTrace();
                new Alert(Alert.AlertType.WARNING,"Please type a valid integer!").showAndWait();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        System.out.println(CacheUtil.getMaxCalorie());
    }
}