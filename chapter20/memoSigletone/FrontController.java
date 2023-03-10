package chapter20.memoSigletone;

import java.util.Scanner;

public class FrontController {
	private MemoController memoController = MemoController.getInstance();
	private Scanner scanner = new Scanner(System.in);

	public void process() {
		System.out.println("메모 관리 프로그램");
		while (true) {
			System.out.println("------------------------------------------");
			System.out.println("1.목록|2.상세|3.등록|4.수정|5.삭제|0.종료");
			System.out.println("------------------------------------------");
			System.out.println("⑥   ⑩");
			System.out.print("메뉴 선택> ");
			int selectMenu = Integer.parseInt(scanner.nextLine());
			switch (selectMenu) {
			case 1:
				memoController.selectMemos("");
				break;
			case 2:
				memoController.selectMemo(scanner);
				break;
			case 3:
				memoController.insertMemo(scanner);
				break;
			case 4:
				memoController.updateMemo(scanner);
				break;
			case 5:
				memoController.deleteMomo(scanner);
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				System.exit(selectMenu);
				break;
			}
		}
	}
}
