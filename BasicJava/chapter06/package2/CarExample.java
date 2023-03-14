package chapter06.package2;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		
		System.out.println("현재 속도: " + car.getSpeed());
		
		car.setSpeed(50);
		
		System.out.println("현재 속도: " + car.getSpeed());
		if(!car.isStop()) {
			car.setStop(true);
		}
		
		System.out.println("현재 속도: " + car.getSpeed());
	}
}
