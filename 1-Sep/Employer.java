package assignment;

import java.util.LinkedList;
import java.util.Scanner;

class Employee {
	String name;
	String id;
	int salary;

	Employee(String name, String id, int salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
}

public class Employer {
	public static void main(String args[]) {
		LinkedList<Employee> list = new LinkedList<Employee>();
		Scanner sc = new Scanner(System.in);
		Employee e;
		int choice;
		while(true) {
			System.out.println("enter the choices");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("enter the employee name :");
				String name = sc.next();
				System.out.println("enter the employee id ");
				String id = sc.next();
				System.out.println("enter the salary ");
				int salary = sc.nextInt();
				e = new Employee(name, id, salary);
				list.add(e);
				break;
			case 2:
				System.out.println("enter the employee id to be deleted ");
				String employee_id = sc.next();
				Employee s = null;
				for (Employee i : list) {
					if (i.id.equals(employee_id)) {
						s = i;

					}
				}
				if (s != null) {
					list.remove(s);
				} else {

					System.out.println("no id to be deleted");
				}
				break;
			case 3:
				for(Employee i : list) {
					System.out.print(i.name + "" + i.id + " " + i.salary);
					
				}
				break;
			}
		} 
	}
}
