package com.codedotorg;

import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {
        launch();
    }

    public void start(Stage primaryStage) {
        PixelPedia games = new PixelPedia(primaryStage, 1020, 1020);
        games.startApp();
    }

}