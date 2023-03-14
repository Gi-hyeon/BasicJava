package chapter11box;

public class StringConvertExample {
	public static void main(String[] args) {
		String strData1 = "200";
		int intData = Integer.valueOf(strData1);
		System.out.println(intData);
		
		int intData2 = 150;
//		String strData2 = String.valueOf(intData2);
		String strData3 = intData2 + "";
		System.out.println(strData3);
	}
}
