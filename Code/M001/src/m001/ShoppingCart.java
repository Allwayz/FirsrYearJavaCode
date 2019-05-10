package m001;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList <Merchandise> items;
    
public ShoppingCart(){
    items = new ArrayList<>();
}    

public void addItems(Merchandise x){
    items.add(x);
}

public int totalItemsInCart(){
    return items.size();
}

public double totalPrice(){
    double sum = 0.0;
    for (int i = items.size() - 1; i >= 0; i--){
    sum += items.get(i).getPrice();
    System.out.println(items.get(i).getItamName()+"--------"+items.get(i).getPrice()+"$");
    }
    return sum;
}


public void printReceipt(){
    System.out.println("Total Item Number is :" + items.size());
    System.out.println("-------------------------");
    System.out.println("Total Price is :" + totalPrice()+"$");
}
    
    
}
