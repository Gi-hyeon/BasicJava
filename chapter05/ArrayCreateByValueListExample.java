package chapter05;

public class ArrayCreateByValueListExample {
	public static void main(String[] args) {
		int[] scores = new int[] {83, 90, 87};
		int result = 0;
		
		for(int i=0; i<scores.length; i++) {
			System.out.printf("scores[%d] : %d\n", i, scores[i]);
			result += scores[i];
		}
		double avg = (double)result/scores.length;
		System.out.printf("총합 : %d\n", result);
		System.out.printf("평균 : %f", avg);
		
		int[][] array = new int[2][];
		array[1]= new int[3];
		
		
		System.out.println(array[1].length);
	}
}
