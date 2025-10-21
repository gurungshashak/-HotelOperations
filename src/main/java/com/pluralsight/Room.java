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
    public boolean isOccupied() {
        return Occupied;
    }
    public boolean isDirty(){
        return Dirty;
    }

    public boolean isAvailable(){
     return (!this.Occupied && !this.Dirty);
    }

    public void isCheckOut(){
        this.Occupied = false;
    }

    public void  isCheckIn(){

        this.Occupied = true;
        this.Dirty = true;
    }

    public void isClean(){
        this.Dirty = false;
    }
}
