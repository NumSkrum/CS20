/*

Program: Circles.java          Last Date of this Revision: April 12, 2022

Purpose: Get radius and circumference of a circle
Author: Leo Lai, 
School: CHHS
Course: Computer Programming 20
 

*/
public class Circles {

	private static final double PI= 3.14;
	private double radius;
	
	
	public Circles() {
	radius = 1;	
	}
	//creates circle object
	
	public void setRadius(double newRadius) {
		radius = newRadius;
	}
	//radius has been changed.
	
	public double area() {
		double circleArea;
		
		circleArea = PI * radius * radius;
		return(circleArea);
	}
	//calculates Circle area
	
	public double getRadius() {
		return(radius);
	}
	//gets radius
	
	public double Circumference() {
		double Circumference;
		
		Circumference = 2 * PI * radius;
		return(Circumference);
	}
	//calculate circumference
	
	 public static void main (String[] args) {
		 Circles spot = new Circles();
		 
		 
		 spot.setRadius(3);
		 System.out.println("Circle Radius: " + spot.getRadius());
		 System.out.println("Circle Circumference: " + spot.Circumference());
	 }
	
}
/*
Circle Radius: 3.0
Circle Circumference: 18.84

 */
