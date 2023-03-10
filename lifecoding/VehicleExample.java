package lifecoding;

interface Vehicle{
	public void run();
}

//class Driver{
//	public void drive(Vehicle vehicle) {
//		vehicle.run();
//	}
//}

class Bus implements Vehicle{
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	
	public void checkFare() {
		System.out.println("체크페어");
	}
}

class Taxi implements Vehicle{
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
}

public class VehicleExample {
	public static void main(String[] args) {
//		Vehicle vehicle = new Vehicle();
//		Bus bus = vehicle;
//		Taxi taxi = vehicle;
		
//		Bus bus = new Bus();
//		Vehicle vehicle = bus;
//		Vehicle vehicle2 = new Taxi();
		
//		vehicle2.run();
//		vehicle.run();
//		bus.run();
//		
		
//		
		
		
		
		
//		driver.drive(bus);
//		driver.drive(taxi);
		
		Vehicle bus = new Bus();
		if(bus instanceof Bus) {
			Bus bus2 = (Bus)bus;
			bus2.checkFare();
		}
	}
	
	static void driver(Vehicle vehicle) {
		vehicle.run();
	}
}
