package src.main.gui;
package main.gui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import main.backend.BookingHandler;

public class ContactPage extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("M2 Drivers - Contact Us");

        GridPane form = new GridPane();
        form.setHgap(10);
        form.setVgap(10);
        form.setPadding(new Insets(20));

        Label nameLabel = new Label("Name:");
        TextField nameField = new TextField();
        Label emailLabel = new Label("Email:");
        TextField emailField = new TextField();
        Label phoneLabel = new Label("Phone:");
        TextField phoneField = new TextField();
        Label messageLabel = new Label("Message:");
        TextArea messageField = new TextArea();

        Button submitBtn = new Button("Submit");
        submitBtn.setStyle("-fx-background-color: #2ecc71; -fx-text-fill: white;");
        submitBtn.setOnAction(e -> {
            // Pass user data to BookingHandler
            BookingHandler.handleBooking(
                nameField.getText(),
                emailField.getText(),
                phoneField.getText(),
                messageField.getText()
            );
        });

        form.add(nameLabel, 0, 0);
        form.add(nameField, 1, 0);
        form.add(emailLabel, 0, 1);
        form.add(emailField, 1, 1);
        form.add(phoneLabel, 0, 2);
        form.add(phoneField, 1, 2);
        form.add(messageLabel, 0, 3);
        form.add(messageField, 1, 3, 1, 3);
        form.add(submitBtn, 1, 6);

        VBox layout = new VBox(15, form);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
