package chapter11box;

import java.util.Objects;

class Family{
	public String name;
	public int age;
	
	public Family() {
	}
	
	public Family(String name, int age) {
		this.name = name;
		this.age = age;
	}

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

	public Family(String name) {
		super();
		this.name = name;
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(name);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj) {
//			return true;
//		}
//		if (!(obj instanceof Family)) {
//			return false;
//		}
//		Family other = (Family) obj;
//		return Objects.equals(name, other.name);
//	}

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
//		if (!(obj instanceof Family)) {
//			return false;
//		}
//		Family other = (Family) obj;
//		return age == other.age && Objects.equals(name, other.name);
//	}
	
	
	public int hashCode() {
		return Objects.hash(age, name);
	}
	
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(!(obj instanceof Family)) {
			return false;
		}
		Family other = (Family)obj;
		return age == other.age && name.equals(other.name);
	}
}


public class RockPaperGame {
	public static void main(String[] args) {
		Family family1 = new Family("최지현", 15000);
		Family family2 = new Family("최지현", 15000);
		
		System.out.println(family1.equals(family2));
	}
}
