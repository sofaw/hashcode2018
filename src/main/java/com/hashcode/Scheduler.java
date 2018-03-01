package com.hashcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Scheduler {

    private static List<Vehicle> vehicles;
    private static Queue<Ride> rides;

    public static void schedule(final String filepath) {
        final Input input = Parse.parseInput(filepath);
        if (input != null) {
            vehicles = createVehicles(input);
            //TODO sort rides here! and populate queue
        }

        //assign first rides to cars
        vehicles.forEach(v -> v.addRide(getNextRide()));

        //for loop
        for (int i = 0; i < input.T; i++) {

        }

        //TODO output
        output(vehicles);

    }

    private static Ride getNextRide() {
        //get next item in queue
        return rides.remove();
    }

    private static void output(final List<Vehicle> vehicles) {

    }

    private static List<Vehicle> createVehicles(Input input) {
        final ArrayList<Vehicle> vehicles = new ArrayList<>();
        for (int i = 0; i < input.n_rides; i++) {
            vehicles.add(new Vehicle(i + 1));
        }
        return vehicles;
    }




}
