import java.lang.*;
import java.util.*;

public class Swap{
	public static void main(String args[]){
		Scanner sc=new Scanner (System.in);
	System.out.println("Enter first numbers");
		int a=sc.nextInt();
	System.out.println("Enter second numbers");
		int b=sc.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("swapped numbers are  "+a+"  " +b);
		
	}
}