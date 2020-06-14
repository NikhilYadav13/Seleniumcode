package first1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int r,reverse=0,c,d;
		System.out.println("Enter the number     ");
		 c=s.nextInt();
		 d=c;
		 while(c>0) {
			 //System.out.println("print");
			 r=c%10;
			 reverse=(reverse*10)+r;
			 c=c/10;
		}
		 System.out.println("Reverse number is "+reverse);
		 if (d==reverse) {
		 
			 System.out.println("Number is palindrome");
		 }
		 else
		 {
			 System.out.println("Number is not palindrome");
		 }
		 

	}

}
