package com.bl.lc;

public class Line {
	Point p1;
	Point p2;
	 
	public float lineLength() {
    	return (float) Math.sqrt(Math.pow(p1.x-p2.x,2)+ Math.pow(p1.y-p2.y,2));
	}
}