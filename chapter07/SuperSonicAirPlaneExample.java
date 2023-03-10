package chapter07;

class AirPlane{
	public void takeoff() {
		System.out.println("이륙합니다.");
	}
	public void fly(){
		System.out.println("일반비행합니다.");
	}
	public void land(){
		System.out.println("착륙합니다.");
	}
}



class SupersonicAirplane extends AirPlane{
	public static final int normal = 1;
	public static final int superSonic = 2;
	
	public int flyMode = normal;
	
	@Override
	public void fly() {
		if(flyMode == superSonic) {
			System.out.println("초음속비행합니다.");
		} else {
			System.out.println("일반비행합니다.");
		}
	}
}

//final을 앞에 붙이면 상속할 수 없는 class가 된다.


public class SuperSonicAirPlaneExample {
	public static void main(String[] args) {
		SupersonicAirplane supersonicAirplane = new SupersonicAirplane();
			
		supersonicAirplane.takeoff();
		supersonicAirplane.fly();
		supersonicAirplane.flyMode = supersonicAirplane.superSonic;
		supersonicAirplane.fly();
		supersonicAirplane.flyMode = supersonicAirplane.normal;
		supersonicAirplane.fly();
		supersonicAirplane.land();
	}
}
