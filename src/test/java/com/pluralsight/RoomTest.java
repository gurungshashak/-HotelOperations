package com.pluralsight;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    //How many tests should you write?
    //Should you be able to check in a room, if it is already occupied?
    //What if it is dirty?
    //Should housekeeping be able to clean the room if it is occupied?
    Room roomTest = new Room(1,100,false,false);

    @org.junit.jupiter.api.Test
    void isCheckIn_is_() {
       //checking if the room is available
        roomTest.isCheckIn();

        assertTrue(roomTest.isDirty());
        assertTrue(roomTest.isOccupied());
    }

    @org.junit.jupiter.api.Test
    void isCheckOut_is_() {
        //checking if the person has checked out
        roomTest.isCheckIn();
        roomTest.isCheckOut();

        assertFalse(roomTest.isOccupied());
        assertTrue(roomTest.isDirty());
    }

    void isOccupied() {
        //seeing is the room is occupied or not
        roomTest.isCheckIn();

        assertTrue(roomTest.isOccupied());
    }

    void isdirty() {
        //checking to see if the room is dirty or not
        roomTest.isCheckIn();

        assertTrue(roomTest.isDirty());
    }

    void isclean() {
        //checking to see if room is clean or not
        roomTest.isCheckIn();
        roomTest.isCheckOut();
        roomTest.isClean();

        assertTrue(roomTest.isDirty());
    }
}