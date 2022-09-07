package assignment;
import java.util.*;
public class swap {
	public static void main(String args[]) {
		int a;
		int b;
		Scanner scan=new Scanner(System.in);
    	a=scan.nextInt();
    	b=scan.nextInt();
    	int temp=a;
    	a=b;
    	b=temp;
    	System.out.println("a="+a);
    	System.out.println("b="+b);
	}

}
