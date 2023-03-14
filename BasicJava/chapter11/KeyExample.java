package chapter11;

import java.util.HashMap;
import java.util.Objects;

/* @Data 롬복? 이란 기능도 있다. 필드 생성자 메소드 게터세터 전부 설치해줌 */
class Key{
	public int number;

	public Key(int number) {
		super();
		this.number = number;
	}

	@Override
	public int hashCode() {
		return Objects.hash(number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) { //주소가 같은지 판단
			return true;
		}
		if (!(obj instanceof Key)) {
			return false;
		}
		Key other = (Key) obj;
		return number == other.number;
	}

//	--설치
//	@Override
//	public String toString() {
//		return ReflectionToString
//	}

	
	
	
//	@Override
//	public String toString() {
//		return String.format("Key [number=%s]", number);
//	}
	
	
}

public class KeyExample {
	public static void main(String[] args) {
//		equals를 하기전에 hashcode를 먼저 확인함
//		Object 클래스의 hashCode()메소드는 객체의 메모리 번지를 이용해서 해시코드를 만들어 리턴	
		
		HashMap<Key, String> hashMap = new HashMap<Key, String>();	
		
		hashMap.put(new Key(1), "홍길동");
		String value = hashMap.get(new Key(1));
		System.out.println(value);
	}
}