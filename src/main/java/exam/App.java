/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package exam;

import exam.util.CacheUtil;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    public static Stage primaryStage;

    public static void main(String[] args) {
        try{
            if (args[0].equals("offline")){
                CacheUtil.setInputMode("offline");
            }else if (args[0].equals("online")){
                CacheUtil.setInputMode("online");
            }else{
                System.out.println("Invalie input mode!");
                System.exit(-1);
            }

            if (args[1].equals("offline")){
                CacheUtil.setOutputMode("offline");
            }else if (args[1].equals("online")){
                CacheUtil.setOutputMode("online");
            }
        }catch (Exception e){
//            e.printStackTrace();
            System.out.println("Please enter correct arguments!");
            System.exit(-1);
        }
//        else{
//            System.out.println("Invalie output mode!");
//            System.exit(-1);
//        }

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        App.primaryStage = primaryStage;
        Parent parent = FXMLLoader.load(getClass().getResource("/view/EnterCalorie.fxml"));
        Scene scene = new Scene(parent);
        primaryStage.setTitle("Food");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
