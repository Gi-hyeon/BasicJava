package sec06.exam01;

// 상속관계(is a) 한국타이어는 타이어다.
// ex) Human Student -> 학생은 사람이다가 더 자연스럽기 때문에 상속관계가 더 맞다.
public class HanKookTire extends Tire {
	public HanKookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " HanKookTire 수명: " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " HanKookTire 펑크 ***");
			return false;
		}
	}

}
