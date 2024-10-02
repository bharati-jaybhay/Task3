package Task3;

public class Circle extends Shape{

	private double radius; // Encapsulated variable
	
	 public Circle(double radius) {
	        this.radius = radius;
	    }
	 
	 public double getRadius() {
	        return radius;
	    }

	    public void setRadius(double radius) {
	        this.radius = radius;
	    }

	    // Implementing the abstract method (Polymorphism)
	    @Override
	    public double calculateArea() {
	        return Math.PI * radius * radius;
	    }

	    @Override
	    public double calculatePerimeter() {
	        return 2 * Math.PI * radius;
	    }
}
