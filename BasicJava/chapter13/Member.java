package chapter13;

import java.util.Objects;

public class Member {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(age, name);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj) {
//			return true;
//		}
//		if (!(obj instanceof Member)) {
//			return false;
//		}
//		Member other = (Member) obj;
//		return age == other.age && Objects.equals(name, other.name);
//	}

	
}
