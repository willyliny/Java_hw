import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Sample3_18 {
	public static void main(String[] args) throws IOException
	{
		System.out.println("�п�J�^��r��");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String stru = str1.toUpperCase();
		String stri = str1.toLowerCase();
		System.out.println("�ন�j�g�ɬ�"+stru);
		System.out.println("�ন�p�g�ɬ�"+stri);
	}
}
