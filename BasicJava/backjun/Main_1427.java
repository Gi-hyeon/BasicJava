package backjun;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main_1427 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String arr = scanner.nextLine();
		char[] str = arr.toCharArray();
		
		Arrays.sort(str);
		System.out.println(str.length);
		for(int i=str.length-1; i>=0; i--) {
			System.out.printf("%c",str[i]);
		}
		
		scanner.close();
	}
}
