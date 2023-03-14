package lifecoding;

class Tire{
	public int maxRotation;
	public int accumulatedRotation;
	public String location;
	
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll() {
		++accumulatedRotation;   //일회용인데 왜 놓을까..?
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " Tire 수명: " + (maxRotation-accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
	}
}

class Car{
	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backtLeftTire = new Tire("뒤오른쪽", 4);
	
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if(frontLeftTire.roll() == false) {
			stop();
			return 1;
		}
		if(frontLeftTire.roll() == false) {
			stop();
			return 2;
		}
		if(frontLeftTire.roll() == false) {
			stop();
			return 3;
		}
		if(frontLeftTire.roll() == false) {
			stop();
			return 4;
		}
		return 0;
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}

class HanKookTire extends Tire{
	public HanKookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " Tire 수명: " + (maxRotation-accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " HanKookTire Tire 펑크 ***");
			return false;
		}
	}
}

class KumhoTire extends Tire{
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " Tire 수명: " + (maxRotation-accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " KumhoTire Tire 펑크 ***");
			return false;
		}
	}
}

public class Practice343 {
	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=0; i<=100; i++) {
			int problemLocaton = car.run();
			
			switch (problemLocaton) {
			case 1:
				System.out.println("앞왼쪽 HanKookTire로 교체");
				car.frontLeftTire = new HanKookTire("앞왼쪽", 15);
				break;
			case 2:
				System.out.println("앞오른쪽 KumhoTire로 교체");
				car.frontLeftTire = new KumhoTire("앞오른쪽", 13);
				break;
			case 3:
				System.out.println("뒤왼쪽 HanKookTire로 교체");
				car.frontLeftTire = new HanKookTire("뒤왼쪽", 14);
				break;
			case 4:
				System.out.println("뒤오른쪽 HanKookTire로 교체");
				car.frontLeftTire = new KumhoTire("뒤오른쪽", 17);
				break;
			}
			System.out.println("-------------------------");
		}
	}
	
}
