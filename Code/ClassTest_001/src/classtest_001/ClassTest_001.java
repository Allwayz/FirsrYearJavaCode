package classtest_001;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ClassTest_001 extends Application {
    TextField t1;
    TextField t2;
    Button btSum;
    Button btMu;
    Text text;
    Text text2;
    
    @Override
    public void start(Stage primaryStage) {
        GridPane gridpane = new GridPane();
        
        t1 = new TextField();
        gridpane.add(t1, 0, 0);
                
        t2 = new TextField();
        gridpane.add(t2, 0, 1);
        
        btSum = new Button("Sum");
        gridpane.add(btSum, 0, 2);
        
        btMu =  new Button("Multiplication");
        gridpane.add(btMu,1,2);
        
        text = new Text();
        gridpane.add(text, 0, 3);
        
        text2 = new Text();
        gridpane.add(text2,1,3);
        
        
        
        
        btSum.setOnAction(e -> {
            double result;
            result = Double.parseDouble(t1.getText())+Double.parseDouble(t2.getText());
            text.setText(Double.toString(result));
        });
        
        btMu.setOnAction(e->{
            double result;
            result = Double.parseDouble(t1.getText())*Double.parseDouble(t2.getText());
            text2.setText(Double.toString(result));
        });
        
        
        //gridpane.getChildren().addAll(t1,t2,btSum,text);
        Scene scene = new Scene(gridpane);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

        public static void main(String[] args) {
        launch(args);
    }
        
       
    
}
