package com.hashcode;

import javafx.util.Pair;

import java.util.List;
import java.util.Queue;

public class Vehicle {
    int id;
    Queue<Ride> rides;
    Pair<Integer, Integer> currentLocation;

    public Vehicle() {
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

    public Pair<Integer, Integer> getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(final Pair<Integer, Integer> currentLocation) {
        this.currentLocation = currentLocation;
    }
}
