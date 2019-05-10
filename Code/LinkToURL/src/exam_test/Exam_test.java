package exam_test;

import java.net.URL;
import java.util.Scanner;

public class Exam_test {

    public static void main(String[] args) {
        try {
            URL url = new URL("http://192.168.50.53:8080/ABC/HHH.txt");
            Scanner input = new Scanner (url.openStream());
            String line = "";
            while (input.hasNext()){
                line += input.nextLine();
            }
            System.out.println(line);
        }
        catch (Exception ex){
            System.out.println("Invalid URL");
        }
               
    }   
}
    

