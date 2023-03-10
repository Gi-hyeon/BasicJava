package chapter20.memo;

public class MemoApplication {
	public static void main(String[] args) throws Exception {  //모든 걸 try catch 해줘서 예외처리 해줘야한다.
		FrontController controller = new FrontController();
		controller.process();
//		INNER JOIN이라는 특성 때문에 a001이 안나온다?.
	}
}
