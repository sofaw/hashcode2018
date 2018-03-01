package com.hashcode;

public class Ride {
	private int s; // Earliest start
	private int f; // Latest finish
	
	private int a; // Row of start intersection
	private int b; // Column of start intersection
	private int x; // Row of finish intersection
	private int y; // Column of finish intersection
	
	public Ride(int a,int b,int x,int y, int s,int f) {
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
}
