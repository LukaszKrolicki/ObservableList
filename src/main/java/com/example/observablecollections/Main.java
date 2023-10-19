package com.example.observablecollections;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setSpacing(10);
        ObservableList<String> list = FXCollections.observableArrayList("One", "Two", "Three");//creates list that will automatically change itstelf
        ListView<String> items = new ListView<>();
        items.setItems(list);

        TextField field = new TextField();
        Button button = new Button("ADD");

        button.setOnAction(e->list.add(field.getText()));
        root.getChildren().addAll(items,field,button);
        Scene scene = new Scene(root,500,500);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}


