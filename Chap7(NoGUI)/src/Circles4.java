public class Circles4 {

	private static final double PI= 3.14;
	private double radius;
	
	public Circles4() {
	radius = 1;	
	}
	
	public Circles4(double r) {
		radius = r;
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
	public static void displayAreaFormula() {
		System.out.println("The formula for the area of a circle is a=Pi*r*r");
	}
	
	 public static void main (String[] args) {
		 Circles spot = new Circles();
		 
		 
		 spot.setRadius(3);
		 System.out.println("Circle Radius: " + spot.getRadius());
		 System.out.println("Circle Circumference: " + spot.Circumference());
		 Circles3.displayAreaFormula();
	 }
	
}

