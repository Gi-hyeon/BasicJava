package homework01;

public class Circle extends ShapeTest {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}
	
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * radius;
	}
	
	public String toString() {
		return "원, 둘레: " + perimeter() + "cm, 넓이: " + area() + "cm²"; 
	}
}
