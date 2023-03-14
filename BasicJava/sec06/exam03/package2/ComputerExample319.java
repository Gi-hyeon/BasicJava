package sec06.exam03.package2;

class Calculator{
	double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle() 실행");
		return 3.14159 * r * r;
	}
}

class Computer extends Calculator{
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
}

public class ComputerExample319 {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Computer computer = new Computer();
		
		System.out.printf("%.2f\n", calculator.areaCircle(4.4));
		System.out.printf("%.2f\n", computer.areaCircle(9.9));
	}
}
