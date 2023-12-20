import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class Main extends Application {
    private Stage window;
    private Scene scene1;
    private Scene scene2;
    public static void main(String[] args) {
        System.out.println("Launching start");
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        System.out.println("Start method was called.");
        window = stage;
        /* This code is for stage1.*/
        Button button1 = new Button();
        button1.setText("Go to scene2.");
        Label label1 = new Label("This is the scene1.");
        VBox layout1 = new VBox();
        scene1 = new Scene(layout1, 200, 300);
        layout1.getChildren().addAll(label1, button1);
        button1.setOnAction(e -> {
            window.setScene(scene2);
        });

        Button button2 = new Button();
        Label label2 = new Label("This is the scene2. Very very very very very very very very long text here...");
        //StackPane is the layout to stack with z-axis.
        StackPane layout2 = new StackPane();
        layout2.getChildren().addAll(label2, button2);
        scene2 = new Scene(layout2,600, 500);
        button2.setText("Go back to scene1.");
        button2.setOnAction(e -> {
            window.setScene(scene1);
        });
        window.setScene(scene1);
        window.show();
    }


}