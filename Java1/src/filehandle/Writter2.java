package filehandle;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Writter2 {
	public void m1(int r,int c) throws IOException
	{
		File f=new File("C:\\Users\\nikhil.yadav\\Desktop\\nikhil.txt");
		FileWriter fw =new FileWriter(f);
		BufferedWriter bw =new BufferedWriter(fw);
		String s;
		Scanner scan =new Scanner(System.in);
		for (int i=1;i<=c;i++)
		{
			if ((i>=r)&&(i<=c))
			{
				System.out.println("Enter the data  ");
				s=scan.next();
				bw.write(s);
				bw.newLine();
			}
			else
			{
				bw.write("");
				bw.newLine();
			}
		}
		bw.close();
		
		
	}

	public static void main(String[] args) throws IOException {
		Writter2 q =new Writter2();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the from value ");
		int r= sc.nextInt();
		System.out.println("Enter the till value ");
		int c= sc.nextInt();
		q.m1(r,c);
	}

}
