import java.lang.*;
import java.util.*;

public class Printdigit{
	public static void main(String args[]){
		Scanner sc=new Scanner (System.in);
                System.out.println("Enter a number");
                int digit;
                int n=sc.nextInt();
                while(n>0){
                    digit=n%10;
                    System.out.println(" ");
                    System.out.println(digit);
                    n=n/10;
                }
        }
}