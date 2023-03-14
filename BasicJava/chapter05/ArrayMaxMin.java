package chapter05;

public class ArrayMaxMin {
	public static void main(String[] args) {
		int[] arr = new int[] {38, 94, 16, 3, 76, 94, 82, 47, 59, 8};
		int max = 0;
		int min = 1000;
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] >= max) {
				max = arr[i];
			}
			if(arr[i] <= min) {
				min = arr[i];
			}
		}
		
		System.out.printf("최댓값은 : %d, 최솟값은 : %d", max, min);
	}
}
