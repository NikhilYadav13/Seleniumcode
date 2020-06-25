package filehandle;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Writer1 {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\nikhil.yadav\\Desktop\\nikhil.txt");
		FileWriter fw =new FileWriter(f);
		BufferedWriter bw =new BufferedWriter(fw);
		bw.write("First line");
		bw.newLine();
		bw.write("second line");
		bw.newLine();
		bw.write("third line");
		bw.newLine();
		bw.write("fourth line");
		bw.newLine();
		bw.close();
	}

}
