package exam.controller;

import com.alibaba.fastjson.JSONObject;
import exam.App;
import exam.Constants;
import exam.Dao.EdamamDao;
import exam.Dao.EdamamDaoImpl;
import exam.entity.FoodMeasuresWrapper;
import exam.entity.Ingredient;
import exam.entity.NutrientWrapper;
import exam.entity.viewEntity.MeasureView;
import exam.entity.viewEntity.NutrientWrapperView;
import exam.service.EmailService;
import exam.service.FoodService;
import exam.service.serviceImpl.DummyServiceImpl;
import exam.service.serviceImpl.EmailServiceImpl;
import exam.service.serviceImpl.FoodServiceImpl;
import exam.util.CacheUtil;
import exam.util.JSONUtil;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Optional;

/**
 * Choose measure controller.
 */
public class ChooseMeasureController {
    /**
     * The Return btn.
     */
    @FXML
    private Button returnBtn;

    /**
     * The Id label.
     */
    @FXML
    private Label idLabel;

    /**
     * The Table.
     */
    @FXML
    private TableView<MeasureView> table;

    /**
     * The Label col.
     */
    @FXML
    private TableColumn<MeasureView,String> labelCol;

    /**
     * The Uri col.
     */
    @FXML
    private TableColumn<MeasureView,String> uriCol;

    /**
     * The Weight col.
     */
    @FXML
    private TableColumn<MeasureView,Double> weightCol;

    /**
     * The Info col.
     */
    @FXML
    private TableColumn<MeasureView,Void> infoCol;

    /**
     * The Tab pane.
     */
    @FXML
    private TabPane tabPane;

    /**
     * The Measure tab.
     */
    @FXML
    private Tab measureTab;

    /**
     * The Nutrient tab.
     */
    @FXML
    private Tab nutrientTab;


    /**
     * The Nutrition table.
     */
    @FXML
    private TableView<NutrientWrapperView> nutritionTable;
    /**
     * The Food col.
     */
    @FXML
    private TableColumn<NutrientWrapperView, String> foodCol;
    /**
     * The Nuri col.
     */
    @FXML
    private TableColumn<NutrientWrapperView, String> nuriCol;
    /**
     * The Yield col.
     */
    @FXML
    private TableColumn<NutrientWrapperView, Double> yieldCol;
    /**
     * The Calory col.
     */
    @FXML
    private TableColumn<NutrientWrapperView, Double> caloryCol;
    /**
     * The Glycemic col.
     */
    @FXML
    private TableColumn<NutrientWrapperView, Double> glycemicCol;
    /**
     * The Total weight col.
     */
    @FXML
    private TableColumn<NutrientWrapperView, Double> totalWeightCol;
    /**
     * The Diet label col.
     */
    @FXML
    private TableColumn<NutrientWrapperView, String> dietLabelCol;
    /**
     * The Health label col.
     */
    @FXML
    private TableColumn<NutrientWrapperView, String> healthLabelCol;
    /**
     * The Caution col.
     */
    @FXML
    private TableColumn<NutrientWrapperView, String> cautionCol;
    /**
     * The Total nutrient col.
     */
    @FXML
    private TableColumn<NutrientWrapperView, String> totalNutrientCol;
    /**
     * The Daily col.
     */
    @FXML
    private TableColumn<NutrientWrapperView, String> dailyCol;

    /**
     * The Nutrients.
     */
    private ObservableList<NutrientWrapperView> nutrients = FXCollections.observableArrayList();
    /**
     * The Es.
     */
    private EmailService es;
    /**
     * The constant nw.
     */
    private static NutrientWrapper nw;

    /**
     * The Measures.
     */
    private ObservableList<MeasureView> measures = FXCollections.observableArrayList();
    /**
     * The Dao.
     */
    private EdamamDao dao;
    /**
     * The Fs.
     */
    private FoodService fs;


