package m001;

public class Cloths extends Merchandise {
    char size;
    
    public Cloths(){
        super();
    }
    public Cloths (char size, String itemName, double price) {
        this.size = size;
        this.setItamName(itemName);
        this.setPrice(price);
        
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }
    
    
}    