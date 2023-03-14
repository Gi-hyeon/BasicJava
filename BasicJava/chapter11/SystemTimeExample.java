package chapter11;

public class SystemTimeExample {
	public static void main(String[] args) {
//		System.out.println(System.currentTimeMillis());  //기준시간이 1970? 부터 시작 
//		System.out.println(System.currentTimeMillis()/ 60 );  // 프로그램 시작할때 끝날때 비교함
//		System.out.println(System.nanoTime());  //굉장히 빠르다?
//		Reflection -> 찾아보기
//		Reflection을 사용하면 private한 파일들도 전부 볼 수 있다 ex)안보이던 객체들도 보인다 -> 색있는 물컵도 보여진다.
//		
		
		
		
		
		long time1 = System.nanoTime();
		
		int sum = 0;
		for(int i=1; i<=1000000; i++) {
			sum += i;
		}
		
		long time2 = System.nanoTime();
		System.out.println("1~1000000까지의 합: " + sum);
		System.out.println("계산에 " + (time2 - time1) + " 나노초가 소요되었습니다.");
	}
}
