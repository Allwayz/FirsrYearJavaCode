package m001;


import java.util.ArrayList;
import java.util.Scanner;


public class JavaClass {     
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ShoppingCart list = new ShoppingCart();
        list.addItems(new Cloths('M',"NIKE",60));
        list.addItems(new Computer("i7-8700k","Dell",1699));
        list.addItems(new Book(1000,"Java",88));
        list.printReceipt();
        
        
        
        
    }
}
        
    

