package com.hashcode;

import com.sun.javafx.collections.ImmutableObservableList;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ExecutionTest {

    @Test
    public void runa(){
        Scheduler.schedule("src/main/resources/a_example.in", "A");
    }


    @Test
    public void runb(){
        Scheduler.schedule("src/main/resources/b_should_be_easy.in", "B");
    }


    @Test
    public void runc(){
        Scheduler.schedule("src/main/resources/c_no_hurry.in", "C");
    }

    @Test
    public void rund() {
        Scheduler.schedule("src/main/resources/d_metropolis.in", "D");
    }

    @Test
    public void rune() {
        Scheduler.schedule("src/main/resources/e_high_bonus.in", "E");
    }

    @Test
    public void testOutput() {

        final Vehicle vehicle1 = new Vehicle(1);
        final Vehicle vehicle2 = new Vehicle(2);

        vehicle1.addRide(new Ride(0, 1, 2, 3, 4, 5, 0));
        vehicle1.addRide(new Ride(1, 1, 2, 3, 4, 5, 0));
        vehicle1.addRide(new Ride(2, 1, 2, 3, 4, 5, 0));
        vehicle1.addRide(new Ride(5, 1, 2, 3, 4, 5, 0));

        vehicle2.addRide(new Ride(3, 1, 2, 3, 4, 5, 0));
        vehicle2.addRide(new Ride(4, 1, 2, 3, 4, 5, 0));
        final ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(vehicle1);
        vehicles.add(vehicle2);
        Scheduler.output(vehicles, "whatever");

    }

}

