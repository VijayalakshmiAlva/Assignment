package assignment;
import java.util.*;
public class sort {
	 public static void main(String args[]) {
		 int n;
	    	Scanner scan=new Scanner(System.in);
	    	n=scan.nextInt();
	    	int arr[]=new int[n];    	    	
	    	for(int i=0;i<n;i++) {
	    		arr[i]=scan.nextInt();
	    	}
	    	
	    	for(int i=0;i<n;i++) {
	    		for(int j=i+1;j<n;j++) {
	    		if(arr[i]>arr[j]) {
	    			int temp=arr[i];
	    			arr[i]=arr[j];
	    			arr[j]=temp;
	    		}
	    		}
	    	}
	    	for(int i=0;i<n;i++) {
	    		System.out.println(arr[i]); 
	    	}
	 }
}
