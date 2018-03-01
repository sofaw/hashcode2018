package com.hashcode;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.util.stream.Collectors;

public class Scheduler {

    private static List<Vehicle> vehicles;
    private static Queue<Ride> rides;

    public static void schedule(final String filepath, final String outputName) {
        final Input input = Parse.parseInput(filepath);
        if (input != null) {
            vehicles = createVehicles(input);
            // Sort by earliest start time
            rides = new LinkedList<>(sortByStartTime(input.getRides()));
            for(Ride ride : rides) {
                System.out.println(ride);
            }
        }

        //assign first rides to cars
        vehicles.forEach(v -> v.addRide(getNextRide()));

        //for loop
        for (int i = 0; i < input.T; i++) {

        }

        //TODO output
        output(vehicles, outputName);

    }

    private static Ride getNextRide() {
        //get next item in queue
        return rides.remove();
    }

    public static void output(final List<Vehicle> vehicles, String name) {
        try {
            PrintWriter out = new PrintWriter(new FileWriter("output_" + name + ".out"));
            for (final Vehicle vehicle : vehicles) {

                final StringBuilder builder = new StringBuilder().append(vehicle.rides.size());
                vehicle.getRides().forEach(ride-> builder.append(" ").append(ride.getId()));
                out.println(builder.toString());
            }
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<Vehicle> createVehicles(Input input) {
        final ArrayList<Vehicle> vehicles = new ArrayList<>();
        for (int i = 0; i < input.n_rides; i++) {
            vehicles.add(new Vehicle(i + 1));
        }
        return vehicles;
    }

    private static List<Ride> sortByStartTime(List<Ride> inRides) {
        return inRides.stream().sorted(Comparator.comparing(Ride::getS)).collect(Collectors.toList());
    }


}
