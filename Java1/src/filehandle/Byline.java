package filehandle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Byline {
	public  void readdata(int ln) throws IOException
	{
		File f=new File("C:\\Users\\nikhil.yadav\\Desktop\\nikhil.txt");
		FileReader fr =new FileReader(f);
		BufferedReader br =new BufferedReader(fr);
		String a;
		int b=0;
		while ((a=br.readLine())!=null)
        {
			b=b+1;
			if (b==ln)
			{
				//a=br.readLine();
				System.out.println(a);
				break;
			}
			
        	
        }
		//System.out.println("No data found");

	}

	public static void main(String[] args) throws IOException {
		Byline r =new Byline();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the line number");
		int ln= sc.nextInt();
		r.readdata(ln);
		
	}

	}


