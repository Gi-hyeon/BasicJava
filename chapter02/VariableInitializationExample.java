package chapter02;

public class VariableInitializationExample {
	public static void main(String[] args) {
		int hour = 3;
	   	int minute = 5;
	   	 
	   	int totalMinute = (60*hour) + minute;
	   
	    System.out.println(hour + "시간" + minute + "분");
	    System.out.println("총 " + totalMinute + "분");
	}
}
