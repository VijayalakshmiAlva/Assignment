package assignment;
import java.util.*;

class Invoice{
	String number;
	String description;
	int quantity;
	double price;
	
Invoice(String n,String d,int q,double p){
	if(q<0) {
		q=0;
	}
	if(p<0) {
		p=0;
	}
	
	number=n;
	description=d;
	quantity=q;
	price=p;
	
}
void setDetails(String n,String d,int q,double p) {
	if(q<0) {
		q=0;
	}
	if(p<0) {
		p=0;
	}
	this.number=n;
	this.description=d;
	this.quantity=q;
	this.price=p;
}  

String getNumber() {
	return number;
}
String getDescription() {
	return description;
}
int getQuantity() {
	return quantity;
}
double getPrice() {
	return price;
}
double getInvoice() {
	double amount=quantity*price;
	return amount;
}

}
public class Hardware {
          public static void main(String args[]) {
        	  Invoice a=new Invoice("GO0T76","Head phone",-1,500);
        	  //a.setDetails("hse64t","phone",3,15000);
        	  System.out.println("number of the product "+a.getNumber());
        	  System.out.println("number of the product "+a.getDescription());
        	  System.out.println("number of the product "+a.getQuantity());
        	  System.out.println("number of the product "+a.getPrice());
        	  System.out.println("number of the product "+a.getInvoice());
          }
}
