package chapter06;

import java.util.Scanner;

class Calculator1{
//	int plus(int x, int y) {
//		int result = x + y;
//		return result;
//	}
//	
//	double avg(int x, int y) {
//		double sum = plus(x, y);
//		double result = sum / 2;
//		return result;
//	}
//	
//	void execute() {
//		double result = avg(7, 10);
//		System.out.println("실행결과: " + result);
//	}------------------------------
	
//	int speed;
//	
//	int getSpeed() {
//		return speed;
//	}
//	
//	void turnOn() {
//		System.out.println("키를 돌립니다.");
//	}
//	
//	void run() {
//		for(int i=10; i<=70; i+=10) {
//			speed = i;
//			System.out.println("달립니다.(시속:" + i +"km/h)");
//		}
//	}

// ------------------------------------------
//	int sum(int x, int y) {
//		int result = x + y;
//		return result;
//	}
//	
//	double sum(double x, double y) {
//		double result = x + y;
//		return result;
//	}
//	
//	double squre(double x) {
//		return x*x;
//	}
//	
//	double rectangle(double x, double y) {
//		return x*y;
//	}
	
// -----------------------메소드 오버로딩.
	
//	boolean login(String name, String password) {
//		if(name.equals("hong") && password.equals("12345")) {
//			return true;
//		} else {
//			return false;
//		}
//	}
//	
//	void logout(String name) {
//		System.out.println("로그아웃 되었습니다.");
//	}
//	-------------269 
	
//	void println(int x) {
//		System.out.println(x);
//	}
//	void println(boolean x) {
//		System.out.println(x);
//	}
//	void println(double x) {
//		System.out.println(x);
//	}
//	void println(String x) {
//		System.out.println(x);
//	}
//	
	//---------오버라이딩 
	
//	String model;
//	int speed;
//	
//	Calculator1(String model){
//		this.model = model;
//	}
//	
//	void setSpeed(int speed) {
//		this.speed = speed;
//	}
//	
//	void run() {
//		for(int i=0; i<=80; i+=10) {
//			this.setSpeed(i);
//			System.out.println(this.model + "가 달립니다.(시속:" + this.speed + "km/h)");
//		}
//	}
//	----------------------------------------------------인스턴스 멤버와 this
	
//	String color;
//	static double pi = 3.14159;
//	
//	void setColor(String color) {
//		this.color = color;
//	}
//	
//	static int plus(int x, int y) {
//		return x + y;
//	}
//	
//	static int minus(int x, int y) {
//		return x - y;
//	}
// ----------------------------------
	
//	int speed;
//	
//	void run(int speed) {
//		System.out.println(speed + "으로 달립니다.");
//	}
//	-----------------
	

	

}

public class Calculator {
	public static void main(String[] args) {
		Calculator1 calculator = new Calculator1();
		
		
		
//       -----------정적 메소드		
//		calculator.run(60);
		
//		----------------------------------------------------------
//		double result = 10*10*calculator.pi;
//		
//		System.out.println(result);
//		System.out.println(calculator.plus(10, 5));
//		System.out.println(calculator.minus(15, 10));	
//      --------------------------------------------		
//		Calculator1 benz = new Calculator1("benz");
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		porsche.run();
//		benz.run();
		
//		----------------------------------------
//		calculator1.println(10);
//		calculator1.println(true);
//		calculator1.println(5.7);
//		calculator1.println("홍길동");
//		
//
//		
		
//		--------------------------------------
//		String id = scanner.nextLine();
//		String password = scanner.nextLine();
//		
//		boolean result = calculator1.login(id, password);
//		if(result) {
//			System.out.println("로그인 되었습니다.");
//			calculator1.logout("hong");
//		} else {
//			System.out.println("id 또는 password가 올바르지 않습니다.");
//		}
		
		
//		------------------------------------
		
//		System.out.println(calculator1.sum(7, 9));
//		
//		double result1 = calculator1.squre(4);
//		double result2 = calculator1.rectangle(10.4, 7);
//		
//		System.out.println("정사각형의 넓이 = " + result1);
//		System.out.println("직사각형의 넓이 = " + result2);
		
//		calculator1.execute();
//---------------------------------------		
//		calculator1.turnOn();
//		calculator1.run();
//		int speed = calculator1.getSpeed();
//		System.out.println("현재 속도:" + speed + "km/h");
		
	}
}
