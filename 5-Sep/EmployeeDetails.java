package sep5;
import java.util.ArrayList;
import java.util.List;

class Employee{
	String name;
	int id;
	int salary;
	
Employee(String name,int id,int salary){
	this.name=name;
	this.id=id;
	this.salary=salary;
}




}
public class EmployeeDetails {
	public static void main(String args[]) {
		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee("vijaya",5,5000));
		list.add(new Employee("vinu",6,9000));
		list.add(new Employee("sanio",7,8000));
		
		//List<Integer> list2=list.stream().filter(s-> s.salary>15000).collect(Collectors.toList())
		/*list.stream().filter(s->s.salary>15000)
		.collect(Collectors.toList())
		.forEach((name)->System.out.println(name.name))
		.l*/
		
		list.stream().filter(s->s.salary>15000).forEach(n->System.out.println("employee details of having salary above 15k :"+n.name+" "+n.id+" "+n.salary));
		list.stream().filter((i)-> i.name.startsWith("v")).forEach(n->System.out.println("Name stats with v= "+n.name));
		Employee employeeB=list.stream().max((s1,s2)->s1.salary>s2.salary?1:-1).get();
		System.out.println("maxmimum salary :"+employeeB.salary);
		long total=list.stream().count();
		System.out.println("Total number of employee "+total);
		list.stream().filter(n1->n1.name.length()>4).forEach(n->System.out.println("Employee names greater than 4 :"+n.name));
		list.stream().sorted((n1,n2)->n1.name.compareTo(n2.name)).forEach(n->System.out.println("sorted employee details :"+n.name+" "+n.id+" "+n.salary));
	}
	

}
