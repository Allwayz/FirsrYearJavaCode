package examtest;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JavaFX extends Application {
    
    
    @Override
    public void start(Stage primaryStage) {
    Circle circle = new Circle();
    circle.setCenterX(150);
    circle.setCenterY(150);
    circle.setRadius(100);
    circle.setStroke(Color.BLACK);
    circle.setFill(null);
    
    Line hour = new Line(150,150,75,150);
    Line min = new Line(150,150,150,60);
    
      Text text = new Text();      
      text.setText("12"); 
      text.setX(150); 
      text.setY(65); 
        
      Text text1 = new Text();      
      text.setText("3"); 
      text.setX(245); 
      text.setY(150); 
      
      Text text2 = new Text();      
      text.setText("6"); 
      text.setX(150); 
      text.setY(245); 
      
      Text text3 = new Text();      
      text.setText("9"); 
      text.setX(65); 
      text.setY(150); 
      
    Pane pane = new Pane();
    pane.getChildren().add(circle);
    pane.getChildren().add(hour);
    pane.getChildren().add(min);
    pane.getChildren().add(text);
    pane.getChildren().add(text1);
    pane.getChildren().add(text2);
    pane.getChildren().add(text3);
    
    Scene scene = new Scene(pane,300,300);
    primaryStage.setTitle("Hello World!");
    primaryStage.setScene(scene);
    primaryStage.show();
    
    
    
    

    

    }

    public static void main(String[] args) {
        launch(args);
        
    }
    
}
