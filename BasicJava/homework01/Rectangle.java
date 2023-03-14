package homework01;

public class Rectangle extends ShapeTest {
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.width * this.height;
	}
	
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2 * (this.width + this.height);
	}
	
	public String toString() {
		return "사각형, 둘레: " + perimeter() + "cm, 넓이: " + area() + "cm²"; 
	}
}
