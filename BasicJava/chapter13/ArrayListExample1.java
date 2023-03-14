package chapter13;

import java.awt.TextField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ArrayListExample1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("비밀번호를 입력하세요: ");

        String password = scanner.nextLine();
        String maskedPassword = maskPassword(password);
        System.out.println("입력한 비밀번호는 " + maskedPassword + " 입니다.");
		
		
		
		
		
		
		List<Object> list = new ArrayList<>();
		list.add(4);
		list.add("ㅇㅇㅇ");
		list.add("ooo");
		System.out.println(list.size());
		
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		list.remove("ㅇㅇㅇ");
		boolean oooContain = list.contains("ㅇㅇㅇ");
		System.out.println("oooContain = " + oooContain);
		
		for (Object object : list) {
			System.out.println(object);
		}
		System.out.println();
		Set<String> set = new HashSet<>();
		set.add("rrr");
		set.add("ddd");
		set.add("rrr");
		
		for (String string : set) {
			System.out.println(string);
		}
		
		System.out.println();
		List<String> list2 = new LinkedList<>();
		list2.add("aaa");
		list2.add("bbb");
		list2.add("ccc");
		list2.add("ddd");
		list2.add("aaa");
		list.add(null);
		
		for (String string : list2) {
			System.out.println(string);
		}
		
		list2.remove(2);
		System.out.println();
		for (String string : list2) {
			System.out.println(string);
		}
		
		System.out.println("---------------------------------------------------------------------");
		Object[] array = {4, 6, 9, "dd"};
		List<Object> list3 = Arrays.asList(1, 4, 8, "야", 5, null);
		
		for (Object object : list3) {
			System.out.println(object);
		}
		
		System.out.println("---------------------------------------------------------------------");
		array[0] = "4update";
		for (Object object : list3) {
			System.out.println(object);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static String maskPassword(String password) {
		 String maskedPassword = "";
	        for (int i = 0; i < password.length(); i++) {
	            maskedPassword += "*";
	        }
	        return maskedPassword;

	}
}
