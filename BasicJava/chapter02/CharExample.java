package chapter02;

public class CharExample {
	public static void main(String[] args) {
		String name = "홍길동";
		String job = "프로그래머";
		String str = "우리는 \"개발자\"입니다.";
		String str1 = "봄 // 여름 // 가을 // 겨울";
		String str2 = "봄 /r 여름 /r 가을 /r 겨울";
		long value = 10000000000l;
		boolean stop = true;
		float var1 = 3.14f;
		double var2 = 3.14;
		float var3 = 0.1234567890123456789f;
		double var4 = 0.123456789123456789;
		float var44 = (float)var4;
//		boolean ran = false;
		
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		
		double var5 = 3e6;
		float var6 = 3e6f;
		double var7 = 2e-3;
		float avalue = 1e3f;
		int aintvalue = (int)avalue;
		
		System.out.println("강제형변환 : " + aintvalue);
		System.out.println("강제형변환 : " + var44);
		System.out.println("var5: " + var5);
		System.out.println("var6: " + var6);
		System.out.println("var7: " + var7);
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(value);
		if(stop = false) {
			System.out.println("스탑");
		}else {
			System.out.println("진행");
		}
		
		int x = 5;
		int y = 2;
		double result = (double)(x/y);
		System.out.println(result);
	}
}
