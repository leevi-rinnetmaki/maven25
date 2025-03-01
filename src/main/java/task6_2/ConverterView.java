package task6_2;

//import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ConverterView extends Application {

    private ConverterController controller;

    private BorderPane layout;
    private VBox left;
    private VBox right;
    private BorderPane center;

    private ToggleGroup toggleGroupLeft;
    private RadioButton dollarLeft;
    private RadioButton euroLeft;
    private RadioButton poundLeft;

    private ToggleGroup toggleGroupRight;
    private RadioButton dollarRight;
    private RadioButton euroRight;
    private RadioButton poundRight;

    private TextField textLeft;
    private TextField textRight;
    private Button convertButton;
    private Label errorLabel;


    public void start(Stage stage) {

        //INITIALIZING VARIABLES
        layout = new BorderPane();
        left = new VBox();
        right = new VBox();
        center = new BorderPane();

        toggleGroupLeft = new ToggleGroup();
        dollarLeft = new RadioButton("$");
        dollarLeft.setUserData("$");
        euroLeft = new RadioButton("€");
        euroLeft.setUserData("€");
        poundLeft = new RadioButton("£");
        poundLeft.setUserData("£");

        toggleGroupRight = new ToggleGroup();
        dollarRight = new RadioButton("$");
        dollarRight.setUserData("$");
        euroRight = new RadioButton("€");
        euroRight.setUserData("€");
        poundRight = new RadioButton("£");
        poundRight.setUserData("£");

        textLeft = new TextField();
        textRight = new TextField();
        convertButton = new Button("Convert");
        errorLabel = new Label();

        //LEFT
        dollarLeft.setToggleGroup(toggleGroupLeft);
        euroLeft.setToggleGroup(toggleGroupLeft);
        poundLeft.setToggleGroup(toggleGroupLeft);
        left.getChildren().addAll(dollarLeft, euroLeft, poundLeft);
        left.setAlignment(Pos.CENTER);


        //RIGHT
        dollarRight.setToggleGroup(toggleGroupRight);
        euroRight.setToggleGroup(toggleGroupRight);
        poundRight.setToggleGroup(toggleGroupRight);
        right.getChildren().addAll(dollarRight, euroRight, poundRight);
        right.setAlignment(Pos.CENTER);


        //CENTER
        center.setLeft(textLeft);
        textLeft.setAlignment(Pos.CENTER);

        center.setRight(textRight);
        textRight.setAlignment(Pos.BOTTOM_CENTER);

        center.setCenter(convertButton);
        center.setBottom(errorLabel);

        convertButton.setOnAction(calue ->{
            controller.convert();
        });



        //SETTING UP THE STUFF
        layout.setLeft(left);
        layout.setRight(right);
        layout.setCenter(center);

        Scene scene = new Scene(layout, 500, 500);
        stage.setScene(scene);
        stage.setTitle("Converter");
        stage.show();

        System.out.println("Converter started");
        System.out.println(controller.view.controller.view.controller.view.controller.view.controller.view.controller.view.controller.view.controller.view.controller.view.controller.view.controller.view.controller.view.controller.view);
    }

    public void init(){
        this.controller = new ConverterController(new ConverterModel(), this);
    }

    public String getValue(){
        return textLeft.getText();
    }

    public String radioLeft(){
        toggleGroupLeft.getSelectedToggle().getUserData();
        return ((RadioButton) toggleGroupLeft.getSelectedToggle()).getText();
    }

    public String radioRight(){
        toggleGroupRight.getSelectedToggle().getUserData();
        return ((RadioButton) toggleGroupRight.getSelectedToggle()).getText();
    }

    public void setCOnverted(String value){
        textRight.setText(value);
    }

    public void setErrorLabel(String value){
        errorLabel.setText(value);
    }
}
