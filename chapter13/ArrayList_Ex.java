package chapter13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

class Student{
	private String name;
	private String ssn;
	private int num;
	public Student(String name, String ssn, int num) {
		super();
		this.name = name;
		this.ssn = ssn;
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
}

class Bf{
	private String Bf;

	public Bf(String bf) {
		super();
		Bf = bf;
	}

	public String getBf() {
		return Bf;
	}

	public void setBf(String bf) {
		Bf = bf;
	}
	
}

class StudentDao{

	public List<Student> getStudentDao() {
		List<Student> list = new ArrayList<>();
		list.add(new Student("이름1", "주민1", 1));
		list.add(new Student("이름2", "주민2", 2));
		list.add(new Student("이름3", "주민3", 3));
		list.add(new Student("이름4", "주민4", 4));
		return list;
	}
	
}

public class ArrayList_Ex {
	public static void main(String[] args) {
		StudentDao dao = new StudentDao();
		List<Student> list = dao.getStudentDao();
		
		for (Student student : list) {
			System.out.printf("이름 : %s, 주민 : %s, 번호 : %d", student.getName(), student.getSsn(), student.getNum());
			System.out.println();
		}
		
		
		
		List<String> list2 = new ArrayList<>();
		list2.add(null);
		list2.add(null);
		for (Object object : list2) {
			System.out.println(object);
		}
		
		
		
		List<Object> vector = new Vector<>();
		vector.add(null);
		vector.add(null);
		for (Object object : vector) {
			System.out.println(object);
		}
		
		
		
		Map<Object, Object> map = new HashMap<>();
		map.put("구기현", 1);
		map.put(new Bf("최지현1"), 2);
		map.put(new Bf("최지현2"), 3);
		map.put(new Bf("최지현"), 4);
		Set<Object> set = map.keySet();
		for (Object object : set) {
			System.out.println(map.get(object));
		}
	}
}
