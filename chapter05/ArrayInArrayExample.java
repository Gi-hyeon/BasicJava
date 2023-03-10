package chapter05;

public class ArrayInArrayExample {
	public static void main(String[] args) {
		int[][] mathscores = new int[2][3];
		
		for(int i=0; i<mathscores.length; i++) {
			for(int k=0; k<mathscores[i].length; k++) {
				System.out.printf("mathScores[%d][%d] = %d\n", i, k, mathscores[i][k]);
			}
		}
		System.out.println();
		
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		for(int i=0; i<englishScores.length; i++) {
			for(int k=0; k<englishScores[i].length; k++) {
				System.out.printf("englishScores[%d][%d] = %d\n", i, k, englishScores[i][k]);
			}
		}
		System.out.println();
		
		int[][] javaScores = {{95, 80}, {92, 96, 80}};
		for(int i=0; i<javaScores.length; i++) {
			for(int k=0; k<javaScores[i].length; k++) {
				System.out.printf("javaScores[%d][%d] = %d\n", i, k, javaScores[i][k]);
			}
		}
	}
}
