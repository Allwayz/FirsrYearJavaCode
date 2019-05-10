package javaclasstest;

public class Book {
    private String bookname;
    private String outhor;
    private double price;
    
    
    public Book(){
        bookname = "";
        outhor = "";
        price = 0.0;
        
    }

    public String getBookname() {
        return bookname;
    }

    public String getOuthor() {
        return outhor;
    }

    public double getPrice() {
        return price;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public void setOuthor(String outhor) {
        this.outhor = outhor;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
    
    
}
