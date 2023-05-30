//package com.example.java1bt3;
//
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.fxml.FXMLLoader;
//import javafx.fxml.Initializable;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.RadioButton;
//import javafx.scene.control.ToggleGroup;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.Rectangle;
//import javafx.stage.Stage;
//
//import java.io.IOException;
//import java.net.URL;
//import java.util.ResourceBundle;
//
//public class OptionController implements Initializable{
//    @FXML
//    private Button okButton;
//    @FXML
//    private ToggleGroup shape;
//
//    @FXML
//    Label lb;
//    public int getValueShape(){
//            int rs;
//            RadioButton selectedRadioButton = (RadioButton) shape.getSelectedToggle();
//            String rdvalue = selectedRadioButton.getText();
//            if (rdvalue.equals("Rectangle")){
//                lb.setText("");
//                return rs=1;
//            }else if (rdvalue.equals("Ellipse")) {
//                lb.setText("");
//                return rs=2;
//            } else if(rdvalue.equals("Triangle")){
//                lb.setText("");
//                return rs=3;
//            }else {
//                return rs=1;
//            }
//    }
//
//    @FXML
//    protected void onOKButtonClick(ActionEvent event) throws IOException {
//        int rs = getValueShape();
//        Stage stage = (Stage) okButton.getScene().getWindow();
//        stage.close();
//
//        FXMLLoader helloLoader = new FXMLLoader(getClass().getResource("Java1-BT3.fxml"));
//        Parent helloRoot = helloLoader.load();
//        MainController helloController = helloLoader.getController();
//        helloController.getStage(stage); // Chuyển đối tượng Stage
//
////        helloController.setShape(selectedShape);
//
////        stage.setScene(new Scene(helloRoot));
////        stage.show();
//
//
//    }
//}
