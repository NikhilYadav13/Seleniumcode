package filehandle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\nikhil.yadav\\Desktop\\nikhil.txt");
		FileReader fr =new FileReader(f);
		BufferedReader br =new BufferedReader(fr);
		String a;
		File fi=new File("C:\\Users\\nikhil.yadav\\Desktop\\nikhil1.txt");
		FileWriter fw =new FileWriter(fi);
		BufferedWriter bw =new BufferedWriter(fw);
		while ((a=br.readLine())!=null)
		{
			System.out.println(a);
			bw.write(a);
			bw.newLine();
			
		}
		bw.close();

	}

}
