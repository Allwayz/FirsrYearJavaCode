package claculator_exam;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author ALLWAYZ
 */
public class Claculator_Exam extends Application {
    Text Amount;
    Text Years;
    Text Rate;
    Text Value;
    TextField t1;
    TextField t2;
    TextField t3;
    Button Cal;
    Button btMu;
    Text text;
    Text text2;
    @Override
    public void start(Stage primaryStage) {
        GridPane gridpane = new GridPane();
        
        Amount = new Text();
        Amount.setText("Investment Amount");
        gridpane.add(Amount, 0, 0);
        
        t1 = new TextField();
        gridpane.add(t1, 1, 0);
                
        Years = new Text();
        Years.setText("Years");
        gridpane.add(Years, 0, 1);
        
        t2 = new TextField();
        gridpane.add(t2, 1, 1);
        
        Rate = new Text();
        Rate.setText("Annual Interest Rate");
        gridpane.add(Rate, 0, 2);
        
        t3 = new TextField();
        gridpane.add(t3, 1, 2);
        
        Value = new Text();
        Value.setText("Future Value");
        gridpane.add(Value, 0, 3);
        
        text = new Text();
        gridpane.add(text, 1, 3);
        
        
        Cal = new Button("Calculate");
        gridpane.add(Cal, 1, 4);
        
        Cal.setOnAction(e -> {
            double result;
            result = Double.parseDouble(t1.getText())*Math.pow((1+Double.parseDouble(t3.getText())/100),Double.parseDouble(t2.getText()));
            text.setText(Double.toString(result));
        });
        
    
        Scene scene = new Scene(gridpane);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
