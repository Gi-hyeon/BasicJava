package homework01;

public class Triangle extends ShapeTest {
	private double side;
	
	public Triangle(double side) {
		this.side = side;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.sqrt(this.side * 3 / 2.0);
	}
	
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return side + side + side;
	}
	
	public String toString() {
		return "삼각형, 둘레: " + perimeter() + "cm, 넓이: " + area() + "cm²"; 
	}
}
