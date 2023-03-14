package chapter20.memo;

import java.util.List;
import java.util.Scanner;

public class MemoController {  //하나의 컨트롤러가 서비스와 뷰를 왔다갔다 데이터를 주고받는다.
	private MemoService service = new MemoService();
	private MemoView view = new MemoView();
	
	public void selectMemos(String searchWord) throws Exception{
		List<MemoVO> list = service.selectMemos(searchWord);
		view.printMemos(list);
	}
	
	public void selectMemo(Scanner scanner)throws Exception {
		int searchNo = view.inputSearchNo(scanner);
		MemoVO memo = service.selectMemo(searchNo);
		view.printMemo(memo);
	}
	
	public void insertMemo(Scanner scanner) throws Exception {
		MemoVO vo = view.inputInsertMemo(scanner);
		int insertMemo = service.insertMemo(vo);
		view.insertResult(insertMemo);
	}
	
	public void updateMemo(Scanner scanner ) throws Exception {
		MemoVO vo = view.updateMemo(scanner);
		int updateMemo = service.updateMemo(vo);
		view.updateResult(updateMemo);
	}
	
	public void deleteMomo(Scanner scanner) {
		MemoVO vo = view.deleteMemo(scanner);
		int deleteMemo = service.deleteMemo(vo);
		view.deleteResult(deleteMemo);
		
	}
}
