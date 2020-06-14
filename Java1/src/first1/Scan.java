package first1;

import java.util.Scanner;

public class Scan {
	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("Sum is "+c);
		return c;
	
	}
	public int sub(int x,int y)
	{
		int z;
		z=x-y;
		System.out.println("sub is "+z);
		return z;
	
	}
	public int mul(int a1,int b1)
	{
		int c1;
		c1=a1*b1;
		System.out.println("Sum is "+c1);
		return c1;
	
	}
	public void div(int m,int n)
	{
		int o;
		o=m/n;
		System.out.println("final result is "+o);
		System.out.println("print");
	}
	
	public static void main(String[] args) {
		
		Scan n=new Scan();
	    Scanner s= new Scanner(System.in);
		System.out.println("Enter the value of x1  :");
		int x1=s.nextInt();
		System.out.println("Enter the value of x2  :");
		int x2=s.nextInt();
		int sum1= n.sum(x1, x2);
		System.out.println("Enter the value of x3   :  ");
		int x3=s.nextInt();
		int sub1=n.sub(sum1, x3);
		System.out.println("Enter the value of x4   :  ");
		int x4=s.nextInt();
		int sum2=n.sum(sub1, x4);
		System.out.println("Enter the value of x5   :  ");
		int x5=s.nextInt();
		int mul1=n.mul(sum2, x5);
		System.out.println("Enter the value of x6   :  ");
		int x6=s.nextInt();
		n.div(mul1, x6);
		
		
	}

}
