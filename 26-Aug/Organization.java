package assignment;

class Member {
	String name;
	int age;
	int phoneNumber;
	int salary;

	public void Member(String n, int a, int p, int s) {
		name = n;
		age = a;
		phoneNumber = p;
		salary = s;
	}

	void printSalary() {
		System.out.println("Salary of employee " + salary);
	}
}

class EmployeeOrgaization extends Member {
	String specialization;

	public void EmployeeOrgaization(String n, int a, int p, int s, String spe) {
		this.name = n;
		this.age = a;
		this.phoneNumber = p;
		this.salary = s;
		specialization = spe;

	}

	void printSalary() {
		System.out.println("DFepartment " + salary);
	}
}

class Manager extends Member {
	String department;

	public void Manager(String n, int a, int p, int s, String de) {
		this.name = n;
		this.age = a;
		this.phoneNumber = p;
		this.salary = s;
		this.department = de;
	}

	void printDep() {
		System.out.println("DFepartment " + department);
	}
}

public class Organization {
	public static void main(String args[]) {
		EmployeeOrgaization obj1 = new EmployeeOrgaization();
		Manager obj2 = new Manager();
		obj1.EmployeeOrgaization("Vijayalakshmi", 22, 5896562, 20000, "Java");
		obj2.Manager("Vijayalakshmi", 22, 5896562, 20000, "athletic");
		obj1.printSalary();
		obj2.printDep();
	}

}
