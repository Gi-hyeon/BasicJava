package chapter11box;

public class BoxingUnBoxingExample {
	public static void main(String[] args) {
		int a = 10;
		Integer b = new Integer(10); //boxing
		int bb = b.intValue();  //unboxing
		Boolean c = new Boolean(false);
		
		//자동 박싱, 자동 언박싱
		Integer d = 10; //auto boxing
		int e = new Integer(10); //auto unboxing
		
		Integer obj = new Integer(200);
		int value1 = obj;
		int value2 = obj + 100;
		
		Integer obj3 = 129;
		Integer obj4 = 129;  //127 범위까지는 객체 비교할 때 true
		int value3 = obj3;
		int value4 = obj4;
		System.out.println(obj3.intValue() == obj4.intValue());  //객체비교는 값을 빼내거나 equals
		
		
		long startTime = System.nanoTime();
		Integer sum = 0;
		for(int i=0; i<=100000; i++) {
			sum = sum + i;
		}
		long endTime = System.nanoTime();
		System.out.println(endTime - startTime);  //객체 연산 시간측정이 더 오래걸린다
		
		
		long startTime1 = System.nanoTime();
		int sum1 = 0;
		for(int i=0; i<=100000; i++) {
			sum1 = sum1 + i;
		}
		long endTime1 = System.nanoTime();
		System.out.println(endTime1 - startTime1);  //기본 연산
		
		
		// 객체 연산을 하면 메소드 기능을 이용하여 뭘 더 할수가 있다.
		Integer int1 = 100;
		Integer int2 = 200;
		int sum2 = Integer.sum(int1, int2);
		System.out.println(sum2);
		
	}
}