package first1;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a,b=0;
		System.out.println("Enter the number     ");
		a=s.nextInt();
		for (int i=2;i<=a-1;i++)
		{
			if(a%i==0)
			{
				b=b+1;
				
			}
			
		}
		if (b>0)
		{
			System.out.println("Number is not prime");
		}
		else
		{
			System.out.println("Number is prime");
			
		}

	}

}
