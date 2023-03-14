package sec06.exam03.package2;

public class SupersonicAirplane extends Airplane{
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	public static final int SSUPERSONIC = 3;
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다.");
		} else if(flyMode == SSUPERSONIC) {
			System.out.println("초초음속비행합니다.");
		} else {
			super.fly();
		}
	}
}
