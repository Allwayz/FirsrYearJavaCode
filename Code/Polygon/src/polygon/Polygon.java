package polygon;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Polygon extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       
        
        
        Rectangle x1 = new Rectangle();
        
        
        
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 300, 250);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
