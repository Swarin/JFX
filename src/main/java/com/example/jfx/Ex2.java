package com.example.jfx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Ex2 extends Application {

    Label labH, labF;
    Text tH, tF;
    Button btnH, btnF, btnReset;
    int clickCountH;
    int clickCountF;

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
        btnH.setOnAction(e -> clickButt(tH));

        btnF = new Button("+1");
        btnF.setOnAction(e -> clickButt(tF));

        btnReset = new Button("Reset");
        btnReset.setOnAction(e -> clickReset());

        HBox labBox = new HBox();
        labBox.getChildren().addAll(labH, labF);
        labBox.setAlignment(Pos.CENTER);
        labBox.setSpacing(20);

        HBox resBox = new HBox();
        resBox.getChildren().addAll(tH, tF);
        resBox.setAlignment(Pos.CENTER);
        resBox.setSpacing(20);

        HBox btnBox = new HBox();
        btnBox.getChildren().addAll(btnH, btnF, btnReset);
        btnBox.setAlignment(Pos.CENTER);
        btnBox.setSpacing(20);

        VBox root = new VBox();
        root.setSpacing(20);
        root.getChildren().addAll(labBox, resBox, btnBox);
        root.setAlignment(Pos.CENTER);



        Scene scene = new Scene(root, 320, 240);

        primaryStage.setTitle("Exercice 2");
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    private void clickReset() {
        clickCountH = 0;
        clickCountF = 0;
        tF.setText(String.valueOf(clickCountF));
        tH.setText(String.valueOf(clickCountH));
    }

    private void clickButt(Text tN) {
        if(tN == tH) {
            clickCountH++;
            tH.setText(String.valueOf(clickCountH));
        }
        if(tN == tF) {
            clickCountF++;
            tF.setText(String.valueOf(clickCountF));
        }
    }
}
