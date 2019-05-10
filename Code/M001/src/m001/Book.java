
package m001;


public class Book extends Merchandise {
    int Pages;
    
    
    public Book (){
        super();
    }
    public Book (int pages, String itemName, double price) {
        this.Pages = pages;
        this.setItamName(itemName);
        this.setPrice(price);
        
    }
    


    public int getPages() {
        return Pages;
    }

    public void setPages(int Pages) {
        this.Pages = Pages;
    }

    
}
