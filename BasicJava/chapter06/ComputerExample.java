package chapter06;
class Car255{
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("가스가 없습니다.");
			return false;
		} else {
			System.out.println("가스가 있습니다.");
			return true;
		}
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.printf("달립니다.(gas잔량 : %d)", gas);
				gas -= 1;
			} else {
				System.out.printf("멈춥니다.(gas잔량 : %d)", gas);
				return;
			}
		}
	}
}

public class ComputerExample {
	public static void main(String[] args) {
		Car255 car = new Car255();
		
		car.setGas(0);
//		System.out.println(car.gas);
		
		Boolean gasState = car.isLeftGas();
		
		if(gasState) {
			System.out.println("출발합니다.");
			car.run();
		}
		
		if(car.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없다.");
		} else {
			System.out.println("gas를 주입 필요");
		}
	}
}
