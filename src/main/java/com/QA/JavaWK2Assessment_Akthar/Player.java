package com.QA.JavaWK2Assessment_Akthar;

public class Player {
	
	private int positionX = 0;
	private int positionY = 0;
	
	
	public void moveNorth() {
		this.positionY++;
	}
	
	public void moveSouth() {
		this.positionY--;
	}
	
	public void moveEast() {
		this.positionX++;
	}
	
	public void moveWest() {
		this.positionX--;
	}
	
	public int getPositionX() {
		return positionX;
	}
	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}
	public int getPositionY() {
		return positionY;
	}
	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}

}
