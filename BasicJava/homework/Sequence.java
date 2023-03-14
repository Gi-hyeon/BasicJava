package homework;

class Solution{
	public long[] solution(int x, int n){
		long sum = 0;
		long[] answer = {};
		answer = new long[n];
		if(n > 1000) {
			return answer;
		}
		for(int i=0; i<n; i++) {
			sum += x;
			answer[i] = sum;
			System.out.print(answer[i] );
		}
		return answer;
	}
}

public class Sequence {
	public static void main(String[] args) {
		Solution solution = new Solution();
		
		long startTime = System.nanoTime();
		solution.solution(3, 4);
		System.out.println();
		long endTime = System.nanoTime();
		System.out.println(endTime - startTime);
		solution.solution(0, 4);
	}
}
