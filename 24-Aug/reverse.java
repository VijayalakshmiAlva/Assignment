package assignment;

import java.util.Scanner;

public class reverse {
	public static void main(String args[]) {
		int n;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();

		}
		for (int i = n - 1; i >= 0; i--) {
			System.out.println(arr[i]);

		}
	}
}
