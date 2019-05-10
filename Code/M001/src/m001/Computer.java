package m001;


public class Computer extends Merchandise {
    private String CPU;
    
    public Computer(){
        super();
    }
    
    public Computer (String CPU, String itemName, double price) {
        this.CPU = CPU;
        this.setItamName(itemName);
        this.setPrice(price);
        
    }
    
    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }
    
    
}
