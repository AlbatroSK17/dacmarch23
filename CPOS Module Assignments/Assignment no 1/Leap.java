import java.lang.*;
import java.util.*;

public class Leap{
	public static void main(String args[]){
		Scanner sc=new Scanner (System.in);
	System.out.println("Enter any year");
	int n=sc.nextInt();
	
	if(n%4==0){
		if(n%100==0){
		
		if(n%400==0){
			System.out.println("It is leap year");
	             }
		
	        
			else{
				System.out.println("Not a leap year");
			}
				
	}
}
	}
}
		