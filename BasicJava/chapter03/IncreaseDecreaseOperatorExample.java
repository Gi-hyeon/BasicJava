 package chapter03;

public class IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("----------");
		
		x++;    //x가 1이 증가한 상태 x = 11
		++x;    //x = 12
		System.out.println("x=" + x);
		
		System.out.println("----------");
		
		y--;      //y가 -1 감소하여 y = 9
		--y;      //y = 8
		System.out.println("y=" + y);
		
		System.out.println("----------");
		
		z = x++; 
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("----------");

		z = ++x;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("----------");
		
		z = ++x + y++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
		
		
		
		
	}
}
