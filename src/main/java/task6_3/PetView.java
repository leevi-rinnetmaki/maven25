package task6_3;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;


public class PetView extends Application {
    private PetController controller;
    private PetModel model;
    private GraphicsContext gc;
    private Canvas canvas;
    private FlowPane flow;
    private boolean move = false;
    private Image image;

    public void start(Stage stage) {
        canvas = new Canvas(1800, 1200);
        flow = new FlowPane();


        gc = canvas.getGraphicsContext2D();
        image = new Image(getClass().getResource("/Unto.jpg").toExternalForm());
        gc.setFill(Color.RED);
        gc.drawImage(image, model.getCordinates()[0], model.getCordinates()[1], 120, 120);


        canvas.setOnMouseMoved(event -> {
            //target=new double[]{event.getX() - model.getCordinates()[0], event.getY() - model.getCordinates()[1]};

            //controller.move(new double[]{event.getX(), event.getY()});
            /*
            if(!Arrays.equals(mouse, model.getCordinates())) {
                mouse=new double[]{event.getX(), event.getY()};
                model.walk(mouse);
                System.out.println("JOTIA");
            }

             */
            //model.walk(new double[]{event.getX(), event.getY()});
        });

        flow.getChildren().add(canvas);
        Scene scene = new Scene(flow, 1800, 1200);
        stage.setScene(scene);
        stage.setTitle("Pet View");





        scene.addEventFilter(MouseEvent.MOUSE_ENTERED_TARGET, e ->{
            move = true;
        });

        scene.addEventFilter(MouseEvent.MOUSE_EXITED_TARGET, e ->{
            move = false;
        });









        scene.addEventFilter(MouseEvent.MOUSE_MOVED, e -> {
            model.setMouse(new double[]{e.getX(), e.getY()});
            model.calculateVektor();
        });




        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(16), e -> {
            if (move) {
                model.setCordinates(new double[]{model.getCordinates()[0] += model.getVektor()[0] * 0.05, model.getCordinates()[1] += model.getVektor()[1] * 0.05});
                model.calculateVektor();
                move();
            }

        }));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();












        stage.show();
    }

    public void init(){
        controller = new PetController(this, new PetModel(new double[]{50, 60}, new double[]{50, 60}, new double[]{0, 0}, controller, this));
        model = controller.model;
    }

    public void move() {
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        gc.drawImage(image, model.getCordinates()[0], model.getCordinates()[1], 700, 700);
    }
}