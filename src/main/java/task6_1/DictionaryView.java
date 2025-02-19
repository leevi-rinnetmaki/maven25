package task6_1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.EventHandler;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Spinner;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class DictionaryView extends Application {

private DictionaryController controller;
private Label definitionLabel = new Label("Defintion");
private TextField addWordTextField = new TextField();
private TextField addWordTextField2 = new TextField();
private Button addWordButton = new Button("Add Word");
private TextField searchWordTextField = new TextField();
private Button searchWordButton = new Button("Search");

    public void start(Stage stage) {
        FlowPane root = new FlowPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(10);
        root.setVgap(10);

        definitionLabel = new Label("Defintion");
        addWordTextField = new TextField();
        addWordTextField2 = new TextField();
        addWordButton = new Button("Add Word");

        addWordButton.setOnAction((ActionEvent event) -> {
            controller.addWord(new String[] {addWordTextField.getText(), addWordTextField2.getText()});
        });

        searchWordTextField = new TextField();
        searchWordButton = new Button("Search");
        searchWordButton.setOnAction((ActionEvent event) -> {
            controller.getWord(searchWordTextField.getText());
            //definitionLabel.setText(controller.getWord(searchWordTextField.getText()));

        });


        root.getChildren().add(addWordTextField);
        root.getChildren().add(addWordTextField2);
        root.getChildren().add(addWordButton);
        root.getChildren().add(searchWordTextField);
        root.getChildren().add(searchWordButton);
        root.getChildren().add(definitionLabel);


        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Dictionary View");
        stage.show();
    }

    public void init(){
        controller = new DictionaryController(this);
    }
    public void setDefinition(String definition){
        definitionLabel.setText(definition);
    }
}