package task6_4;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Test extends Application {

    public void start(Stage stage) {
        Label label = new Label("Hello World");

        Scene scene = new Scene(label, 300, 300);
        stage.setScene(scene);
        stage.show();
    }

}
