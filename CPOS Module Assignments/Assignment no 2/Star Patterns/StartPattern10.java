import java.util.*;

public class StartPattern10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n=sc.nextInt();
		
		for(int i=0;i<=n;i++){
			for(int j=1;j<n-i+1;j++){
			 System.out.print(" ");
			}
			for(int j=1;j<=n;j++){
				 System.out.print("*");
			}
			System.out.println();
		}
		
	}
}