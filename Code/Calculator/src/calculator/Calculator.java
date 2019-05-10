package calculator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Calculator extends Application {
    Button x1;
    Button x2;
    Button x3;
    Button x4;
    Button x5;
    Button x6;
    Button x7;
    Button x8;
    Button x9;
    Button x0;
    Button Plus;
    Button Minus;
    Button Multi;
    Button Divide;
    Text input;
    
    
    
    
    @Override
    public void start(Stage primaryStage) {
        
       MyButton r1 = new MyButton();
       
        
        
        x1 = new Button("1");
        x1.setOnAction(e -> {
            input.setText("1");
        });
        GridPane.setConstraints(x1, 0, 2);
        
         x2 = new Button("2");
         x2.setOnAction(e -> {
            input.setText("2");
        });
        GridPane.setConstraints(x2,1, 2);
        
         x3 = new Button("3");
         x3.setOnAction(e -> {
            input.setText("3");
        });
        GridPane.setConstraints(x3, 2, 2);
        
         x4 = new Button("4");
         x4.setOnAction(e -> {
            input.setText("4");
        });
        GridPane.setConstraints(x4, 0, 1);
        
         x5 = new Button("5");
         x5.setOnAction(e -> {
            input.setText("5");
        });
        GridPane.setConstraints(x5, 1, 1);
        
         x6 = new Button("6");
         x6.setOnAction(e -> {
            input.setText("6");
        });
        GridPane.setConstraints(x6, 2, 1);
        
         x7 = new Button("7");
         x7.setOnAction(e -> {
            input.setText("7");
        });
        GridPane.setConstraints(x7, 0, 0);
        
         x8 = new Button("8");
         x8.setOnAction(e -> {
            input.setText("8");
        });
        GridPane.setConstraints(x8, 1, 0);
        
         x9 = new Button("9");
         x9.setOnAction(e -> {
            input.setText("9");
        });
        GridPane.setConstraints(x9, 2, 0);
        
         x0 = new Button("0");
         x0.setOnAction(e -> {
            input.setText("0");
        });
         x0.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        GridPane.setConstraints(x0, 0, 3, 3,1);
        
        Plus = new Button("+");
        Plus.setOnAction(e -> {
            input.setText("+");
        });
        GridPane.setConstraints(Plus, 3, 0);
        
        Minus = new Button("-");
        Minus.setOnAction(e -> {
            input.setText("-");
        });
        GridPane.setConstraints(Minus, 3, 1);
        
        Multi = new Button("*");
        Multi.setOnAction(e -> {
            input.setText("*");
        });
        GridPane.setConstraints(Multi, 3, 2);
        
        Divide = new Button("/");
        Divide.setOnAction(e -> {
            input.setText("/");
        });
        GridPane.setConstraints(Divide, 3, 3);
        
        input = new Text();
        GridPane.setConstraints(input, 0, 4);

        input.setOnKeyPressed(e -> {          
      switch (e.getText()) {
          case "1": input.setText("1");break;
          case "2": input.setText("2");break;
          case "3": input.setText("3");break;
          case "4": input.setText("4");break;
          case "5": input.setText("5");break;
          case "7": input.setText("6");break;
          case "8": input.setText("8");break;
          case "9": input.setText("9");break;
          case "0": input.setText("0");break;
        
      }
    });
        
        
        GridPane gridpane;
        gridpane = new GridPane();
        
        gridpane.getChildren().add(x0);
        gridpane.getChildren().add(x1);
        gridpane.getChildren().add(x2);
        gridpane.getChildren().add(x3);
        gridpane.getChildren().add(x4);
        gridpane.getChildren().add(x5);
        gridpane.getChildren().add(x6);
        gridpane.getChildren().add(x7);
        gridpane.getChildren().add(x8);
        gridpane.getChildren().add(x9);
        gridpane.getChildren().add(Plus);
        gridpane.getChildren().add(Minus);
        gridpane.getChildren().add(Multi);
        gridpane.getChildren().add(Divide);
        gridpane.getChildren().add(input);
        Scene scene = new Scene(gridpane);
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }   
}
