package chapter08;

public class SmartTelevisionExample {
	public static void main(String[] args) {
//		SmartTelevision tv = new SmartTelevision();
		 
		RemoteControl television = new SmartTelevision(); // 아래와 같이 AUDIO와 TELEVISION을 생성할 수 있기 때문에 이런 방식으로 많이 생성한다. UPCASTING DOWNCASTING 하는 이우
		television.turnOn();
		television = new Audio();
		television = new Television();
	
		
		
//		RemoteControl rc = tv;
//		Searchable searchable = tv;
	}
}
