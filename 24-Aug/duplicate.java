package assignment;

import java.util.Scanner;

public class duplicate {
	public static void main(String args[]) {
		int n;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		String arr[] = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.next();
		}
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if ((arr[i].equals(arr[j])) && (i != j)) {
					System.out.println("duplicate values=" + arr[i]);
				}

			}
		}
	}
}
