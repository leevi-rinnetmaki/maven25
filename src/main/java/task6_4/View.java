package task6_4;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class View extends Application {
    private Model model;
    private Controller controller;

    public View(){
        System.out.println(this);
    }

    public void start(Stage stage) throws Exception {
        //model = new Model(/*controller, this*/);
        //controller = new Controller();

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/test.fxml"));
        Parent root = fxmlLoader.load();

        stage.setScene(new Scene(root));
        stage.show();
    }
}