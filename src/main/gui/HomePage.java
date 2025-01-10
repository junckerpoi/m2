package src.main.gui;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HomePage extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("M2 Drivers - Home");

        // Top Banner
        Text bannerText = new Text("Welcome to M2 Drivers");
        bannerText.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");

        // Navigation Bar
        HBox navBar = new HBox(10);
        Button homeBtn = new Button("Home");
        Button servicesBtn = new Button("Services");
        Button contactBtn = new Button("Contact");
        navBar.getChildren().addAll(homeBtn, servicesBtn, contactBtn);
        navBar.setAlignment(Pos.CENTER);
        navBar.setStyle("-fx-padding: 10; -fx-background-color: #3498db;");

        // Main Content
        VBox mainContent = new VBox(20);
        mainContent.setAlignment(Pos.CENTER);

        Image logo = new Image("file:assets/images/logo.png"); // Replace with your image path
        ImageView logoView = new ImageView(logo);
        logoView.setFitWidth(150);
        logoView.setFitHeight(150);

        Text welcomeText = new Text("Your journey to mastering driving starts here!");
        welcomeText.setStyle("-fx-font-size: 18px; -fx-text-fill: #2c3e50;");

        Button learnMoreBtn = new Button("Learn More");
        learnMoreBtn.setStyle("-fx-background-color: #2ecc71; -fx-text-fill: white;");

        mainContent.getChildren().addAll(logoView, welcomeText, learnMoreBtn);

        // Layout
        BorderPane layout = new BorderPane();
        layout.setTop(navBar);
        layout.setCenter(mainContent);

        Scene scene = new Scene(layout, 800, 600);
        scene.getStylesheets().add("file:assets/styles/style.css"); // External CSS

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
