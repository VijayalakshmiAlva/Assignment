package sep6;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
public class DateTime {
	private static LocalDate MonthDay;

	public static void main(String[] args) {
		LocalDate d=LocalDate.now();
	    System.out.println("Today's date :"+d);
	     
	    
	    
	    System.out.println("Current day :"+d.getDayOfWeek());
	    System.out.println("Current date :"+d.getDayOfMonth());
	    System.out.println("Current month :"+d.getMonth());
	    System.out.println("Current year :"+d.getYear());
	    
		LocalDate d1=LocalDate.of(2000, 9, 26);
		System.out.println("My Birthday :"+d1);
		
		System.out.println("Dates are equal? "+(d1.compareTo(d)==0));
		
		LocalTime t= LocalTime.now();
		System.out.println("Today's time :"+t );
		
		System.out.println("date after one year :"+d.plusYears(1));
		System.out.println("date before one year :"+d.minusYears(1));
		
		System.out.println("add hours to time :"+t.plusHours(1));
		
		Scanner sc=new Scanner(System.in);
		int year1=sc.nextInt();
		LocalDate d11=d.withYear(year1);
		System.out.println(d11);
		boolean bool=d11.isLeapYear();
		if(bool) {
			System.out.println("leap year");
		}else {
			System.out.println("not leap year");
		}
		
		int day=sc.nextInt();
		int month=sc.nextInt();
		int year=sc.nextInt();
		LocalDate birthday=LocalDate.of(year, month, day);
		if(d1.equals(birthday)) {
			System.out.println("Today is my birthday");
		}else {
			System.out.println("not my birthday");
		}
		
		
	}
   
}
