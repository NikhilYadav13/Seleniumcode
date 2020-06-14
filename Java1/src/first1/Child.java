package first1;

import java.util.Scanner;

public class Child extends Parent {
	 public Child()
	 {
		 System.out.println("This is child constructor");
	 }
	 public void sum(int x, char y)
	 {
		 int y1,z;
		 y1=y;
		 z=x+y1;
			System.out.println("Sum of Interger and charter  "+z);
	 }	 
	 public static void main(String[] args) {
		 Child c = new Child();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of a  :");
		int a=s.nextInt();
		System.out.println("Enter the value of b  :");
		int b=s.nextInt();
		c.sum(a, b);
		System.out.println("Enter the value of a1  :");
		int a1=s.nextInt();
		System.out.println("Enter the value of b1  :");
		float b1=s.nextFloat();
		c.sum(a1, b1);
		System.out.println("Enter the value of a2  :");
		int a2=s.nextInt();
		System.out.println("Enter the value of b2  :");
		char b2=s.next().charAt(0);
		c.sum(a2, b2);
		
		
		
		
		 
		
	}
	

	

}
