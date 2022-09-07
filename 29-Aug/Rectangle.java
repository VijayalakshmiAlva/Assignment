package assignment;

import java.util.Arrays;
import java.util.Scanner;

class Area {
	int height;
	int width;

	Area(int h, int w) {
		height = h;
		width = w;
	}

	int getArea() {
		return height * width;
	}

}

public class Rectangle {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("enter number of iterations :");
		n = sc.nextInt();
		int arr[] = new int[n];
		Area a[] = new Area[n];
		for (int i = 0; i < n; i++) {
			System.out.println("enter height :");
			int h = sc.nextInt();
			System.out.println("enter width :");
			int w = sc.nextInt();
			a[i] = new Area(h, w);
			arr[i] = a[i].getArea();
			System.out.println("area of rectangle " + arr[i]);
		}

		Arrays.sort(arr);
		int min = arr[0];
		int max = arr[n - 1];
		System.out.println("The minimum value " + min + "  maximun " + max);

		for (int i = 0; i < n; i++) {
			if (max == a[i].getArea()) {
				System.out.println("Height and width of maximum area " + a[i].height + " " + a[i].width);
				break;

			}
		}
		for (int i = 0; i < n; i++) {
			if (min == a[i].getArea()) {
				System.out.println("Height and width of minimum area " + a[i].height + " " + a[i].width);
				break;
			}
		}
	}
}
