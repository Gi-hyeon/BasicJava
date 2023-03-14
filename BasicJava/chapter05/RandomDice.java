package chapter05;

import java.util.Random;

public class RandomDice {
	public static void main(String[] args) {
		Random random = new Random();
		
		int[] arr = new int[] {0, 0, 0, 0, 0, 0};
		
		System.out.println("-----------");
		System.out.println("면     빈도");
		System.out.println("-----------");
		for(int i=0; i<10000; i++) {
			int randomNum = random.nextInt(6)+1;
			if(randomNum == 1) {
				arr[0] += 1;
			} else if(randomNum == 2) {
				arr[1] += 1;
			} else if(randomNum == 3) {
				arr[2] += 1;
			} else if(randomNum == 4) {
				arr[3] += 1;
			} else if(randomNum == 5) {
				arr[4] += 1;
			} else{
				arr[5] += 1;
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%d      %d\n", i+1, arr[i]);
		}
	}
}
