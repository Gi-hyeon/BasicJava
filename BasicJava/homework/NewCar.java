package homework;

public class NewCar {
	private double speed;
	private String color;
	private final static double MAX_SPEED = 200;
	
	public NewCar() {
		
	}
	
	public NewCar(String color) {
		this.color = color;
	}
	
	public double getSpeed() {
		return mileToKillo(this.speed);
	}
	
	public void setSpeed(double speed) {
		this.speed = killoToMile(speed);
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean speedUp(double speed) {
		if(this.speed + killoToMile(speed) > MAX_SPEED/1.6 || this.speed + killoToMile(speed) < 0) {
			return false;
		} else {
			this.speed += killoToMile(speed);	
			return true;
		}
	}
	
	public static double getMaxSpeed() {
		return MAX_SPEED;
	}
	
	private static double killoToMile(double distance) {
		return distance/1.6;
	}
	
	private static double mileToKillo(double distance) {
		return distance*1.6;
	}
	
	public String toString() {//현재 필드값을 String 문자열로 변환시켜서 보여줘라 -> toString() 목적
		return null;
	}
}
