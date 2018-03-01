package com.hashcode;

import java.util.*;
import java.util.stream.Collectors;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Objects;
import java.util.concurrent.DelayQueue;

public class Vehicle {
    int id;
    Deque<Ride> rides;

    // Patrick's stuff
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

    public Deque<Ride> getRides() {
        return rides;
    }

    public void setRides(final Deque<Ride> rides) {
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

    public void step(final List<Ride> rides) {
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
                } else if (current_location.getColumn() == currentRide.getFinishColumn() && current_location.getRow() == currentRide.getFinishRow()) {
                    passengersRiding = false;
                    if (rides.size() > 0) {
                        final Ride newRide = getNearestRide(rides);
                        this.rides.add(newRide);
                        currentRide = newRide;
                    } else {
                        currentRide = null;
                    }
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
                } else if (current_location.getColumn() == currentRide.getStartColumn() && current_location.getRow() == currentRide.getStartRow()) {
                    passengersRiding = true;
                }
            }

        }
    }

    private Coordinate distanceTo(final Coordinate coordinate) {
        final int rowsLeft = coordinate.getRow() - current_location.getRow();
        final int colsLeft = coordinate.getColumn() - current_location.getColumn();
        return new Coordinate(rowsLeft, colsLeft);
    }

    public Ride getNearestRide(List<Ride> rides) {
        Ride closest = null;
        int dist = 100000;
        int i = 0;
        for (int j = 0; j < rides.size(); j++) {
            final Ride ride = rides.get(j);
            final Coordinate coordinate = this.distanceTo(ride.getPasssengerDestination());
            final int tot = coordinate.getColumn() + coordinate.getRow();

            if (tot < dist) {
                closest = ride;
                dist = tot;
                i = j;
            }
        }

        rides.remove(i);

        return closest;
    }


}
