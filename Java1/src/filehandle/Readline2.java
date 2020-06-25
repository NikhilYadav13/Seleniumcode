package filehandle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Readline2 {
	public  void readdata1(int r,int c) throws IOException
	{
		File f=new File("C:\\Users\\nikhil.yadav\\Desktop\\nikhil.txt");
		FileReader fr =new FileReader(f);
		BufferedReader br =new BufferedReader(fr);
		String a;
		int b=0;
		while ((a=br.readLine())!=null)
        {
			b=b+1;
			if ((b>=r)&&(b<=c))
			
			{
				
				System.out.println(a);
			}
		}
				
				
			
        	
        }

	public static void main(String[] args) throws IOException {
		Readline2 q =new Readline2();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the from value ");
		int r= sc.nextInt();
		System.out.println("Enter the till value ");
		int c= sc.nextInt();
		q.readdata1(r,c);
		//q.readdata1(c);
		
	}

}
