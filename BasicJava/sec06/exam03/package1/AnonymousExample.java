package sec06.exam03.package1;

import chapter09.Vehicle;

public class AnonymousExample {
	public static void main(String[] args) {
		//함수형 프로그래밍(functional programming)
		//람다(Lamda) 표현식
		//Stream API를 사용할 때 많이 활용
		Vehicle v = new Vehicle() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("출력");
			}
		};
//		Vehicle v = () -> System.out.println("출력");  람다식 근데 오류뜸..
		v.run();
	}
}
