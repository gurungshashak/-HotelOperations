package com.pluralsight;

public class Reservation {
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean weekend;

    public Reservation(String roomType, double price, int numberOfNights, boolean weekend){
        this.roomType = roomType;
        this.price =0;
        this.numberOfNights = 0;
        this.weekend = weekend;
    }
    public String getRoomType() {
        return roomType;
    }
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice(String roomType) {
        if (roomType.equalsIgnoreCase("King")) {
            return price = 139.00;
        } else if (roomType.equalsIgnoreCase("double")) {
            return price = 124.00;
        } else if (roomType.equalsIgnoreCase("King") && weekend == true) {
            price = 139.00;
            return this.price;
        }else if (roomType.equalsIgnoreCase("double") && weekend == true) {
           price = 124.00;
            return this.price;
        }
        return price;

    }

    public int getNumberOfNights() {
        return numberOfNights;
    }
    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public double setWeekend(boolean weekend) {
        return (price * .1) + price;
    }

    public double reservationTotal(){
        return price * numberOfNights;
    }

}
