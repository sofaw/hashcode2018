package com.hashcode;

import java.util.ArrayList;
import java.util.List;

public class Scheduler {

    private static List<Vehicle> vehicles;
    private static List<Ride> rides;


    public static void schedule(final String filepath) {
        final Input input = Parse.parseInput(filepath);


        if (input != null) {
            vehicles = createVehicles(input);
            rides = input.rides;
        }
    }

    private static List<Vehicle> createVehicles(Input input) {
        final ArrayList<Vehicle> vehicles = new ArrayList<>();
        for (int i = 0; i < input.n_rides; i++) {
            vehicles.add(new Vehicle(i));
        }
        return vehicles;
    }




}
