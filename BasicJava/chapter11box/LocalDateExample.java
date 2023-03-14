package chapter11box;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateExample {
	public static void main(String[] args) {
		//LocalDate => 날짜만 사용 가능
		//LocalDateTime => 날짜와 시간도 사용 가능
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
//		method chaining 방식 .을 찍어 할수있다.
		String format = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd E hh:mm:ss.SSS"));
		System.out.println(format);
		
		
	}
}
