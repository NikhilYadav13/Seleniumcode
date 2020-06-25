package filehandle;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;




public class writter1 {
	public void writedata1(int r) throws IOException
	{
		File f=new File("C:\\Users\\nikhil.yadav\\Desktop\\nikhil.txt");
		FileWriter fw =new FileWriter(f);
		BufferedWriter bw =new BufferedWriter(fw);
		String s;
		Scanner scan= new Scanner(System.in);
		for(int i=1;i<=r;i++)
		{
		   System.out.println("enter the data  ");
		   String d=scan.nextLine();
		   bw.write(d);
		   bw.newLine();
		}
		bw.close();
		
	}

	public static void main(String[] args) throws IOException {
		writter1 q =new writter1();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the from value ");
		int r= sc.nextInt();
		q.writedata1(r);

	}

}
