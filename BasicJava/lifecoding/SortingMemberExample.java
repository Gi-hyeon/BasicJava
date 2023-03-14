package lifecoding;

import java.util.Arrays;

class Member implements Comparable<Member>{
	String name;
	int age;
	
	public Member(String name, int age) {
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

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}

	public int compareTo(Member o) {
		if(age > o.age) {
			return 1;
		} else if( age == o.age) {
			return 0;
		} else {
			return -1;
		}
	}
}

public class SortingMemberExample {
	public static void main(String[] args) {
		Member[] members = new Member[5];
		members[0] = new Member("구기현", 69);
		members[1] = new Member("정재균", 14);
		members[2] = new Member("이성일", 17);
		members[3] = new Member("구기현1", 3);
		members[4] = new Member("구기현2", 22);
		
		for (Member s : members) {
			System.out.println(s);
		}
		
		Arrays.sort(members);
		
		for (Member s : members) {
			System.out.println(s);
		}
	}
}
