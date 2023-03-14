package homework03;

public class Circle extends Shape {
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
		return "원, 둘레: " + String.format("%.2f", perimeter()) + "cm, 넓이: " + String.format("%.2f", area()) + "cm²"; 
	}
}
