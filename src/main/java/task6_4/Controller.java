package task6_4;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;



public class Controller {
    Model model;
    public Controller() {
        System.out.println(this);
        this.model = new Model();
    }

    @FXML
    private VBox root;

    @FXML
    private HBox top;

    @FXML
    private VBox left;

    @FXML
    private TextField leftTitle;

    @FXML
    private TextArea leftText;

    @FXML
    private VBox right;

    @FXML
    private Label rightTitle;

    @FXML
    private Label rightText;

    @FXML
    private Button add;

    @FXML
    private ChoiceBox<String> choiceBox;

    /*
    public void initialize() {
        myLabel.setText("Hi");
    }

     */
    public void addNote(){
        System.out.println("testi");
        rightText.setText("testi");
    }

}
