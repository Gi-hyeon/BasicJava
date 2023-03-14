package backjun;

import java.util.Scanner;

public class MaxNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[][] array = new int[9][9];
		int maxSerch = 0;
		int maxSerchi = 0;
		int maxSerchj = 0;
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				array[i][j] = scanner.nextInt();
			}
		}
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				if(array[i][j] > maxSerch) {
					maxSerch = array[i][j];
					maxSerchi = i;
					maxSerchj = j;
				}
			}
		}
		
		System.out.println(maxSerch);
		System.out.printf("%d %d", maxSerchi+1, maxSerchj+1);
		
		
		scanner.close();
	}
}
