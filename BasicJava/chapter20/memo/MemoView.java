package chapter20.memo;

import java.util.List;
import java.util.Scanner;

public class MemoView {
	public void printMemos(List<MemoVO> list) {
		System.out.println("메모 전체 목록");
		for (MemoVO vo : list) {
			System.out.println(vo);
		}
	}
	
	public MemoVO inputInsertMemo(Scanner scanner) {  //사용자가 입력받는다.
		System.out.print("제목: ");
		String title = scanner.nextLine();
		System.out.print("내용: ");
		String content = scanner.nextLine();
		System.out.print("작성자: ");
		String writer = scanner.nextLine();
		return new MemoVO(title, content, writer); //작성한 메모를 MemoVO에 리턴
	}
	
	public void insertResult(int count) {
		if(count > 0) {
			System.out.println("메모가 정상적으로 등록되었습니다.");
		} else {
			System.out.println("메모가 정삭적으로 등록되지 않았습니다. 관리자에게 문의하세요.");
		}
	}

	public int inputSearchNo(Scanner scanner) {
		System.out.print("메모 번호를 입력하세요: ");
		return Integer.parseInt(scanner.nextLine());
	}

	public void printMemo(MemoVO memo) {
		System.out.println(memo);
	}
	
	public MemoVO updateMemo(Scanner scanner) {
		System.out.println("수정할 메모 번호를 입력하세요.");
		int no = Integer.parseInt(scanner.nextLine());
		System.out.print("제목: ");
		String title = scanner.nextLine();
		System.out.print("내용: ");
		String content = scanner.nextLine();
		System.out.print("작성자 아이디: ");
		String writer = scanner.nextLine();
		return new MemoVO(no, title, content, writer);
	}
	
	public void updateResult(int count) {
		if(count > 0) {
			System.out.println("메모가 수정되었습니다.");
		} else {
			System.out.println("정상적으로 메모가 수정되지 않았습니다.");
		}
	}

	public MemoVO deleteMemo(Scanner scanner) {
		System.out.println("삭제할 번호를 적어주세요>");
		return new MemoVO(Integer.parseInt(scanner.nextLine()));
	}

	public void deleteResult(int deleteMemo) {
		if(deleteMemo > 0) {
			System.out.println("성공적으로 지워졌습니다.");
		}
	}
}
