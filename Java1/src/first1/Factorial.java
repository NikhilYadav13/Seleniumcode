package first1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a,b=1;
		System.out.println("Enter the number     ");
		a=s.nextInt();
		for(int i=1;i<=a;i++)
		{
			b=b*i;
			
			
		}
		
		System.out.println("Factorial is "+b);
	}

}
