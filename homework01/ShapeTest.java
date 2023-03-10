package homework01;

public class ShapeTest {
	public static void main(String[] args) {
		ShapeTest[] shapes = new ShapeTest[3];
		shapes[0] = new Circle(1.0);
		shapes[1] = new Triangle(2.0);
		shapes[2] = new Rectangle(2.0, 3.0);
		for(ShapeTest shape : shapes) {
			System.out.println(shape);
		}
	}
	public double area(){
		return 0.0;
	}
	public double perimeter() {
		return 0.0;
	}
}
