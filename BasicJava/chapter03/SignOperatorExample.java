package chapter03;

public class SignOperatorExample {
	
	public static int add(int[] score) {
		int sum = 0;
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		
		byte b = 100;
		int result3 = -b;
		System.out.println("result3=" + result3);
		
		String hobby = "여행";
		System.out.println(hobby);
		hobby = null;
		System.out.println(hobby);
		
		char c1 = 'A' + 1;
		char c2 = 'A';
		System.out.println("c1: " + c1);
		System.out.println("c1: " + c2);
		
		// 83 90 87
//		String sum = null;
		String[] score;
		score = new String[] {"83", "90", "87", null, null};
		
		for(int i=0; i<score.length; i++) {
//			sum += score[i];
			System.out.println(score[i]);
		}
		
		int sum2 = add( new int[] {83, 90, 88} );
		System.out.println(sum2);
	}
}
