package org.go_game;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.go_game.scene.SceneManager;


public class App extends Application {
    private Stage stage;
    private Scene menu;
    public static void main (String[] args){
        launch(args);
    }
    @Override
    public void start(Stage stage){
        this.stage=stage;
        stage.setTitle("GO");
    }
}
