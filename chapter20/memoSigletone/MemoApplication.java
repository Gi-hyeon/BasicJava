package chapter20.memoSigletone;

public class MemoApplication {
	public static void main(String[] args) throws Exception {  
		FrontController controller = new FrontController();
		controller.process();
		
		/*
		 * 배포(Deployment, Release) -> 빌드를 하여 사람들이 사용할 수 있게 배포해준다.
		 * ㄴ 빌드(build) -> 클래스 파일을 하나에 묶어서 사용할 수 있게 해준다.
		 * java의 경우 실행 가능한 jar파일로 배포 -> Runnable Jar
		 * war(와르), tar(타르) 종류가 있음
		 * ant -> 빌드 툴
		 * JAR file -> 라이브러리 같은 존재
		 * Runnable JAR file -> 실행만 누르면 바로 실행된다.
		 * Cmd -> cd Desktop -> java -jar memo.jar
		 */ 
	}
}
