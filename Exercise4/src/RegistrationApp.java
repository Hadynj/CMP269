//Starter Code Template

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class RegistrationApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setVgap(10);
        grid.setHgap(10);

        // TODO: Create Labels and TextFields
        Label nameLabel = new Label("Student Name:");
        TextField nameField = new TextField();

        Label courseLabel = new Label("Course Code:");
        ComboBox<String> courseBox = new ComboBox<>();
        courseBox.getItems().addAll("CMP 269", "CMP 167", "CMP 128", "CMP 230");
        courseBox.setPromptText("Select a course");

        // TODO: Create the Register Button
        Button registerButton = new Button("Register");

        // TODO: Implement the Button Action using a Lambda

        Scene scene = new Scene(grid, 400, 250);
        primaryStage.setTitle("Lehman Course Registration");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
