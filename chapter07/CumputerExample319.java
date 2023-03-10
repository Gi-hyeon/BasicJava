package chapter07;

class Calculator{
	double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle() 실행");
		return 3.14159 * r * r;
	}
	
}

class Computer extends Calculator{
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의areaCircle() 실행");
		return Math.PI * r * r;
	}
}

public class CumputerExample319 {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		System.out.println(calculator.areaCircle(20));
		
		Computer computer = new Computer();
		System.out.println(computer.areaCircle(20));
	}
}
