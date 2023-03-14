package sec06.exam03.package2;

class Car{
	private int speed;
	private boolean stop;
	
	int getSpeed() {
		return speed;
	}
	
	void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}
	
	boolean isStop() {
		return stop;
	}
	
	void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
	
}

public class BoardExample {
	public static void main(String[] args) {
		Car car = new Car();
		
		car.setSpeed(-50);
		
		System.out.println("현재 속도: " + car.getSpeed());
		
		car.setSpeed(50);
		
		System.out.println("현재 속도: " + car.getSpeed());
		
		System.out.println(car.isStop());
		if(!car.isStop()) {
			car.setStop(true);
		}
		
		System.out.println("현재 속도: " + car.getSpeed());
	}
}
