package first1;

import java.util.Scanner;

public class Swap {
	
	

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int a,b;
		System.out.println("Enter the value of a   ");
		 a=s.nextInt();
		System.out.println("Enter the value of b   ");
		 b=s.nextInt();
		 a=a+b;
		 b=a-b;
		 a=a-b;
		
		System.out.println("Number after swapping  "+a);
		System.out.println("Number after swapping  "+b);

		
		
		

	}

}
