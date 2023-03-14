package chapter11box;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateSimpleDateFormat {
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분");
		String format = simpleDateFormat.format(date);
		System.out.println(format);
		
		
		
		String format1 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 hh시 mm분"));
		System.out.println(format1);
	}
}
