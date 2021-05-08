package com.caniksoft;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/fxml/main.fxml"));
        GridPane mainControllerRoot = fxmlLoader.load();

        primaryStage.setTitle("Canik Rss Reader");
        primaryStage.setScene(new Scene(mainControllerRoot));
        primaryStage.show();


        primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent event) {
//                FileUtils.saveConfigFile();
            }
        });

    }


    public static void main(String[] args) {
        launch(args);
    }
}
