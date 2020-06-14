package first1;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a,b=0;
		System.out.println("Enter the number     ");
		a=s.nextInt();
		for(int i=1;i<=10;i++)
		{
			b=a*i;
			System.out.println("Table is "+b);
		}
		

	}

}
