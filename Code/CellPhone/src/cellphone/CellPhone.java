package cellphone;

import javafx.application.Application;
import javafx.event.EventType;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class CellPhone extends Application {
    Text FirstName;
    Text LastName;
    Text CellphoneNumber;
    TextField firstName; 
    TextField lastName;
    TextField cellPhone;
    HBox hbox1;
    Button Submit;
    HBox hbox2;
    Button Reset;
    @Override
    public void start(Stage primaryStage) {
        GridPane gridpane = new GridPane();
        
        FirstName = new Text();
        FirstName.setText("FirstName");
        FirstName.setFill(Color.BLACK);
        GridPane.setConstraints(FirstName, 0, 0);
        
        LastName = new Text();
        LastName.setText("LastName");
        LastName.setFill(Color.BLACK);
        GridPane.setConstraints(LastName, 0, 1);
        
        CellphoneNumber = new Text();
        CellphoneNumber.setText("CellphoneNumber");
        CellphoneNumber.setFill(Color.BLACK);
        GridPane.setConstraints(CellphoneNumber, 0, 2);
        
        firstName = new TextField(); 
        GridPane.setConstraints(firstName, 1, 0);
       
        lastName = new TextField();      
        GridPane.setConstraints(lastName,1 , 1);
        
        cellPhone = new TextField();
        GridPane.setConstraints(cellPhone, 1, 2);

        hbox1 = new HBox();
        GridPane.setConstraints(hbox1, 0, 3);
        Submit = new Button("Submit");
        hbox1.setAlignment(Pos.CENTER_RIGHT);
        hbox1.getChildren().add(Submit);
        
        
        hbox2 = new HBox();
        GridPane.setConstraints(hbox2, 1, 3);
        Reset = new Button("Reset");
        hbox2.setAlignment(Pos.CENTER_LEFT);
        hbox2.getChildren().add(Reset);
        Reset.addEventHandler(EventType.ROOT, null);
        
        
        
        
        
        gridpane.getChildren().add(FirstName);
        gridpane.getChildren().add(LastName);
        gridpane.getChildren().add(CellphoneNumber);
        gridpane.getChildren().add(firstName);
        gridpane.getChildren().add(lastName);
        gridpane.getChildren().add(cellPhone);
        gridpane.getChildren().add(hbox1);
        gridpane.getChildren().add(hbox2);
       
        
        Scene scene = new Scene(gridpane);
        primaryStage.setTitle("Quesyion 1");
        primaryStage.setScene(scene);
        primaryStage.show();

    
    }

    public static void main(String[] args) {
        launch(args);
        
    }
    
    
    
    
    
    
}
