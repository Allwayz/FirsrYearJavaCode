package combobox;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Combobox extends Application {
    private String[] fruitname = {"Apple","Orange","Lemon"};
            
    private ImageView[] fruitImage = {
        new ImageView("Image/Apple.jpg"),
        new ImageView("Image/Orange.jpg"),
        new ImageView("Image/Lemon.jpg")
            };
    private DescriptionPane descriptionPane = new DescriptionPane();
    
    private ComboBox<String>cbo = new ComboBox<>();
    
    @Override
    public void start(Stage primaryStage) {
       setDisplay(0);
        
        setDisplay(0);

    BorderPane pane = new BorderPane();
      
    BorderPane paneForComboBox = new BorderPane();
    paneForComboBox.setLeft(new Label("Select a fruit: "));
    paneForComboBox.setCenter(cbo);
    pane.setTop(paneForComboBox);
    cbo.setPrefWidth(400);
    cbo.setValue("Apple");
    
    ObservableList<String> items = 
      FXCollections.observableArrayList(fruitname);
    cbo.getItems().addAll(items); 
    pane.setCenter(descriptionPane);
    cbo.setOnAction(e -> setDisplay(items.indexOf(cbo.getValue())));
    
        
        
        
        
        
        Scene scene = new Scene(pane, 450, 450);
        primaryStage.setTitle("ComboBox");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    
    
    public void setDisplay(int index) {
    descriptionPane.setTitle(fruitname[index]);
    descriptionPane.setImageView(fruitImage[index]);
    //descriptionPane.setDescription(flagDescription[index]);
  }
    
    
    
    

    public static void main(String[] args) {
        launch(args);
    }
    
}
