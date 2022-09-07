package p1;

import java.util.Arrays;

public class MinimumArrayValue {
	int arr[] = new int[8];

	public void minArray(int arr[]) {
		Arrays.sort(arr);
		int min = arr[0];
		System.out.println("Minimum element in the array " + min);
	}

	public void multiplyArray(int arr[]) {
		int n = 3;

		for (int i = 0; i < arr.length; i++) {
			
			System.out.println("Multiplied value of array " + arr[i] * n);
		}
		
	}

}
