package com.hashcode;

import java.util.List;

public class Scheduler {

    public static void schedule(final String filepath) {
        final Input input = Parse.parseInput(filepath);


        if (input != null) {



        }
    }

    private List<Vehicle> createVehicles(Input input) {
        for (int i = 0; i < input.n_rides; i++) {
            new Vehicle();
        }
    }

}
