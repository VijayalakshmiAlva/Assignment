package assignment;
import java.util.*;

public class Function {
	public static void main(String args[]) {
		int size ;
		Scanner scan=new Scanner(System.in);
		size=scan.nextInt();
		String s[]=new String[size];
		for(int i=0;i<size;i++) {
			s[i]=scan.next();
		}
		int count=1;
		for(int i=0;i<size-1;i++) {
			for(int j=i+1;j<size;j++) {
				if(s[i].equalsIgnoreCase(s[j]) && (i!=j)) {
					System.out.println("duplicate striing "+s[i]);
				}
			}	
		}
	}
        
}
