
package calculator;

import javafx.scene.control.Button;
import static jdk.nashorn.tools.ShellFunctions.input;

public class MyButton extends Button{
    public MyButton(String string){
        super(string);
        this.setOnAction(e -> {
            input.setText(string);
        });
        
    }
    
    
}
