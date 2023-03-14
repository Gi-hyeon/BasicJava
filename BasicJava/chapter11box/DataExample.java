package chapter11box;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataExample {
	public static void main(String[] args) {
		
		Date date = new Date(); //과거 문제
		String dateString = date.toString();
		System.out.println(dateString); //우리나라 형식으로 바꾸려면 format해줘야함
		
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd E hh:mm:ss.SSS");
		String format = dateFormat.format(date);
		System.out.println(format);
		
		//---------------------------------------------------------------------------------
		
		Calendar calendar = Calendar.getInstance(); //new보다 더 안전하고 메모리, 보안 측면에서 더 좋다
		int year = calendar.get(Calendar.YEAR);
		int hour = calendar.get(Calendar.HOUR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		int millisecond = calendar.get(Calendar.MILLISECOND);
		int dayOfWeek = calendar.get(Calendar.DATE);
		
		System.out.printf("%4d-%02d-%02d %02d:%02d:%02d.%03d %d ", year, month+1, day, hour, minute, second, millisecond, dayOfWeek);
		
	}
}
