package chapter11box;

public class MathExample {
	public static void main(String[] args) {
		int v1 = Math.abs(-5);
		System.out.println(v1);
		
		double v3 = Math.ceil(5.3);   //올림값
		System.out.println(v3);
		
		double v5 = Math.floor(5.3); //반올림
		double v6 = Math.floor(-5.3);
		System.out.println(v5);   
		System.out.println(v6);   
		
		int v7 = Math.max(5, 9);
		double v8 = Math.max(5.3, 2.5);
		System.out.println(v7);
		System.out.println(v8);
	}
}
