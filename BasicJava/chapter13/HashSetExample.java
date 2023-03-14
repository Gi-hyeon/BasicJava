package chapter13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.lang.model.element.Element;

public class HashSetExample {
	public static void main(String[] args) {
//		HashSet이 기본적으로 가장 많이 사용한다.
//		중복저장이 필요하다 Set, 중복저장이 없으면 ArrayList를 사용하면 된다.
//		HashSet은 순서를 보장하지 않는다.
		Set<Object> set = new HashSet<>();
		Set<Object> set2 = new HashSet<>();
		set2.add(new Member("홍길동", 23));
		set2.add(new Member("홍길동", 23));
		System.out.println("객체 수 : " + set2.size()); //2개로 나오지만, Member 해쉬코드 생성기 사이즈 1개로 나옴
//		-------------------------------------------------
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");   //Index가 없기 때문에 순서가 뒤죽박죽
		set.add("Java");     //"Java"는 한 번만 저장된다.
		set.add("iBATIS");
//		set.add(null);
		
		int size = set.size();
		System.out.println("총 객체수: " + size);
		
//		모든 원소에 접근해서 데이터 가져오기
		Iterator<Object> iterator = set.iterator();
		while(iterator.hasNext()) {
			Object element = iterator.next();
			System.out.println("\t" + element);
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체수: " + size);
		iterator = set.iterator();
//		향상된 for문 jdk 1.5
		for(Object object : set) {
			System.out.println("\t" + object);
		}
//		while(iterator.hasNext()) {
//			Object element = iterator.next();
//			System.out.println("\t" + element);
//		}
//		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("비어 있음");
		}
	}
}
