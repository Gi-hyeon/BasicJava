package chapter13;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		Set<Object> treeSet = new TreeSet<>();
		
		treeSet.add("김기현");
		treeSet.add("구기현");
		treeSet.add("박기현");
		treeSet.add("상기현");
		
		treeSet.remove("구기현");
		
		for (Object object : treeSet) {
			System.out.println(object);
		}
	}
}
