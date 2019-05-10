package javafxapplication11;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class MouseEventDemo extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        Pane root = new Pane();  
        Circle c1 = new Circle();
        c1.setRadius(100);
        c1.setFill(Color.RED);
        c1.setStroke(Color.BLUE);
        
        
               
        
        c1.setOnMouseDragged(e->{
            c1.setCenterX(e.getX());
            c1.setCenterY(e.getY());
        });
                root.getChildren().add(c1);


        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
