package chapter05;

public class Exercise04 {
	public static void main(String[] args) {
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		
		for(int i=0; i<array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		
		System.out.println("max : " + max);
		
		int[][] array1 = {{95, 86}, {83, 92, 96}, {78, 83, 93, 87, 88}};
		
		int sum1 = 0;
		double avg1 = 0.0;
		
		
		int count = 0;
		for(int i=0; i<array1.length; i++) {
			for(int j=0; j<array1[i].length; j++) {
				count ++;
				sum1 += array1[i][j];
			}
		}
		
		avg1 = (double)sum1 / count;
		
		System.out.println("sum: " + sum1);
		System.out.println("avg: " + avg1);
	}
}

