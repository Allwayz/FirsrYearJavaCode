package javaapplication4;

public class Clothes extends Merchandise {
    private char size;
    public Clothes(){
        size = 's';
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }
    
}
