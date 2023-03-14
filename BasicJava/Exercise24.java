import java.util.Scanner;

public class Exercise24 {
	public static void main(String[] args) {
		double pi = Math.PI;
		double area = 0;
		double volume = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("원기둥 밑변의 반지름을 입력하시오.(단위: cm) : ");
		double radius = scanner.nextDouble();
		System.out.print("원기둥 높이를 입력하시오.(단위: cm) : ");
		double height = scanner.nextDouble();
		
		area = pi * radius * radius;
		volume = pi * radius * radius * height;
		
		System.out.printf("원기둥 밑변의 넓이는 %.14fcm²이고, 원기둥의 부피는 %.13fcm²이다.", area, volume);
		
		scanner.close();
	}
}