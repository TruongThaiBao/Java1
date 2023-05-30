package com.example.java1bt3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("Java1-BT3.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        MainController controller = fxmlLoader.getController();
        controller.getStage(stage);
        stage.setTitle("Bài tập 3!");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}