package assignment;

import java.util.Scanner;

class MarkException extends Exception {
	MarkException() {
		super();
	}
}
  
public class Marks {
public	static void main(String args[]) { 
		
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the internal marks :");
			int internalMarks = sc.nextInt();
			System.out.println("enter the external marks :");
			int externalMarks = sc.nextInt();
    try {
      if(internalMarks>40) {
    	  throw new MarkException();
      }
		} catch (MarkException e) {
			System.out.println("internal marks exceed");
		}   
    try {
        if(externalMarks>60) {
        	 throw new MarkException();
        }
  		} catch (MarkException e) {
  			System.out.println("external marks exceed");
  		} 
	}
}




