package chapter13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListExample {
	public static void main(String[] args) {
//		최상위 Interface -> Abstract Class -> Class 방식으로 설계하는 것이 가장 좋다.
//		List -> Abstract -> ArrayList, vector, LinkedList
//		List<String> list = new ArrayList<String>();
		
//		List<Object> list3 = Arrays.asList(null);  //고급개발자 선언방식
		
//		List타입을 언하는 것이 좋다.
		List<String> list = new ArrayList<>(); //String으로 선언할 때 add. 할때 알아서 바뀜
		list = new Vector<>();   //List로 선언해준 경우에만 다형성이 성립한다. ArrayList로 할시 x
		list = new LinkedList<>();
		
		list.add("Java");
		list.add("Jdbc");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		
		
		int size = list.size();
		System.out.println("총 객체수: " + size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2: " + skill);
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		list.remove("iBATIS");
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
//		모든 요소가 삭제된다.
		list.clear();
		System.out.println(list.size());
	}
}
