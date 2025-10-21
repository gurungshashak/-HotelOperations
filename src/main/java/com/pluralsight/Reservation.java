package com.pluralsight;

public class Reservation {
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean weekend;

    public Reservation(String roomType, double price, int numberOfNights, boolean weekend){
        this.roomType = roomType;
        if(roomType.toLowerCase().equals("King")){
            this.price = 139.00;
        }else{
            this.price = 124.00;
        }
        this.price = price;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }
    public String getRoomType() {
        return roomType;
    }
    public void setRoomType(String roomType) {
        this.roomType = roomType;
        if(roomType.toLowerCase().equals("King")){
            this.price = 139.00;
        }else{
            this.price = 124.00;
        }
    }

    public double getPrice() {
        return price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }
    public void setNumberOfNights() {
        this.numberOfNights = numberOfNights;
    }

    public void setWeekend() {
        this.weekend = weekend;
    }

    public double reservationTotal(){
       double priceUp = this.price;
       if(weekend){
           priceUp = priceUp*1.1;
       }
        return price * numberOfNights;
    }
}
