package first1;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int r,reverse=0,c,d;
		System.out.println("Enter the number     ");
		 c=s.nextInt();
		 d=c;
		 while(c>0) {
			 //System.out.println("print");
			 r=c%10;
			 reverse=reverse+r*r*r;
			 c=c/10;
		}
		 if (d==reverse) {
			 
			 System.out.println("Number is Armstrong");
		 }
		 else
		 {
			 System.out.println("Number is not Armstrong");
		 }
		 
	}

}
