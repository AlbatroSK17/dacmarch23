import java.lang.*;
import java.util.*;

public class Factorial{
	public static void main(String args[]){
		Scanner sc=new Scanner  (System.in);
		System.out.println("Enter a number");
		
		int i, n,fact=1;
		n=sc.nextInt();
		for(i=n;i>=1;i--)
		{
			fact=fact*i;
		}
	System.out.println("Factorial of a given number is "+fact);
}
}