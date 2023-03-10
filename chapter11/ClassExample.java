package chapter11;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassExample {
	public static void main(String[] args) throws Exception {
//		Reflection -> 찾아보기
//		Reflection을 사용하면 private한 파일들도 전부 볼 수 있다 ex)안보이던 객체들도 보인다 -> 색있는 물컵도 보여진다.
		
		Class clazz = Member.class;
		Class clazz2 = Class.forName("chapter11.Member");
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage().getName());
		
		//getfield는 public 멤버들만 가져온다 / getDeclared private한 애들도 다 데리고온다
		Constructor[] constructors = clazz.getConstructors();
		Member member = null;
		for(Constructor constructor : constructors) {
			member = (Member) constructor.newInstance("1");
		}
		
		
		Field[] fields = clazz.getDeclaredFields();
		for(Field field : fields) {
			System.out.println("필드 명: " + field.getName());
			System.out.println("필드 타입: " + field.getType());
			field.setAccessible(true);
			field.set(member, "123");
		}
		
		Method[] methods = clazz.getDeclaredMethods();
		for(Method method : methods) {
			System.out.println("필드 명: " + method.getName());
			System.out.println("필드 타입: " + method.getReturnType());
		}
		
//		Member member = new Member("1");
		System.out.println(member.getId());
	}
}
