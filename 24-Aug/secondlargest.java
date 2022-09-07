package assignment;
import java.util.*;
public class secondlargest {
	public static void main(String args[]) {
		 int n;
	    	Scanner scan=new Scanner(System.in);
	    	n=scan.nextInt();
	    	int arr[]=new int[n];    	    	
	    	for(int i=0;i<n;i++) {
	    		arr[i]=scan.nextInt();
	    	}
	    	Arrays.sort(arr);
	    	int largest=arr[n-2];
	    	System.out.println("second largest array="+ largest);
	    	
	}

}
