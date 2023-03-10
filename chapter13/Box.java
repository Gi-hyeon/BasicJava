package chapter13;

public class Box<T> {  //나중에 타입이 결정된다는 뜻 <T> => T에 나중에 결정될 값들이 들어간다.
//	어떻게 담아야 모든 타입을 담을 수 있을까?
	private T value;

	public Box(T value) {
		super();
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
}
