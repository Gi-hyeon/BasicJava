package sabstract;

import java.util.Scanner;

class HumanTest{

}

public class cheol {
	public static void main(String[] args) {
		

		
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("철수 : ");
		String human1 = scanner.nextLine();
		
		System.out.print("영희 : ");
		String human2 = scanner.nextLine();
		
		String result = "";
		if(human1.equals(human2)) {
			result = "비겼습니다";
		} else if(human1.equals("가위")&&human2.equals("보") || human1.equals("바위")&&human2.equals("가위") || human1.equals("보")&&human2.equals("바위")) {
			result = "철수 승리";
		} else {
			result = "영희 승리";
		}
		System.out.println("결과 : " + result);
	}
}
