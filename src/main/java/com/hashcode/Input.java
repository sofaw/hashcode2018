package com.hashcode;

public class Input {
    int rows, columns, n_vehicles, n_rides, bonus;
    long T;

    public Input(final int rows, final int c, final int nvehicles, final int n, final int b, final long t) {
        this.rows = rows;
        columns = c;
        n_vehicles = nvehicles;
        n_rides = n;
        bonus = b;
        T = t;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(final int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(final int columns) {
        this.columns = columns;
    }

    public int getN_vehicles() {
        return n_vehicles;
    }

    public void setN_vehicles(final int n_vehicles) {
        this.n_vehicles = n_vehicles;
    }

    public int getN_rides() {
        return n_rides;
    }

    public void setN_rides(final int n_rides) {
        this.n_rides = n_rides;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(final int bonus) {
        this.bonus = bonus;
    }

    public long getT() {
        return T;
    }

    public void setT(final long t) {
        T = t;
    }
}
