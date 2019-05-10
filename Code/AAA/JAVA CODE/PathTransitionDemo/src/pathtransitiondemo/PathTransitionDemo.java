package pathtransitiondemo;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class PathTransitionDemo extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       Pane pane = new Pane();
       
       Rectangle rectangle = new Rectangle(0,0,250,500);
       rectangle.setFill(Color.ORANGE);
       pane.getChildren().add(rectangle);
       
       Circle circle = new Circle();
       circle.setFill(Color.WHITE);
       circle.setStroke(Color.BLACK);
       circle.setCenterX(600);
       circle.setCenterY(400);
       circle.setRadius(200);
       circle.setStrokeWidth(20);
       pane.getChildren().add(circle);
       
       
       PathTransition pt = new PathTransition();
       pt.setDuration(Duration.millis(2000));
       pt.setPath(circle);
       pt.setNode(rectangle);
       pt.setOrientation(
       PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
       pt.setCycleCount(Timeline.INDEFINITE);
       pt.setAutoReverse(true);
       pt.play();
        
       circle.setOnMousePressed(e -> pt.pause());
       circle.setOnMouseReleased(e -> pt.play());
        
        
        
        Scene scene = new Scene(pane, 300, 250);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
    
}
