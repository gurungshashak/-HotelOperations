package com.pluralsight;

public class Room {
    private int numberOFBeds;
    private double price;
    private boolean Occupied;
    private boolean Dirty;

    public Room(int numberOFBeds, double price, boolean Occupied, boolean Dirty) {
        this.numberOFBeds = numberOFBeds;
        this.price = price;
        this.Occupied = Occupied;
        this.Dirty = Dirty;
    }

    public int getNumberOFBeds() {
        return numberOFBeds;
    }
    public double getPrice() {
        return price;
    }
    public boolean isOccupied(boolean Occupied) {
        return Occupied;
    }
    public boolean isDirty(boolean Dirty){
        return Dirty;
    }

    public boolean isAvailable(){
        if(!Occupied && !Dirty){
            return true;
        }else
            return false;
    }
}
