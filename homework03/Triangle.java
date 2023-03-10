package homework03;

public class Triangle extends Shape {
	private double side;
	
	public Triangle(double side) {
		this.side = side;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.sqrt(3) / 4 * side * side;
	}
	
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return side + side + side;
	}
	
	public String toString() {
		return "삼각형, 둘레: " + String.format("%.2f", perimeter()) + "cm, 넓이: " + String.format("%.2f", area()) + "cm²"; 
	}
}
