import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloWorld extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a label with "Hello, World!" text
        Label helloWorldLabel = new Label("Hello, World!");

        // Create a stack pane and add the label to it
        StackPane root = new StackPane();
        root.getChildren().add(helloWorldLabel);

        // Create a scene with the stack pane as the root node
        Scene scene = new Scene(root, 300, 200);

        // Set the title of the stage (window) and add the scene to it
        primaryStage.setTitle("Hello World JavaFX");
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
