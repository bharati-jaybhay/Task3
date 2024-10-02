package Task3;

public class MainClass {
	 public static void main(String[] args) {
		 
	        // Creating an instance of Circle
		 
	        Circle circle = new Circle(5);
	        
	        System.out.println("Circle Area: " + circle.calculateArea());
	        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

	        // Creating an instance of Rectangle
	        Rectangle rectangle = new Rectangle(4, 7);
	        
	        System.out.println("Rectangle Area: " + rectangle.calculateArea());
	        
	        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

	        // Polymorphism in action
	        Shape shape;
	        shape = circle;
	        
	        System.out.println("Polymorphism - Circle Area: " + shape.calculateArea());

	        shape = rectangle;
	        System.out.println("Polymorphism - Rectangle Area: " + shape.calculateArea());
	    }

}
