package assignment;

import java.util.Scanner;

public class Merge {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the string 1 ");
		StringBuilder str1 = new StringBuilder(sc.next());

		System.out.println("enter the string 2 ");
		StringBuilder str2 = new StringBuilder(sc.next());

		StringBuilder merge = new StringBuilder();

		for (int i = 0; i < str1.length(); i++) {
			if (Character.isUpperCase(str1.charAt(i))) {
				merge.append(str1.charAt(i));

			}
		}
		for (int j = 0; j < str2.length(); j++) {
			if (Character.isUpperCase(str2.charAt(j))) {
				merge.append(str2.charAt(j));

			}
		}

		System.out.println(merge);
	}

}
