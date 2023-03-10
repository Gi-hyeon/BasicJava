package chapter20.memoSigletone;

import java.util.List;

public class MemoService {
	private static MemoService instance = new MemoService();
	
	private MemoService() {
		
	}
	
	public static MemoService getInstance() {
		return instance;
	}
	
	private MemoDAO dao = MemoDAO.getInstance();
	
	public List<MemoVO> selectMemos(String searchWord) {
//		MemoDAO dao = new MemoDAO();  -> 전부 들어가야하는데 메모리 낭비를 위해 필드로 빼줌
		return dao.selectMemos(searchWord);
	}
	
	public MemoVO selectMemo(int searchNo) {
		return dao.selectMemo(searchNo);
	}
	
	public int insertMemo(MemoVO vo) {
		return dao.insertMemo(vo);
	}
	
	
	public int updateMemo(MemoVO vo) {
		return dao.updateMemo(vo);
	}

	public int deleteMemo(MemoVO vo) {
		return dao.deleteMemo(vo);
	}

//	public int updateMemo(MemoVO vo) {
//		return dao.updateMemo(vo);
//	}
}
