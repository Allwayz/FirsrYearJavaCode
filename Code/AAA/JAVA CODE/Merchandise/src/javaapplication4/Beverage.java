package javaapplication4;

public class Beverage extends Merchandise {
    private double volume;
    
    public Beverage(){
        volume = 0.0;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }   
}
