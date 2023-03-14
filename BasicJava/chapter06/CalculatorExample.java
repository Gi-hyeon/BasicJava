//package chapter06;
//
//class Calculator{
//	void powerOn() {
//		System.out.println("전원을 켭니다.");
//	}
//	
//	int plus(int x, int y) {
//		int result = x + y;
//		return result;
//	}
//	
//	double divide(int x, int y) {
//		double result = (double)x / y;
//		return result;
//	}
//	
//	void powerOff() {
//		System.out.println("전원을 끕니다.");
//	}
//}
//
//public class CalculatorExample {
//	public static void main(String[] args) {
//		Calculator calculator = new Calculator();
//		calculator.powerOn();
//		
//		int result1 = calculator.plus(6, 9);
//		System.out.println(result1);
//		
//		byte x = 10;
//		byte y = 4;
//		double result2 = calculator.divide(x, y);
//		System.out.println(result2);
//		
//		calculator.powerOff();
//		
//		String[] array = new String[3];
//		array[0] = "java";
//		array[1] = "java";
//		array[2] = new String("java");
//		
//		String[][] array2 = {{"동동"}, {"둥둥"}};
//		
//		System.out.println(array[0] == array[2]);
//		
//		System.out.println(array[1]);
//	}
//}
