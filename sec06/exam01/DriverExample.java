package sec06.exam01;

class Vehicle{
	public String name = "차량";
	
	public void run() {
		
		System.out.println("차량이 달린다.");
	}
}

class Bus extends Vehicle{
	public String name = "버스";
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("버스가 달린다.");
	}
}

class Taxi extends Vehicle{
	public String name = "택시";
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("택시가 달린다.");
	}
}

class Driver{
	public void drive(Vehicle vehicle) { //Vehicle vehicle = new Bus(); 라는 뜻이다. Vehicle vehicle 안에는 같거나 하위타입이 들어가야함.
		vehicle.run();
	}
}

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
//		Bus vehicle = new Bus();     // Bus vehicle -> bus가 없으면 bus에 올라가 vehicle로 감 앞에 / 필드는 선언된 타입에 따라 어디로 갈지 바뀜 / 
//		System.out.println(vehicle.name);
		//vehicle.name = "마을버스";
		
		
		driver.drive(new Bus());
		
	}
}
