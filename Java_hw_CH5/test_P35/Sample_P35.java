package pa;
import java.io.*;

public class Sample_P35 {
	public static void main(String[] args){
		try {
			FileWriter fw = new FileWriter("test1.txt");
			PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
			
			pw.println("hello");
			pw.println("goodbye");
			pw.close();
			
			System.out.println("��Ƥw�g�g�J�ɮפF");
		}
		catch(IOException e)
		{
			System.out.println("��X�J���~");
		}
	}
}
