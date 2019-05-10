package m001;

public class Merchandise {
      private String ItamName;
      private double Price;

      public Merchandise(){
          
      }
      
    public Merchandise(String ItamName, double Price) {
        this.ItamName = ItamName;
        this.Price = Price;
    }

    public String getItamName() {
        return ItamName;
    }

    public double getPrice() {
        return Price;
    }

    public void setItamName(String ItamName) {
        this.ItamName = ItamName;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }
      
    
    
}



