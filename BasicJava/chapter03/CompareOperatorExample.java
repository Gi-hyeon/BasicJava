package chapter03;

public class CompareOperatorExample {
	String[] args = {};
	
	public static void main(String[] args) {
//		int v2 = 1;
//		double v3 = 1.0;
//		System.out.println(v2 == v3);
//		
//		double v4 = 0.1;
//		float v5 = 0.1f;
//		System.out.println(v4 == v5);
//		System.out.println((float)v4 == v5);
//		
//		String char1 = "가";
//		String char2 = "가";
//		
//		System.out.println(char1.equals(char2));
		
		int[][] scores = new int[2][3];
//		int[][] scores = {{1, 2}, {3, 4, 5}};
		
		for(int i=0; i<scores.length; i++) {
			for(int j=0; j<scores[i].length; j++) {
				System.out.printf("mathScores[%d][%d] = %d \n", i, j, scores[i][j]);
			}
		}
		
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[3];
		englishScores[1] = new int[3];
		
		for(int i=0; i<englishScores.length; i++) {
			for(int j=0; j<englishScores[i].length; j++) {
				System.out.printf("englishScores[%d][%d] = %d \n", i, j, scores[i][j]);
			}
		}
		

		
		System.out.println(scores.length);
		System.out.println(englishScores.length);
		System.out.println(englishScores[1].length);
		
		int[][] exam1 = new int[][] {{5, 8, 10, 6, 4}, {11, 20, 1, 3, 2}, {7, 9, 14, 22, 3}};
		
		for(int i=0; i<exam1.length; i++) {
			System.out.println("");
			for(int j=0; j<exam1[i].length; j++) {
				System.out.printf("%5d", exam1[i][j]);
			}
		}
		
		System.out.println("\n------------------------------------------------");
		
		int[][] exam2 = new int[4][4];
		int num = 0;
		
		for(int i=0; i<exam2.length; i++) {
			System.out.println("");
			for(int j=0; j<exam2[i].length; j++) {
				++num;
				System.out.printf("%5d", num);
			}
		}
		
		System.out.println("\n------------------------------------------------");
		
		int num3 = 16;
		int[][] exam3 = new int[4][4];
		for(int i=0; i<exam3.length; i++) {
			System.out.println("");
			for(int j=0; j<exam3[i].length; j++) {
				exam3[i][j] = num3--;
				System.out.printf("%5d   ", exam3[i][j]);
			}
		}
		
		String[] exam4 = new String[3];
		
		exam4[0] = "Java";
		exam4[1] = "Java";
		exam4[2] = new String("Java");
		
		System.out.println("\n");
		System.out.println(exam4[0] == exam4[1]); //true 같은 객체를 참조
		System.out.println(exam4[1] == exam4[2]); //false 다른 객체를 참조
		System.out.println(exam4[1].equals(exam4[2])); //true 문자열 동일
		
		int[] oldIntArray = new int[] {1, 2, 3};
		int[] newIntArray = new int[5];
		
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		for(int i=0; i<newIntArray.length; i++) {
			System.out.printf("%d  ", newIntArray[i]);
		}
		
		System.out.println("\n");
		
		String[] oldIntArray1 = new String[] {"Flutter", "Java", "Python"};
		String[] newIntArray1 = new String[6];
		
		System.arraycopy(oldIntArray1, 0, newIntArray1, 2, oldIntArray1.length);
		
		for(int i=0; i<newIntArray1.length; i++) {
			System.out.println(newIntArray1[i]);
		}
		
		int[] forSoccer = new int[] {95, 71, 84, 93, 87};
		int forSum = 0;
		for (int score : forSoccer) {
			forSum += score;
		}
		System.out.println(forSum);
		
		int[][] array3 = { {95, 86}, {83, 92, 96}, {78, 83, 93, 87, 88} };
		System.out.println(array3.length);  //3
		System.out.println(array3[2].length);  //5
		
		int max4 = 0;
		int[] array4 = {1, 5, 3, 8, 2};
		for(int i=0; i<array4.length; i++) {
			if(array4[i] > max4) {
				max4 = array4[i];
			}
		}
		System.out.println("max: " + max4);
		
	}
}
