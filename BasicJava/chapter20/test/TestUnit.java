package chapter20.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import chapter20.memo.MemoDAO;
import chapter20.memo.MemoVO;

class TestUnit {
//	TDD: Test Driven Development(테스트 주도 개발)
	MemoDAO dao = new MemoDAO();
	
//	@Test
//	void selectMemos() {
//		try {
//			List<MemoVO> list = dao.selectMemos("");
//			assertEquals(0, list.size());  //컴퓨터한테 테스트를 해보라고 맡긴다.
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
//	익숙해지기 오래걸린다. 일반 개발자들도 사용 x
//	@Test
//	void selectMemo() {
//		MemoVO memo = dao.selectMemo(0);
//		assertNull(memo);
//	}
	
//	메소드가 정상적인이 확인하기 위해 이러한 작업을 거친다.
	@Test
	void insertMemo() {
		try {
			int insertMemo = dao.insertMemo(new MemoVO("7번째 시간", "이제 2시간 남음", "a001"));
			assertEquals(1, insertMemo);
			List<MemoVO> list = dao.selectMemos("");
			assertEquals(16, list.size());    //해당 테이블 사이즈, list.size() 로 해야한다.
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	

}
