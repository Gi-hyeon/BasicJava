package chapter20.memo;

import java.util.List;

public class MemoService {
	private MemoDAO dao = new MemoDAO();  //메모리 낭비를 위해 필드로 빼준다. / 필드를 통해 접근한다.
	
	public List<MemoVO> selectMemos(String searchWord) throws Exception{
//		MemoDAO dao = new MemoDAO();  -> 전부 들어가야하는데 메모리 낭비를 위해 필드로 빼줌
		return dao.selectMemos(searchWord);
	}
	
	public MemoVO selectMemo(int searchNo)throws Exception {
		return dao.selectMemo(searchNo);
	}
	
	public int insertMemo(MemoVO vo) throws Exception {
		return dao.insertMemo(vo);
	}
	
	public int updateMemo(MemoVO vo) throws Exception {
		return dao.updateMemo(vo);
	}

	public int deleteMemo(MemoVO vo) {
		return dao.deleteMemo(vo);
	}
}
