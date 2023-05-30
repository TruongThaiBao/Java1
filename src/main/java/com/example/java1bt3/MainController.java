package com.example.java1bt3;

import javafx.animation.Animation;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private Polygon item1, item2, item3;
    @FXML
    protected HBox hBox;


    private Stage stage;

    @FXML
    protected void onHelloButtonClick() {

    }

    public void getStage(Stage stage) {
        this.stage = stage;
    }

    @FXML
    protected void delShape(ActionEvent event) {
        hBox.getChildren().removeAll(item1, item2, item3);
    }

    @FXML
    protected void Exit(ActionEvent event) {
        stage.close();
    }
    @FXML
    protected void openOption(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Option.fxml"));
            Parent root = loader.load();

            Stage newStage = new Stage();
            newStage.setTitle("Option");
            newStage.setScene(new Scene(root));
//            newStage.initStyle(StageStyle.UNDECORATED);
            newStage.setResizable(false);
            newStage.show();
            btnOK.setOnAction(event -> {
//            Label Er = (Label) fxmlLoader.getNamespace().get("lblErr");
                if(this.getRadioButtonValue() >0 && this.getColorOption() != null){
                    this.DrawShapes(this.getRadioButtonValue(),this.getColorOption(),this.bdPane);
                    stageop.close();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    private Button okButton;
    @FXML
    private ToggleGroup shape;

    @FXML
    Label lb;
    public int getValueShape(){
        RadioButton selectedRadioButton = (RadioButton) shape.getSelectedToggle();
        String RadioValue = selectedRadioButton.getText();
        if (RadioValue.equals("Rectangle")){
            lb.setText("");
            return 1;
        }else if (RadioValue.equals("Ellipse")) {
            lb.setText("");
            return 2;
        } else if(RadioValue.equals("Triangle")){
            lb.setText("");
            return 3;
        }else {
            return 1;
        }
    }
    public Rectangle drawRec(){
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(100);
        rectangle.setWidth(120);
        rectangle.setFill(Color.RED);
        return rectangle;
    }
//    @FXML
//    protected void onOKButtonClick(ActionEvent event) throws IOException {
//        Stage stage = (Stage) okButton.getScene().getWindow();
//        stage.close();
//        if (hBox != null && getValueShape() == 1) {
//            hBox.getChildren().clear();
////            Rectangle rectangle = drawRec(); // Vẽ hình chữ nhật
////            hBox.getChildren().add(rectangle); // Đặt hình chữ nhật vào trung tâm của BorderPane
//        }
//        System.out.println(getValueShape());
    }



    @Override
    public void initialize(URL location, ResourceBundle resources) {
//        TranslateTransition transition1 = new TranslateTransition(Duration.seconds(1), item1);
//        transition1.setByY(80f);
//        transition1.setCycleCount(Animation.INDEFINITE);
//        transition1.setAutoReverse(true);
//        transition1.play();
//
//        TranslateTransition transition2 = new TranslateTransition(Duration.seconds(1), item2);
//        transition2.setByY(-80f);
//        transition2.setCycleCount(Animation.INDEFINITE);
//        transition2.setAutoReverse(true);
//        transition2.play();
//
//        TranslateTransition transition3 = new TranslateTransition(Duration.seconds(1), item3);
//        transition3.setByY(80f);
//        transition3.setCycleCount(Animation.INDEFINITE);
//        transition3.setAutoReverse(true);
//        transition3.play();

    }

}
