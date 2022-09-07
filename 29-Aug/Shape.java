package assignment;

import java.util.Scanner;

abstract class Figure {
	int a;
	int b;

	abstract void area();
}

class Angle extends Figure {
	Angle(int a, int b) {
		super.a = a;
		super.b = b;
	}

	void area() {
		int area = a * b;
		System.out.println("Area of rectangle " + area);

	}
}

class Triangle extends Figure {
	Triangle(int a, int b) {
		super.a = a;
		super.b = b;
	}

	void area() {
		double area = 0.5 * a * b;
		System.out.println("Area of triangle " + area);

	}
}

class Square extends Figure {
	Square(int a) {
		super.a = a;

	}

	void area() {
		int area = a * a;
		System.out.println("Area of square " + area);

	}

}

public class Shape {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE VALUE OF A: ");
		int a = sc.nextInt();
		System.out.println("ENTER THE VALUE OF B: ");
		int b = sc.nextInt();
		Figure a1 = new Angle(a, b);
		Figure a2 = new Triangle(a, b);
		Figure a3 = new Square(a);
		a1.area();
		a2.area();
		a3.area();

	}

}
