package src.main.gui;
package main.gui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ServicesPage extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("M2 Drivers - Services");

        Text heading = new Text("Our Services");
        heading.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");

        Text beginnerCourse = new Text("• Beginner Driving Lessons");
        Text mockTests = new Text("• Mock Driving Tests");
        Text advancedTraining = new Text("• Advanced Driver Training");

        VBox content = new VBox(15, heading, beginnerCourse, mockTests, advancedTraining);
        content.setPadding(new Insets(20));
        content.setAlignment(Pos.CENTER);

        Button backToHomeBtn = new Button("Back to Home");
        backToHomeBtn.setStyle("-fx-background-color: #3498db; -fx-text-fill: white;");
        backToHomeBtn.setOnAction(e -> new HomePage().start(primaryStage));

        VBox layout = new VBox(20, content, backToHomeBtn);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
