package task6_1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Test extends Application {
    public void start(Stage window) {

        Label label = new Label("Helloo!");
        Button button = new Button("click me");
        button.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {

            label.setText("Helloo222!");
        }
        });

        FlowPane flowPane = new FlowPane();
        flowPane.getChildren().add(label);
        flowPane.getChildren().add(button);
        Scene scene = new Scene(flowPane);


        window.setTitle("My Greeting Application");
        window.setScene(scene);
        window.show();
    }
}