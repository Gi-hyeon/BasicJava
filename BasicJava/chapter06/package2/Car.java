package chapter06.package2;

public class Car {
	//필드는 무조건 private -> 필드를 쓰기위해 getter 결과값 반환, setter 필드값 -> 를 반든다
	private int speed;
	private boolean stop;
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public boolean isStop() {   //스탑이냐? is가 더 깔끔
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}
