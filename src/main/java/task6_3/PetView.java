package task6_3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class PetView extends Application {
    private PetController controller;
    private GraphicsContext gc;
    private Canvas canvas;
    private FlowPane flow;
    public double x;
    public double y;

    public void start(Stage stage) {
        canvas = new Canvas(800, 600);
        flow = new FlowPane();
        double x = 60;
        double y = 60;


        gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.RED);
        gc.fillOval(x, y, 30, 30);
        //gc.moveTo(x, y);

        canvas.setOnMouseMoved(event -> {
            //x = event.getX();
            //gc.moveTo(2, 3);
            gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
            gc.setFill(Color.GREEN);
            gc.fillOval(event.getX(), event.getY(), 30, 30);
            System.out.println(x);
        });

        flow.getChildren().add(canvas);
        Scene scene = new Scene(flow, 800, 600);
        stage.setScene(scene);
        stage.setTitle("Pet View");
        stage.show();
    }

    public void init(){
        controller = new PetController(this);
        controller.test();
    }
}