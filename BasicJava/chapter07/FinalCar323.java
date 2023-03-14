package chapter07;

class FinalCar{
	public int speed;
	
	public void speedUp() {
		
	}
	
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}
}

class SportsCar extends FinalCar{
	@Override
	public void speedUp() {
		
	}
	
	
//  아래 문장처럼 final을 붙인 메소드는 재정의 할 수 없다.	
//	@Override
//	public void stop() {
//		
//	}
}

public class FinalCar323 {
	public static void main(String[] args) {
		
	}
}
