import java.util.Scanner;

public class Exercise21 {
	public static void main(String[] args) {
		double area = 0;
		double perimeter = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("가로의 길이는?(단위: m): ");
		double width = scanner.nextDouble();
		
		System.out.print("세로의 길이는?(단위: m): ");
		double height = scanner.nextDouble();
		
		area = width * height;
		perimeter = (width * 2) + (height * 2);
		
		System.out.printf("직사각형의 넓이 : %5.2f\n", area);
		System.out.printf("직사각형의 둘레 : %4.1f", perimeter);
		
		scanner.close();
	}
}
