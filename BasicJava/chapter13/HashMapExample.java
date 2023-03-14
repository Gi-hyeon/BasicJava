package chapter13;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
//		Map => HashMap, HashTable, TreeMap, LinkedHashMap, Properties
//		HashTable 보다 HashMap을 더 많이 사용한다. 쓰레드 안전
		Map<String, Integer> map = new HashMap<>();
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);   
		System.out.println("총 Entry 수: "+ map.size());
		System.out.println("홍길동 : " + map.get("홍길동"));   //홍길동에는 95라는 숫자가 들어간다
		System.out.println();
		
//		1. entry로 접근
		Set<Entry<String, Integer>> entrySet = map.entrySet();
//		1)iterator 접근 : entrySet.iterator(); => while문 접근이다
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Entry<String, Integer> entry = entryIterator.next();
			System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
		}
		System.out.println();
//		2)foreach문으로 접근
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
		}

//		2. key으로 접근
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			System.out.println(key + ":" + map.get(key));
		}
		
		System.out.println();
//		3. values로 접근 => 키값은 모른다
		Collection<Integer> values = map.values();
		for (Integer value : values) {
			System.out.println(value);
		}
		
		System.out.println();
		Map<Object,Object> map2 = new HashMap<>();
		map2.put(new Member("홍길동", 30), 90);
		map2.put(new Member("홍길동", 30), 95);
		System.out.println(map2.get(new Member("홍길동", 30))); //같은 객체로 취급해 null
	}
}
