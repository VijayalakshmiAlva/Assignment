package assignment;

import java.util.Scanner;

public class Replace {
	public static void main(String args[]) {
		String string;
		String substring;

		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string ");
		string = scan.next();
		System.out.println("enter a sub string ");
		substring = scan.next();
		System.out.println("enter the index ");
		int index = substring.indexOf(substring);
		StringBuilder s = new StringBuilder(substring);
		s.setCharAt(index, 'l');
		System.out.println(s);

	}

}



