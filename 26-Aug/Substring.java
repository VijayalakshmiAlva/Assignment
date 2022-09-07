package assignment;

import java.util.Scanner;

public class Substring {
	public static void main(String args[]) {
		String s[] = new String[2];
		for (int i = 0; i < 2; i++) {
			Scanner scan = new Scanner(System.in);
			s[i] = scan.next();
		}
		for (int i = 0; i < 2; i++) {
			String s1 = s[i].substring(0, 2);
			System.out.println(s1);
		}

	}
}
