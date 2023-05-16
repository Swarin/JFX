package com.example.jfx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.EventListener;

public class Ex5TextField extends Application {
    Label labRes;
    TextField tF;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        labRes = new Label("Hello everybody !");

        tF = new TextField();
        tF.setMaxWidth(250);
        tF.setText("Write something here ...");

        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setSpacing(20);
        root.getChildren().addAll(labRes, tF);

        Scene scene = new Scene(root, 300, 300);

        primaryStage.setTitle("Exercice TextField");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


}
