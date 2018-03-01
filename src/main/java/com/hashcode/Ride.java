package com.hashcode;

public class Ride {
	private int id;

	private int earliestStart; // Earliest start
	private int latestFinish; // Latest finish
	
	private int startRow; // Row of start intersection
	private int startColumn; // Column of start intersection
	private int finishRow; // Row of finish intersection
	private int finishColumn; // Column of finish intersection

	private int distance;
	
	public Ride(int id, int startRow, int startColumn, int x, int y, int earliestStart, int latestFinish) {
		this.id=id;
		this.startRow = startRow;
		this.startColumn = startColumn;
		this.finishRow =x;
		this.finishColumn =y;
		this.earliestStart = earliestStart;
		this.latestFinish = latestFinish;
	}

	public void printRide() {
		System.out.print("Id: " + id + " [" + startRow + "," + startColumn + "] " + "[" + finishRow + "," + finishColumn + "] "+ earliestStart + " " + latestFinish + "\n");
	}
	
	
	public int getEarliestStart() {
		return earliestStart;
	}
	public void setEarliestStart(int earliestStart) {
		this.earliestStart = earliestStart;
	}
	public int getLatestFinish() {
		return latestFinish;
	}
	public void setLatestFinish(int latestFinish) {
		this.latestFinish = latestFinish;
	}
	public int getStartRow() {
		return startRow;
	}
	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}
	public int getStartColumn() {
		return startColumn;
	}
	public void setStartColumn(int startColumn) {
		this.startColumn = startColumn;
	}
	public int getFinishRow() {
		return finishRow;
	}
	public void setFinishRow(int finishRow) {
		this.finishRow = finishRow;
	}
	public int getFinishColumn() {
		return finishColumn;
	}
	public void setFinishColumn(int finishColumn) {
		this.finishColumn = finishColumn;
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
		return "Ride Id: " + id + " [" + startRow + "," + startColumn + "] " + "[" + finishRow + "," + finishColumn + "] "+ earliestStart + " " + latestFinish;
	}

	public Coordinate getFinalDestination() {
		return new Coordinate(finishRow, finishColumn);
	}

	public Coordinate getPasssengerDestination() {
		return new Coordinate(startRow, startColumn);
	}
}