    /**
     * Handle return button
     *
     * @param actionEvent event
     * @throws IOException exception
     */
    @FXML
    public void handleReturn(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("/view/FoodResults.fxml"));
        Scene scene = new Scene(parent);
        App.primaryStage.setScene(scene);
        App.primaryStage.setTitle("Food");
        App.primaryStage.show();
    }

    /**
     * Send report button
     *
     * @param event the event
     */
    @FXML
    public void sendReport(ActionEvent event){

        if (nw == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Send Report Error!");
            alert.setContentText("You should select the measure in the measure table first!");
            alert.showAndWait();
            return;
        }

        tabPane.getSelectionModel().select(nutrientTab);
        JSONObject email = JSONUtil.getEmailJSON(nw);
        boolean flag = es.emailRequest(Constants.sendGridToken,email);
        if (flag){
            new Alert(Alert.AlertType.INFORMATION,"A report has been sent to your email address!").show();
        }else{
            new Alert(Alert.AlertType.INFORMATION,"Please check your account information in Constants.java!").show();
        }
    }


    /**
     * Initialize.
     */
    @FXML
    public void initialize(){
        this.dao = new EdamamDaoImpl();

        //Offline or Online input
        if (CacheUtil.getInputMode().equals("online")){
            this.fs = new FoodServiceImpl();
        }else if (CacheUtil.getInputMode().equals("offline")){
            this.fs = new DummyServiceImpl();
        }

        //online or offline output
        if (CacheUtil.getOutputMode().equals("online")){
            this.es = new EmailServiceImpl();
        }else if (CacheUtil.getOutputMode().equals("offline")){
            this.es = new DummyServiceImpl();
        }


        initializeNutrientTable();
        //measure
        FoodMeasuresWrapper foodMeasuresWrapper = CacheUtil.getCurrentFoodMeasures();
        for (int i=0;i<foodMeasuresWrapper.getMeasures().size();i++){
            MeasureView mv = new MeasureView(foodMeasuresWrapper.getMeasures().get(i));
            measures.add(mv);
        }
        initializeTable();
        idLabel.setText(foodMeasuresWrapper.getFood().getLabel());
    }

    /**
     * Initialize table.
     */
    private void initializeTable(){
        labelCol.setCellValueFactory(new PropertyValueFactory<>("label"));
        uriCol.setCellValueFactory(new PropertyValueFactory<>("uri"));
        weightCol.setCellValueFactory(new PropertyValueFactory<>("weight"));
        //the callback function refers to some code from my assignment 2 of SOFT2412
        Callback<TableColumn<MeasureView, Void>, TableCell<MeasureView, Void>> cellFactory = new Callback<TableColumn<MeasureView, Void>, TableCell<MeasureView, Void>>() {
            @Override
            public TableCell<MeasureView, Void> call(final TableColumn<MeasureView, Void> param) {
                final TableCell<MeasureView, Void> cell = new TableCell<MeasureView, Void>() {
                    private final Button btn = new Button("Nutrition Data");
                    {
                        btn.setOnAction((ActionEvent event) -> {
                            //get nutrition data
                            MeasureView measureView = getTableView().getItems().get(getIndex());
                            String foodId = CacheUtil.getCurrentFoodMeasures().getFood().getFoodId();
                            try {
                                String dbSearch = dao.searchNutrition(foodId,measureView.getUri());
                                if (dbSearch!=null){
                                    // ask the user if they want to use the cached data or get a new one from the API
                                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                                    alert.setTitle("Confirmation");
                                    alert.setContentText("Would you like to use the cached version?");
                                    Optional<ButtonType> buttonType = alert.showAndWait();
                                    if (buttonType.get().getButtonData().equals(ButtonBar.ButtonData.OK_DONE)) {
                                        // get cached version
                                        nw = JSONUtil.jsonToNutrientWrapper(new NutrientWrapper(),dbSearch);
                                    } else {
                                        //make API Call
                                        Ingredient i = new Ingredient();
                                        i.setFoodId(foodId);
                                        i.setMeasureURI(measureView.getUri());
                                        i.setQuantity((double)1);
                                        JSONObject request = JSONUtil.getIngredientJSON(i);
                                        NutrientWrapper tmp = fs.nutritionRequest(Constants.app_id,Constants.app_key,request);
                                        nw = tmp;
                                        //save the results to the database
                                        dao.insertNutrition(foodId,measureView.getUri(),tmp.getJsonString());
                                    }
                                }else{
                                    //make API Call
                                    Ingredient i = new Ingredient();
                                    i.setFoodId(foodId);
                                    i.setMeasureURI(measureView.getUri());
                                    i.setQuantity((double)1);
                                    JSONObject request = JSONUtil.getIngredientJSON(i);
                                    NutrientWrapper tmp = fs.nutritionRequest(Constants.app_id,Constants.app_key,request);
                                    nw = tmp;
                                    //save the results to the database
                                    dao.insertNutrition(foodId,measureView.getUri(),tmp.getJsonString());
                                }
                            } catch (SQLException | IOException throwables) {
                                throwables.printStackTrace();
                            }
                            if (nw.getCalories()>CacheUtil.getMaxCalorie()){
                                new Alert(Alert.AlertType.WARNING,"The item is above the maximum calorie amount!").showAndWait();
                            }
                            tabPane.getSelectionModel().select(nutrientTab);
                            nutrients.clear();
                            nutrients.add(new NutrientWrapperView(nw));
                            nutritionTable.setItems(nutrients);
                        });
                    }

                    @Override
                    public void updateItem(Void item, boolean empty) {
                        super.updateItem(item, empty);
                        if (empty) {
                            setGraphic(null);
                        } else {
                            setGraphic(btn);
                        }
                    }
                };
                return cell;
            }
        };
        infoCol.setCellFactory(cellFactory);
        table.setItems(measures);
    }

    /**
     * Initialize nutrient table.
     */
    private void initializeNutrientTable(){
        foodCol.setCellValueFactory(new PropertyValueFactory<>("food"));
        nuriCol.setCellValueFactory(new PropertyValueFactory<>("uri"));
        yieldCol.setCellValueFactory(new PropertyValueFactory<>("yield"));
        caloryCol.setCellValueFactory(new PropertyValueFactory<>("calories"));
        glycemicCol.setCellValueFactory(new PropertyValueFactory<>("glycemicIndex"));
        totalWeightCol.setCellValueFactory(new PropertyValueFactory<>("totalWeight"));
        dietLabelCol.setCellValueFactory(new PropertyValueFactory<>("dietLabels"));
        healthLabelCol.setCellValueFactory(new PropertyValueFactory<>("healthLabels"));
        cautionCol.setCellValueFactory(new PropertyValueFactory<>("cautions"));
        totalNutrientCol.setCellValueFactory(new PropertyValueFactory<>("totalNutrients"));
        dailyCol.setCellValueFactory(new PropertyValueFactory<>("totalDaily"));
        nutritionTable.setItems(nutrients);
    }
}
