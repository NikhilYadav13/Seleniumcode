package first1;

import java.util.Scanner;

public class Fibnacci {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int a=0,b=1,c;
		System.out.println("Enter the number for series    ");
		 c=s.nextInt();
		 for (int i=0;i<=c;i++)
		 {
			 System.out.println(a+ "");
			 int sum =a+b;
			 a=b;
			 //System.out.println("Value of a  "+a);
			 b=sum;
			 //System.out.println("Value of b  "+b);
			 
		 }		
		 

	}

}
