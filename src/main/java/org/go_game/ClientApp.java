package org.go_game;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import org.go_game.board.Board;

public class ClientApp extends Application {
    public static void main(String[] args){
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        BorderPane layout = new BorderPane();
        Button button = new Button("XD");
        Button button1 = new Button("XD2");
        layout.setCenter(button);
        layout.setCenter(button1);
        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();
    }
}
