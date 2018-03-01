package entities;

public class Ride {
	
//			start intersection: [1, 2]
//			 finish intersection: [1, 4]
//			 earliest start: 5
//			 latest finish: 8
	
	
	private int s;
	private int f;
	
	private int a;
	private int b;
	private int x;
	private int y;
	
	public Ride(int a,int b,int x,int y, int s,int f) {
		this.a=a;
		this.b=b;
		this.x=x;
		this.y=y;
		this.s=s;
		this.f=f;
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
