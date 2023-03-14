package chapter20.memoSigletone;

import java.util.List;
import java.util.Scanner;

public class MemoController {
	private static MemoController instance = new MemoController();

	private MemoController() {

	}

	public static MemoController getInstance() {
		return instance;
	}

	private MemoService service = MemoService.getInstance();
	private MemoView view = MemoView.getInstance();

	public void selectMemos(String searchWord) {
		List<MemoVO> list = service.selectMemos(searchWord);
		view.printMemos(list);
	}

	public void selectMemo(Scanner scanner) {
		int searchNo = view.inputSearchNo(scanner);
		MemoVO memo = service.selectMemo(searchNo);
		view.printMemo(memo);
	}

	public void insertMemo(Scanner scanner) {
		MemoVO vo = view.inputInsertMemo(scanner);
		int insertMemo = service.insertMemo(vo);
		view.insertResult(insertMemo);
	}

	public void updateMemo(Scanner scanner) {
		MemoVO vo = view.updateMemo(scanner);
		int updateMemo = service.updateMemo(vo);
		view.updateResult(updateMemo);
	}

	public void deleteMomo(Scanner scanner) {
		MemoVO vo = view.deleteMemo(scanner);
		int deleteMemo = service.deleteMemo(vo);
		view.deleteResult(deleteMemo);
	}

//	public void updateMemo(Scanner scanner) {
//		MemoVO vo = view.updateMemo(scanner);
//		int updateMemo = service.updateMemo(vo);
//		view.updateResult(updateMemo);
//	}
}
