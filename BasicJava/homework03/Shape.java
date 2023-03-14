package homework03;

public abstract class Shape implements Comparable<Shape>{ //<비교할 문자 같은 값>
	public double area;
	public double perimeter;
	
	public abstract double area();
	public abstract double perimeter();
	
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getPerimeter() {
		return perimeter;
	}
	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
	
	@Override
	public int compareTo(Shape o) {
		if(area() > o.area()) {
			return 1;
		} else if( area() == o.area()) {
			return 0;
		} else {
			return -1;
		}
		
//		내림차순
//		if(area() > o.area()) {
//			return -1;
//		} else if( area() == o.area()) {
//			return 0;
//		} else {
//			return 1;
//		}
		
		
		
//		편한 방법
//		return Double.compare(area(), o.area());
	}
}
