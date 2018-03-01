package com.hashcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.Queue;

public class Vehicle {
    int id;
    Queue<Ride> rides;
    Ride currentRide;
    boolean passengersRiding;
    Coordinate current_location;

    public Vehicle(final int id) {
        this.id = id;
        rides = new LinkedList<>();
        current_location = new Coordinate(0,0);
        passengersRiding = false;
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
        currentRide = ride;
    }

    public void arrived(){
        currentRide = null;
    }

    public void step(final Queue<Ride> rides) {
        if (!Objects.isNull(currentRide)) {
            if (passengersRiding) {
                //on the way to final destination
                final Coordinate diff = distanceTo(currentRide.getFinalDestination());
                if (diff.getRow() == 0 && diff.getColumn() !=0) {
                    //go left or right
                    current_location.setColumn(diff.getColumn() < 0 ? current_location.getColumn() - 1 : current_location.getColumn() + 1);
                } else if (diff.getColumn() != 0) {
                    //go up or down
                    current_location.setRow(diff.getRow() < 0 ? current_location.getRow() - 1 : current_location.getRow() + 1);
                } else if (current_location.equals(currentRide.getFinalDestination())) {
                    currentRide = null;
                    passengersRiding = false;
                    //get new ride
                }
            } else {
                //picking up passenger
                //on the way to final destination
                final Coordinate diff = distanceTo(currentRide.getPasssengerDestination());
                if (diff.getRow() == 0 && diff.getColumn() !=0) {
                    //go left or right
                    current_location.setColumn(diff.getColumn() < 0 ? current_location.getColumn() - 1 : current_location.getColumn() + 1);
                } else if (diff.getColumn() != 0) {
                    //go up or down
                    current_location.setRow(diff.getRow() < 0 ? current_location.getRow() - 1 : current_location.getRow() + 1);
                } else if (current_location.equals(currentRide.getPasssengerDestination())) {
                    passengersRiding = false;
                    currentRide = rides.remove();
                    this.rides.add(currentRide);
                }
            }

        }
    }

    private Coordinate distanceTo(final Coordinate coordinate) {
        final int rowsLeft = coordinate.getRow() - current_location.getRow();
        final int colsLeft = coordinate.getColumn() - current_location.getColumn();
        return new Coordinate(rowsLeft, colsLeft);
    }


}
