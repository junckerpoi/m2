package backend;
package main;

import javafx.application.Application;
import javafx.stage.Stage;
import main.gui.HomePage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        HomePage homePage = new HomePage();
        homePage.start(primaryStage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
