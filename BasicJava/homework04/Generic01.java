package homework04;

import java.util.Arrays;
import java.util.Scanner;

class People<T, M>{
	private T name;
	private M age;
	public People(T name, M age) {
		super();
		this.name = name;
		this.age = age;
	}
	public T getName() {
		return name;
	}
	public void setName(T name) {
		this.name = name;
	}
	public M getAge() {
		return age;
	}
	public void setAge(M age) {
		this.age = age;
	}
		
}

public class Generic01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("입력 : ");
		int num1 = Integer.parseInt(scanner.nextLine());
		int num2 = 4;
		
	}
}
