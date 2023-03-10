package homework;

public class Circle {
	private double radius;
	private double x;
	private double y;
	
	void setRadius(double radius) {
		if(radius <= 0) {
			this.radius = 0;
			return;
		}else {
			this.radius = radius;
		}
	}
	
	void setX(double x) {
		this.x = x;
	}
	
	void setY(double y) {
		this.y = y;
	}
	
	double radius() {
		return radius;
	}
	
	double getRadius() {
		return radius;
	}
	
	double getX() {
		return x; 
	}
	
	double getY() {
		return y;
	}
	double getArea() {
		return Math.PI * radius * radius;
	}
}
