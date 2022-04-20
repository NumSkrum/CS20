
public class Circles {

	private static final double PI= 3.14;
	private double radius;
	
	public Circles() {
	radius = 1;	
	}
	
	public void setRadius(double newRadius) {
		radius = newRadius;
	}
		
	public double area() {
		double circleArea;
		
		circleArea = PI * radius * radius;
		return(circleArea);
	}
		
	public double getRadius() {
		return(radius);
	}
		
	public double Circumference() {
		double Circumference;
		
		Circumference = 2 * PI * radius;
		return(Circumference);
	}
	
	
	 public static void main (String[] args) {
		 Circles spot = new Circles();
		 
		 
		 spot.setRadius(3);
		 System.out.println("Circle Radius: " + spot.getRadius());
		 System.out.println("Circle Circumference: " + spot.Circumference());
	 }
	
}

