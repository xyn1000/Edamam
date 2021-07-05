package exam.controller;

import exam.App;
import exam.Constants;
import exam.Dao.EdamamDao;
import exam.Dao.EdamamDaoImpl;
import exam.entity.FoodMeasuresWrapper;
import exam.entity.HintsWrapper;
import exam.entity.viewEntity.FoodView;
import exam.service.FoodService;
import exam.service.serviceImpl.DummyServiceImpl;
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
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Food results controller.
 */
public class FoodResultsController {
    /**
     * The Search fld.
     */
    @FXML
    private TextField searchFld;

    /**
     * The Search btn.
     */
    @FXML
    private Button searchBtn;

    /**
     * The Table.
     */
    @FXML
    private TableView<FoodView> table;
    /**
     * The Food id col.
     */
    @FXML
    private TableColumn<FoodView,String> foodIdCol;
    /**
     * The Label col.
     */
    @FXML
    private TableColumn<FoodView,String> labelCol;
    /**
     * The Uri col.
     */
    @FXML
    private TableColumn<FoodView,String> uriCol;
    /**
     * The Category col.
     */
    @FXML
    private TableColumn<FoodView,String> categoryCol;
    /**
     * The Cate label col.
     */
    @FXML
    private TableColumn<FoodView,String> cateLabelCol;
    /**
     * The Image col.
     */
    @FXML
    private TableColumn<FoodView,String> imageCol;
    /**
     * The Brand col.
     */
    @FXML
    private TableColumn<FoodView,String> brandCol;
    /**
     * The Nutrients col.
     */
    @FXML
    private TableColumn<FoodView,String> nutrientsCol;
    /**
     * The Measures col.
     */
    @FXML
    private TableColumn<FoodView,Void> measuresCol;

    /**
     * The Foods.
     */
    private ObservableList<FoodView> foods = FXCollections.observableArrayList();
    /**
     * The Dao.
     */
    private EdamamDao dao;
    /**
     * The Fs.
     */
    private FoodService fs;
    /**
     * The Hw.
     */
    private HintsWrapper hw;

    /**
     * Handle search.
     *
     * @param actionEvent the action event
     * @throws SQLException the sql exception
     * @throws IOException  the io exception
     */
    @FXML
    public void handleSearch(ActionEvent actionEvent) throws SQLException, IOException {
        foods.clear();
        String searchText = searchFld.getText().trim();
        if (searchText==null||"".equals(searchText)){
            new Alert(Alert.AlertType.INFORMATION,"Please type something!").show();
        }else {
            String dbSearch = dao.searchInfo(searchText);
            this.hw = new HintsWrapper();
            if (dbSearch!=null){
                // ask the user if they want to use the cached data or get a new one from the API
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Confirmation");
                alert.setContentText("Would you like to use the cached version?");
                Optional<ButtonType> buttonType = alert.showAndWait();
                if (buttonType.get().getButtonData().equals(ButtonBar.ButtonData.OK_DONE)) {
                    // get cached version
                    JSONUtil.jsonHintsToFoods(hw,dbSearch);
                } else {
                    //call API
                    hw = fs.search(searchText, Constants.app_id,Constants.app_key);
                    //save the result to the database
                    if (hw != null){
                        dao.insert(searchText,hw.getJsonString());
                    }
                }
            }else{
                //call API
                hw = fs.search(searchText, Constants.app_id,Constants.app_key);
                //save the result to the database
                if (hw != null){
                    dao.insert(searchText,hw.getJsonString());
                }
            }
            //get Foods from HintsWrapper and add them to ObservableList
            if (hw!=null){
                for (int i=0;i<hw.getHintsList().size();i++){
                    FoodView tmp =new FoodView(hw.getHintsList().get(i).getFood());
                    foods.add(tmp);
                }
            }

            // store the hintswrapper to static class
            CacheUtil.setCurrentHintsWrapper(hw);
        }

    }

    /**
     * Initialize.
     */
    @FXML
    public void initialize() {
        //Offline or Online
        if (CacheUtil.getInputMode().equals("online")){
            fs = new FoodServiceImpl();
        }else if (CacheUtil.getInputMode().equals("offline")){
            fs = new DummyServiceImpl();
        }

        this.hw = new HintsWrapper();
        this.dao = new EdamamDaoImpl();
        CacheUtil.setCurrentHintsWrapper(this.hw);
        initializeTable();
    }

    /**
     * Initialize table.
     */
    private void initializeTable(){
        foodIdCol.setCellValueFactory(new PropertyValueFactory<>("foodId"));
        uriCol.setCellValueFactory(new PropertyValueFactory<>("uri"));
        labelCol.setCellValueFactory(new PropertyValueFactory<>("label"));
        categoryCol.setCellValueFactory(new PropertyValueFactory<>("category"));
        cateLabelCol.setCellValueFactory(new PropertyValueFactory<>("categoryLabel"));
        imageCol.setCellValueFactory(new PropertyValueFactory<>("image"));
        brandCol.setCellValueFactory(new PropertyValueFactory<>("brand"));
        nutrientsCol.setCellValueFactory(new PropertyValueFactory<>("nutrients"));
        //the callback function refers to some code from my assignment 2 of SOFT2412
        Callback<TableColumn<FoodView, Void>, TableCell<FoodView, Void>> cellFactory = new Callback<TableColumn<FoodView, Void>, TableCell<FoodView, Void>>() {
            @Override
            public TableCell<FoodView, Void> call(final TableColumn<FoodView, Void> param) {
                final TableCell<FoodView, Void> cell = new TableCell<FoodView, Void>() {

                    private final Button btn = new Button("Measures");
                    {
                        btn.setOnAction((ActionEvent event) -> {
                            FoodView foodView = getTableView().getItems().get(getIndex());
                            FoodMeasuresWrapper fm = new FoodMeasuresWrapper();
                            for (int i=0;i<CacheUtil.getCurrentHintsWrapper().getHintsList().size();i++){
                                String tmpId = CacheUtil.getCurrentHintsWrapper().getHintsList().get(i).getFood().getFoodId();
                                if (foodView.getFoodId().equals(tmpId)){
                                    fm = CacheUtil.getCurrentHintsWrapper().getHintsList().get(i);
                                }
                            }
                            //store this FoodMeasuresWrapper to static class
                            CacheUtil.setCurrentFoodMeasures(fm);
                            //navigate to next page, which shows the all the measures of the food
                            Parent parent = null;
                            try {
                                parent = FXMLLoader.load(getClass().getResource("/view/ChooseMeasure.fxml"));
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            Scene scene = new Scene(parent);
                            App.primaryStage.setScene(scene);
                            App.primaryStage.setTitle("Measures");
                            App.primaryStage.show();
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

        measuresCol.setCellFactory(cellFactory);
        table.setItems(foods);
    }
}
