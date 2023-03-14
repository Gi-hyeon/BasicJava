package chapter02;
import java.util.Scanner;

public class sill {
	public static void main(String[] args) {
		char c1 = 'a';
		char c2 = (char)(c1 + 1);
		System.out.println(c2);
		
		System.out.println("-----6-----");
		int x = 5;
		int y = 2;
		double result3 = (double)x / y;
		System.out.println(result3);
		
		int d = 5;
		int f = 2;
		double dfresult = (double)x / y ;
		System.out.println(dfresult);
		
		System.out.println("-----8-----");
		double var1 = 3.5;
		double var2 = 2.7;
		int result = (int)(var1 + var2);
		System.out.println(result);
		
		System.out.println("-----9-----");
		long var3 = 2L;
		float var4 = 1.8f;
		double var5 = 2.5;
		String var6 = "3.9";
		int result1 = (int)(var3 + var4 + var5 + (int)Double.parseDouble(var6));
		System.out.println(result1);
		
		System.out.println("-----11-----");
		byte value = Byte.parseByte("10");
		int value1 = Integer.parseInt("1000");
		float value2 = Float.parseFloat("20.5");
		double value3 = Double.parseDouble("3.14159");
		System.out.println(value3);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1. 이름: ");
		String name = scan.nextLine();
		
		scan.close();
	}
}
