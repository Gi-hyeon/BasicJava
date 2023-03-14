package chapter05;

import java.util.HashSet;
import java.util.Random;

public class LottoNumber {
	public static void main(String[] args) {
		Random random = new Random();
		
		int[] arr = new int[45];
		HashSet<Integer> arr1 = new HashSet<Integer>();
	
		for(int i=0; i<6; i++) {
			arr1.add(random.nextInt());
		}
		
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = random.nextInt(45)+1;
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					i--;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
		
		
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr.length; j++) {
//				if(arr[i] < arr[j]){	
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//				System.out.printf("%d ", arr[j]);
//			}
//			System.out.println("");
//		}
		
		for(int i=0; i<arr.length; i++) {
			int rValue = random.nextInt(45);
			int rValue1 = random.nextInt(45);
			for(int j=0; j<arr.length; j++) {
				int temp = arr[rValue];
				arr[rValue] = arr[rValue1];
				arr[rValue1] = temp;
			}
		}
		
		System.out.println("");
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
		System.out.println("");
		
		for(int i=0; i<6; i++) {
			if(i != 0) {
				System.out.print(", ");
			}
			System.out.printf("%d", arr[i]);
		}
		
	}
}
