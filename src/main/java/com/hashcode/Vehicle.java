package com.hashcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Vehicle {
    int id;
    Queue<Ride> rides;
    Coordinate current_location;

    public Vehicle(final int id) {
        this.id = id;
        rides = new LinkedList<>();
        current_location = new Coordinate(0,0);
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public Queue<Ride> getRides() {
        return rides;
    }

    public void setRides(final Queue<Ride> rides) {
        this.rides = rides;
    }

    public Coordinate getCurrent_location() {
        return current_location;
    }

    public void setCurrent_location(final Coordinate current_location) {
        this.current_location = current_location;
    }

    public void addRide(Ride ride) {
        rides.add(ride);
    }
}
