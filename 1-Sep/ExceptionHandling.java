package assignment;

import java.util.Scanner;

class CustomException extends Exception {
	CustomException(String str) {
		super(str);
	}  

}

public class ExceptionHandling {
	static void displaySum(int sum) throws CustomException {
		if (sum > 100) {
			throw new CustomException("Sum is invalid");
		} else {
			System.out.println("sum is " + sum);
		}
	}

	public static void main(String args[]) {
		try {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			int sum = a + b;
			displaySum(sum);
		} catch (CustomException e) {
			System.out.println("caught the exception");
			System.out.println("Exception occurred " + e);
		}
	}
}