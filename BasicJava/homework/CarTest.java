package homework;

public class CarTest {
	public static void main(String[] args) {
		Car car = new Car("red");
		System.out.println("myCar의 색: " + car.getColor());
		System.out.println("차의 최대 속력: " + car.getMaxSpeed());
		
		System.out.print("첫 번째 speedUp(100.0km/h): ");
		if(car.speedUp(100.0)) {
			System.out.print("속도 변경 가능,");
		} else {
			System.out.print("속도 변경 불가능,");
		}
		System.out.println(" 현재 차의 속력: " + car.getSpeed() + "km/h");
		
		System.out.print("두 번째 speedUp(90.0km/h): ");
		if(car.speedUp(90.0)) {
			System.out.print("속도 변경 가능,");
		} else {
			System.out.print("속도 변경 불가능,");
		}
		System.out.println(" 현재 차의 속력: " + car.getSpeed() + "km/h");
		
		Car yourCar = new Car("blue");
		System.out.println();
		System.out.println("myCar의 색: " + yourCar.getColor());
		System.out.println("차의 최대 속력: " + yourCar.getMaxSpeed());
		
		System.out.print("첫 번째 speedUp(-100.0km/h): ");
		if(yourCar.speedUp(-100.0)) {
			System.out.print("속도 변경 가능,");
		} else {
			System.out.print("속도 변경 불가능,");
		}
		System.out.println(" 현재 차의 속력: " + yourCar.getSpeed() + "km/h");
		
		System.out.print("두 번째 speedUp(210.0km/h): ");
		if(yourCar.speedUp(210.0)) {
			System.out.print("속도 변경 가능,");
		} else {
			System.out.print("속도 변경 불가능,");
		}
		System.out.println(" 현재 차의 속력: " + yourCar.getSpeed() + "km/h");
	}
}
