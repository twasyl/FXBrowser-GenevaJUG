package com.twasyl.fxbrowser.app;

import javafx.application.Application;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    private static ObjectProperty<Stage> currentStage;

    public static ObjectProperty<Stage> currentStageProperty() {
        return currentStage;
    }

    public static Stage getCurrentStage() {
        return currentStageProperty().get();
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        currentStage = new SimpleObjectProperty<Stage>(primaryStage);

        Parent root = FXMLLoader.load(getClass().getResource("/com/twasyl/fxbrowser/resources/fxml/FXBrowser.fxml"));

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
