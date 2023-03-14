package chapter04;

public class ForSumFrom1To100Example {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		for(i=0; i<=100; i++){
			sum += i;
		}
		
		System.out.println("1~" + (i-1) + " 합 : " + sum);
		
		
		for(int m=1; m<=9; m++) {
			System.out.printf("*** %d단 *** \n", m);
			for(int n=1; n<=9; n++) {
				System.out.printf("%d * %d = %d \n", m, n, m*n);
			}
		}
	}
}
