import java.util.Scanner;

public class Hello {
     public static void main(String[] args) {
    	 int hour = 3;
    	 int minute = 5;
    	 
    	 int totalMinute = (60*hour) + minute;
    
    	 System.out.println(hour + "시간" + minute + "분");
         System.out.println("총 " + totalMinute + "분");
         
         Scanner in = new Scanner(System.in);
         
         String str1 = in.next();
         String str2 = in.next();
         in.nextLine();
         String str3 = in.nextLine();
         String str4 = in.nextLine();
         
         System.out.println(str1); //공백 또는 줄바꿈까지 읽는다.
         System.out.println(str2);
         System.out.println(str3);
         System.out.println(str4);

         Scanner iin = new Scanner(System.in);
         
         int valueThme = iin.nextInt();
         
         System.out.println(valueThme);
     }
}