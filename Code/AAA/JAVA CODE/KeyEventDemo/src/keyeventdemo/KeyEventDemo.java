package keyeventdemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class KeyEventDemo extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Circle c1 = new Circle();
        c1.setRadius(200);
        c1.setCenterX(100);
        c1.setCenterY(100);
        c1.setStroke(Color.BLACK);
        c1.setStrokeWidth(30);
        pane.getChildren().add(c1);
        
        c1.setOnKeyPressed(e->{
        switch(e.getCode()){
            case B:c1.setFill(Color.BLUE);break;
            case G:c1.setFill(Color.GREEN);break;
            case A:c1.setFill(Color.WHITE);break;
        }
        });
        
        
        Scene scene = new Scene(pane, 300, 250);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
        c1.requestFocus();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
    

