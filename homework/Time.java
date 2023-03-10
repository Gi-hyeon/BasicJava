package homework;

public class Time {
	private int hour = 0;
	private int minute = 0;
	private int second = 0;
	
	public Time() {
		
	}
	
	public Time(int hour, int minute, int second) {
		if(hour < 24) {
			this.hour = hour;
		}else {
			this.hour = 00;
		}
		if(minute < 60) {
			this.minute = minute;
		} else {
			this.minute = 00;
		}
		if(second < 60) {
			this.second = second;
		} else {
			this.second = 00;
		}
	}
	
	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
}
