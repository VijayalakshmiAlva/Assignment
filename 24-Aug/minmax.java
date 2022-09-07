package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class minmax {
	public static void main(String args[]) {
		int n;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		Arrays.sort(arr);
		int min = arr[0];
		int max = arr[n - 1];
		System.out.println("minimum " + min);
		System.out.println("maximum " + max);
	}
}
