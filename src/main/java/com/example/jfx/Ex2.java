package com.example.jfx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Ex2 extends Application {

    Label labH, labF;
    Text tH, tF;
    Button btnH, btnF, btnReset;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        labH = new Label("Hommes");
        labF = new Label("Femmes");

        tH = new Text("0");
        tF = new Text("0");

        btnH = new Button("+1");
        btnF = new Button("+1");
        btnReset = new Button("Reset");

        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setSpacing(20);
        root.getChildren().addAll();

        Scene scene = new Scene(root, 320, 240);

        primaryStage.setTitle("Exercice 2");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
