package chapter08;

public interface RemoteControl {
	public int MAX_VOULME = 10;
	public int MIN_VOULME = 0;
	
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}
