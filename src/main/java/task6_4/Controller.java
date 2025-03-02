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
        this.model = new Model(this);
    }

    @FXML
    public VBox root;

    @FXML
    public HBox top;

    @FXML
    public VBox left;

    @FXML
    public TextField leftTitle;

    @FXML
    public TextArea leftText;

    @FXML
    public VBox right;

    @FXML
    public Label rightTitle;

    @FXML
    public Label rightText;

    @FXML
    public Button add;

    @FXML
    public ChoiceBox<String> choiceBox;

    @FXML
    public Button watch;

    public void addNote(){
        System.out.println(leftTitle.getText());
        model.noteBook.addNote(leftTitle.getText(), leftText.getText());
        choiceBox.getItems().add(leftTitle.getText());
    }

    public void watch(){
        Model.Note note = model.noteBook.getNote(choiceBox.getValue());
        rightTitle.setText(note.title);
        rightText.setText(note.content);
    }

}
