package javafxapplication4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

/**
 *
 * @author ALLWAYZ
 */
public class JavaFXApplication4 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Polygon polygon = new Polygon();
        polygon.setFill(Color.YELLOW);
        polygon.setStroke(Color.YELLOW);
        polygon.getPoints().addAll(150.0,0.0,
            20.0,225.0,
            280.0,225.0, null);
        
        Polygon polygon1 = new Polygon();
        polygon1.setFill(Color.YELLOW);
        polygon1.setStroke(Color.BLACK);
        polygon1.setStrokeWidth(5);
        polygon1.getPoints().addAll(150.0,10.0,
            30.0,215.0,
            270.0,215.0, null);
        
        
    Arc arc1 = new Arc(150, 150, 70, 70, 60, 60); // Create an arc
    arc1.setFill(Color.BLACK); // Set fill color
    arc1.setType(ArcType.ROUND); // Set arc type
    
    
    Arc arc2 = new Arc(150, 150, 70, 70, 180, 60);
    arc2.setFill(Color.BLACK);
    arc2.setType(ArcType.ROUND);
    arc2.setStroke(Color.BLACK);
    

    Arc arc3 = new Arc(150, 150, 70, 70, -60, 60);
    arc3.setFill(Color.BLACK);
    arc3.setType(ArcType.ROUND);
    arc3.setStroke(Color.BLACK);
    
    
    Circle circle  = new Circle();
    circle.setCenterX(150);
    circle.setCenterY(150);
    circle.setStrokeWidth(10);
    circle.setRadius(25);
    circle.setStroke(Color.YELLOW);
    circle.setFill(Color.BLACK);
    
    
    pane.getChildren().add(polygon);
    pane.getChildren().add(polygon1);
    pane.getChildren().add(arc1); 
    pane.getChildren().add(arc2);
    pane.getChildren().add(arc3);
    pane.getChildren().add(circle);
        
        
        Scene scene = new Scene(pane, 300, 300);        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
