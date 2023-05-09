package com.example.jfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

import java.io.IOException;

public class Ex1App extends Application {
    Button btn1, btn2;
    Label lab1;
    int clickCount;
    @Override
    public void start(Stage stage) throws IOException {
        lab1 = new Label();
        lab1.setText("0");

        btn1 = new Button();
        btn1.setText("+1");
        btn1.setOnAction(e -> clickButt());

        btn2 = new Button();
        btn2.setText("Reset");
        btn2.setOnAction(e -> clickReset());

        FlowPane fp = new FlowPane();
        fp.setAlignment(Pos.CENTER);
        fp.getChildren().add(lab1);

        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setSpacing(20);
        root.getChildren().addAll(fp, btn1, btn2);

        Scene scene = new Scene(root, 320, 240);

        stage.setTitle("Exercice 1");
        stage.setScene(scene);
        stage.show();
    }

    private void clickReset() {
        clickCount = 0;
        lab1.setText(String.valueOf(clickCount));
    }

    private void clickButt() {
        clickCount++;
        lab1.setText(String.valueOf(clickCount));
    }

    public static void main(String[] args) {
        launch();
    }


}