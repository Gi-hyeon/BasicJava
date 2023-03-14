package chapter06;

public class Car1{
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car1(){
		//new Car1(null, null, 0); //2개의 객체가 생성된다는 문제가 있음
		this(null, null, 0);
	}
	
	Car1(String model){
		this(model, null, 0);
	}
	
	Car1(String model, String color){
		this(model, color, 0);
	}
	
	Car1(int maxSpeed, String model, String color){      //타입과 순서 달라도 된다.  매개변수의 수와 타입이 같을 때 순서가 바뀌면 문제가 생김
		this(model, color, maxSpeed);
	}
	
	Car1(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		System.out.println("자동차가 만들어졌습니다.");
		System.out.println(model + "만들어졌습니다.");
	}
}
