package circlemove;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CircleMove extends Application {
    Circle c1;
    Circle c2;
    Button L;
    Button R;
    Button U;
    Button D;
    HBox hBox;
    BorderPane pane ;
    @Override
    public void start(Stage primaryStage) {
        
        c1 = new Circle();
        c1.setCenterX(110);
        c1.setCenterY(110);
        c1.setRadius(50);
        c1.setFill(Color.BLACK);
        
        c2 = new Circle();
        c2.setCenterX(-300);
        c2.setCenterY(-300);
        c2.setRadius(50);
        c2.setFill(Color.BLACK);
        
        hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);
        L = new Button("Left");
        R = new Button("Right");
        U = new Button("Up");
        D = new Button("Down");
        hBox.getChildren().addAll(L,R,U,D);
        
        R.setOnAction(e->{
            if(c1.getCenterX()<550 && c1.getCenterX()>=450){
                c1.setCenterX(c1.getCenterX() + 20);
                c2.setCenterX(c1.getCenterX()-500);
                c2.setCenterY(c1.getCenterY());
            }else if(c1.getCenterX()==550){
        c1.setCenterX(50 + 20);
        c2.setCenterX(c1.getCenterX());
        c2.setCenterY(c1.getCenterY());
        }else if(c1.getCenterX()>-50&&c1.getCenterX()<50){
            c1.setCenterX(c1.getCenterX()+20);
            c2.setCenterX(c2.getCenterX()+20);
        }else if(c1.getCenterX()==-50){
            c1.setCenterX(c1.getCenterX()+20);
            c2.setCenterX(c2.getCenterX()+20);
        }else if (c1.getCenterY()<50 && c1.getCenterY()>-50 || c1.getCenterY()<550 && c1.getCenterY()>450 ){
            c1.setCenterX(c1.getCenterX()+20);
            c2.setCenterX(c2.getCenterX()+20);
        }else{
            c1.setCenterX(c1.getCenterX() + 20);
            c2.setCenterX(c1.getCenterX());
            c2.setCenterY(c1.getCenterY());
            }
        });
        
        L.setOnAction(e->{
            if(c1.getCenterX()<50 && c1.getCenterX()>-50){
                c1.setCenterX(c1.getCenterX()-20);
                c2.setCenterX(c1.getCenterX()+500);
                c2.setCenterY(c1.getCenterY());
            }else if(c1.getCenterX()==-50){
                c1.setCenterX(450 - 20);
                c2.setCenterX(c1.getCenterX());
                c2.setCenterY(c1.getCenterY());
        }else if (c1.getCenterX()>450 && c1.getCenterX()<550){
                c1.setCenterX(c1.getCenterX()-20);
                c2.setCenterX(c2.getCenterX()-20);
        }else if (c1.getCenterX()==550){
            c1.setCenterX(c1.getCenterX()-20);
            c2.setCenterX(c2.getCenterX()-20);
        }else if (c1.getCenterY()<50 && c1.getCenterY()>-50 || c1.getCenterY()<550 && c1.getCenterY()>450 ){
            c1.setCenterX(c1.getCenterX()-20);
            c2.setCenterX(c2.getCenterX()-20);
        }else{
        c1.setCenterX(c1.getCenterX() - 20);
        c2.setCenterX(c1.getCenterX());
        c2.setCenterY(c1.getCenterY());
            }
        });
        
        U.setOnAction(e->{
            if(c1.getCenterY()<50 && c1.getCenterY()>-50){
            c1.setCenterY(c1.getCenterY()-20);
            c2.setCenterY(c1.getCenterY()+500);
            c2.setCenterX(c1.getCenterX());
            }else if(c1.getCenterY()==-50){
                c1.setCenterY(450-20);
                c2.setCenterX(c1.getCenterX());
                c2.setCenterY(c1.getCenterY());                
        }else if (c1.getCenterY()>450 && c1.getCenterY()<550){
            c1.setCenterY(c1.getCenterY()-20);
            c2.setCenterY(c2.getCenterY()-20);
        }else if (c1.getCenterY()==550){
            c1.setCenterY(c1.getCenterY()-20);
            c2.setCenterY(c2.getCenterY()-20);
        }else if (c1.getCenterX()>450 && c1.getCenterX()<550 || c1.getCenterX()>-50 && c1.getCenterX()<50){
            c1.setCenterY(c1.getCenterY()-20);
            c2.setCenterY(c2.getCenterY()-20);
        }else{
        c1.setCenterY(c1.getCenterY()-20);
        c2.setCenterX(c1.getCenterX());
        c2.setCenterY(c1.getCenterY());
            };
        });
        
        D.setOnAction(e->{
            if(c1.getCenterY()<550 && c1.getCenterY()>=450){
                c1.setCenterY(c1.getCenterY()+20);
                c2.setCenterY(c1.getCenterY()-500);
                c2.setCenterX(c1.getCenterX());
            }else if(c1.getCenterY()==550){
        c1.setCenterY(50 + 20);
        c2.setCenterX(c1.getCenterX());
        c2.setCenterY(c1.getCenterY());
        }else if (c1.getCenterY()<50 && c1.getCenterY()>-50){
            c1.setCenterY(c1.getCenterY()+20);
            c2.setCenterY(c2.getCenterY()+20);
        }else if (c1.getCenterY()==-50){
            c1.setCenterY(c1.getCenterY()+20);
            c2.setCenterY(c2.getCenterY()+20);
        }else if (c1.getCenterX()>450 && c1.getCenterX()<550 || c1.getCenterX()>-50 && c1.getCenterX()<50){
            c1.setCenterY(c1.getCenterY()+20);
            c2.setCenterY(c2.getCenterY()+20);
        }else{
        c1.setCenterY(c1.getCenterY()+20);
        c2.setCenterX(c1.getCenterX());
        c2.setCenterY(c1.getCenterY());
            }
        });
        
        
        c1.setOnKeyPressed(e -> {          
      switch (e.getCode()) {
        case W: if(c1.getCenterY()<50 && c1.getCenterY()>-50){
            c1.setCenterY(c1.getCenterY()-20);
            c2.setCenterY(c1.getCenterY()+500);
            c2.setCenterX(c1.getCenterX());
            }else if(c1.getCenterY()==-50){
                c1.setCenterY(450-20);
                c2.setCenterX(c1.getCenterX());
                c2.setCenterY(c1.getCenterY());                
        }else if (c1.getCenterY()>450 && c1.getCenterY()<550){
            c1.setCenterY(c1.getCenterY()-20);
            c2.setCenterY(c2.getCenterY()-20);
        }else if (c1.getCenterY()==550){
            c1.setCenterY(c1.getCenterY()-20);
            c2.setCenterY(c2.getCenterY()-20);
        }else if (c1.getCenterX()>450 && c1.getCenterX()<550 || c1.getCenterX()>-50 && c1.getCenterX()<50){
            c1.setCenterY(c1.getCenterY()-20);
            c2.setCenterY(c2.getCenterY()-20);
        }else{
        c1.setCenterY(c1.getCenterY()-20);
        c2.setCenterX(c1.getCenterX());
        c2.setCenterY(c1.getCenterY());
            }; break;
        case A:  if(c1.getCenterX()<50 && c1.getCenterX()>-50){
                c1.setCenterX(c1.getCenterX()-20);
                c2.setCenterX(c1.getCenterX()+500);
                c2.setCenterY(c1.getCenterY());
            }else if(c1.getCenterX()==-50){
                c1.setCenterX(450 - 20);
                c2.setCenterX(c1.getCenterX());
                c2.setCenterY(c1.getCenterY());
        }else if (c1.getCenterX()>450 && c1.getCenterX()<550){
                c1.setCenterX(c1.getCenterX()-20);
                c2.setCenterX(c2.getCenterX()-20);
        }else if (c1.getCenterX()==550){
            c1.setCenterX(c1.getCenterX()-20);
            c2.setCenterX(c2.getCenterX()-20);
        }else if (c1.getCenterY()<50 && c1.getCenterY()>-50 || c1.getCenterY()<550 && c1.getCenterY()>450 ){
            c1.setCenterX(c1.getCenterX()-20);
            c2.setCenterX(c2.getCenterX()-20);
        }else{
        c1.setCenterX(c1.getCenterX() - 20);
        c2.setCenterX(c1.getCenterX());
        c2.setCenterY(c1.getCenterY());
            }; break;
        case S:  if(c1.getCenterY()<550 && c1.getCenterY()>=450){
                c1.setCenterY(c1.getCenterY()+20);
                c2.setCenterY(c1.getCenterY()-500);
                c2.setCenterX(c1.getCenterX());
            }else if(c1.getCenterY()==550){
        c1.setCenterY(50 + 20);
        c2.setCenterX(c1.getCenterX());
        c2.setCenterY(c1.getCenterY());
        }else if (c1.getCenterY()<50 && c1.getCenterY()>-50){
            c1.setCenterY(c1.getCenterY()+20);
            c2.setCenterY(c2.getCenterY()+20);
        }else if (c1.getCenterY()==-50){
            c1.setCenterY(c1.getCenterY()+20);
            c2.setCenterY(c2.getCenterY()+20);
        }else if (c1.getCenterX()>450 && c1.getCenterX()<550 || c1.getCenterX()>-50 && c1.getCenterX()<50){
            c1.setCenterY(c1.getCenterY()+20);
            c2.setCenterY(c2.getCenterY()+20);
        }else{
        c1.setCenterY(c1.getCenterY()+20);
        c2.setCenterX(c1.getCenterX());
        c2.setCenterY(c1.getCenterY());
            }; break;
        case D: if(c1.getCenterX()<550 && c1.getCenterX()>=450){
                c1.setCenterX(c1.getCenterX() + 20);
                c2.setCenterX(c1.getCenterX()-500);
                c2.setCenterY(c1.getCenterY());
            }else if(c1.getCenterX()==550){
        c1.setCenterX(50 + 20);
        c2.setCenterX(c1.getCenterX());
        c2.setCenterY(c1.getCenterY());
        }else if(c1.getCenterX()>-50&&c1.getCenterX()<50){
            c1.setCenterX(c1.getCenterX()+20);
            c2.setCenterX(c2.getCenterX()+20);
        }else if(c1.getCenterX()==-50){
            c1.setCenterX(c1.getCenterX()+20);
            c2.setCenterX(c2.getCenterX()+20);
        }else if (c1.getCenterY()<50 && c1.getCenterY()>-50 || c1.getCenterY()<550 && c1.getCenterY()>450 ){
            c1.setCenterX(c1.getCenterX()+20);
            c2.setCenterX(c2.getCenterX()+20);
        }else{
            c1.setCenterX(c1.getCenterX() + 20);
            c2.setCenterX(c1.getCenterX());
            c2.setCenterY(c1.getCenterY());
            }; break;
        
      }
    });
        
        pane = new BorderPane();
        pane.setBottom(hBox);
        pane.getChildren().addAll(c1,c2);
        
        
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setTitle("CircleMove");
        primaryStage.setScene(scene);
        primaryStage.show();
        c1.requestFocus();
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
