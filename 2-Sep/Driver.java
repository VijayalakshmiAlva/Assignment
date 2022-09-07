package mypack;

import java.util.Scanner;

import p1.MinimumArrayValue;

public class Driver {
	public static void main(String args[]) {
		MinimumArrayValue obj = new MinimumArrayValue();
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[8];
		System.out.println("enter the array :");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		obj.multiplyArray(arr);
		obj.minArray(arr);  
		//obj.multiplyArray(arr); 

	}
}
