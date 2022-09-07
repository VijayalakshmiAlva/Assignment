package assignment;

import java.util.Scanner;

class Student {
	String name;
	String rollNumber;

	Student(String name, String rollNumber) {
		this.name = name;
		this.rollNumber = rollNumber;
	}

	void show() {
		System.out.println("Student name is: " + name + " " + "and roll number " + rollNumber);
	}
}

class Test extends Student {
	int mathMarks;
	int englishMarks;
	int kannadaMarks;

	Test(String name, String rollNumber, int mathMarks, int englishMarks, int kannadaMarks) {
		super(name, rollNumber);
		this.mathMarks = mathMarks;
		this.englishMarks = englishMarks;
		this.kannadaMarks = kannadaMarks;
	}

	void show_marks() {
		System.out.println("Marks obtained in maths " + mathMarks);
		System.out.println("Marks obtained in english " + englishMarks);
		System.out.println("Marks obtained in kannada " + kannadaMarks);
	}
}

interface Sports {
	int SPORT_MARKS = 15;

	static void show_sportswt() {
		System.out.println("sport marks " + SPORT_MARKS);
	}
}

class Result extends Test implements Sports {

	Result(String name, String rollNumber, int mathMarks, int englishMarks, int kannadaMarks) {
		super(name, rollNumber, mathMarks, englishMarks, kannadaMarks);

	}

	void result() {
		double avg = (mathMarks + englishMarks + kannadaMarks) / 3;
		double total = avg + SPORT_MARKS;
		System.out.println("total marks obtained form the student " + total);
	}

}

public class Details {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String name;
		String rollNumber;
		int english;
		int kannada;
		int maths;
		System.out.println("Enter the name of the student :");
		name = sc.next();
		System.out.println("Enter the roll number of the student :");
		rollNumber = sc.next();
		System.out.println("Enter the marks obtained in maths :");
		maths = sc.nextInt();
		System.out.println("Enter the marks obtained in english :");
		english = sc.nextInt();
		System.out.println("Enter the marks obtained in kannada :");
		kannada = sc.nextInt();
		Result a2 = new Result(name, rollNumber, maths, english, kannada);
		a2.result();
		a2.show();
		a2.show_marks();

	}

}


















