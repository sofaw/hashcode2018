package com.hashcode;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Parse {

    public static Input parseInput(String filepath) {
        int R, C, F, N, B;
        long T;
        List<Ride> rides = new ArrayList<Ride>();
        try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
            String line;
            int count = 0;
            line = br.readLine();
            String[] values = line.split(" ");
            R = Integer.parseInt(values[0]);
            C = Integer.parseInt(values[1]);
            F = Integer.parseInt(values[2]);
            N = Integer.parseInt(values[3]);
            B = Integer.parseInt(values[4]);
            T = Long.parseLong(values[5]);
            for (int i = 0; i <= N - 1; i++) {
                line = br.readLine();
                String[] values2 = line.split(" ");
                Ride ride = new Ride(Integer.parseInt(values2[0]), Integer.parseInt(values2[1]), Integer.parseInt(values2[2]), Integer.parseInt(values2[3]), Integer.parseInt(values2[4]), Integer.parseInt(values2[5]));
                rides.add(ride);
                System.out.println(rides.get(i));
            }
            return new Input(R, C, F, N, B, T);

        } catch (FileNotFoundException e) {
            System.out.println("No such file: ");
            System.exit(-1);
        } catch (IOException e) {
            System.out.println("Exception thrown: Invalid input file.");
            System.exit(-1);
        }
        return null;
    }

    public static void parse(String filepath) {
        int R, C, F, N, B;
        long T;
        List<Ride> rides = new ArrayList<Ride>();
        try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
            String line;
            int count = 0;
            line = br.readLine();
            String[] values = line.split(" ");
            R = Integer.parseInt(values[0]);
            C = Integer.parseInt(values[1]);
            F = Integer.parseInt(values[2]);
            N = Integer.parseInt(values[3]);
            B = Integer.parseInt(values[4]);
            T = Long.parseLong(values[5]);
            for (int i = 0; i <= N - 1; i++) {
                line = br.readLine();
                String[] values2 = line.split(" ");
                Ride ride = new Ride(i, Integer.parseInt(values2[0]), Integer.parseInt(values2[1]), Integer.parseInt(values2[2]), Integer.parseInt(values2[3]), Integer.parseInt(values2[4]), Integer.parseInt(values2[5]));
                rides.add(ride);
                rides.get(i).printRide();
            }


        } catch (FileNotFoundException e) {
            System.out.println("No such file: ");
            System.exit(-1);
        } catch (IOException e) {
            System.out.println("Exception thrown: Invalid input file.");
            System.exit(-1);
        }
    }
}
