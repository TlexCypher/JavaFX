import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class Main extends Application {
    private Button button;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("This is the title");
        button = new Button();
        button.setText("Click me");

        button.setOnAction(e -> {
            System.out.println("EventHandler(ActionListener) should be written with anonymous lambda function.");
        });

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 300, 250);
        stage.setScene(scene);
        stage.show();
    }


}