package com.hashcode;

public class Ride {
	private int id;

	private int s; // Earliest start
	private int f; // Latest finish
	
	private int a; // Row of start intersection
	private int b; // Column of start intersection
	private int x; // Row of finish intersection
	private int y; // Column of finish intersection

	private int distance;
	
	public Ride(int id, int a,int b,int x,int y, int s,int f) {
		this.id=id;
		this.a=a;
		this.b=b;
		this.x=x;
		this.y=y;
		this.s=s;
		this.f=f;
	}

	public void printRide() {
		System.out.print("[" + a + "," + b + "] " + "[" + x + "," + y + "] "+ s + " " + f + "\n");
	}
	
	
	public int getS() {
		return s;
	}
	public void setS(int s) {
		this.s = s;
	}
	public int getF() {
		return f;
	}
	public void setF(int f) {
		this.f = f;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getDistance() {
		return distance;
	}


	public void setDistance(int distance) {
		this.distance = distance;
	}


	@Override
	public String toString() {
		return "Ride [a=" + a + ", b=" + b + ", x=" + x + ", y=" + y + ", s=" + s + ", f=" + f + "]";
	}
}
