package com.pluralsight;

public class Hotel {
    private String name;
    private int numberOfSuites, numberOfRooms, bookedSuites, bookedBasicRooms;

    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public String getName() {
        return name;
    }
    public int getNumberOfSuites() {
        return numberOfSuites;
    }
    public int getNumberOfRooms() {
        return numberOfRooms;
    }
    public int getBookedSuites() {
        return bookedSuites;
    }
    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }


    public int getAvailableRooms() {
        return this.numberOfRooms - this.bookedBasicRooms;
    }

    public int getAvailableSuites() {
        return this.numberOfSuites - this.bookedSuites;
    }


    public boolean isBookedRoom(int numberOfRooms, boolean isSuite) {
        if (isSuite) {
            if (numberOfRooms <= getAvailableSuites()) {
                this.bookedSuites += numberOfRooms;
                return true;
            } else {
                if (numberOfSuites <= getAvailableRooms()) {
                    this.bookedSuites += numberOfRooms;
                    return true;
                }
            }
        }
        return false;
    }
}
