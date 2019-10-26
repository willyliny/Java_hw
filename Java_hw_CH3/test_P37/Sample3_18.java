import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Sample3_18 {
	public static void main(String[] args) throws IOException
	{
		System.out.println("請輸入英文字母");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String stru = str1.toUpperCase();
		String stri = str1.toLowerCase();
		System.out.println("轉成大寫時為"+stru);
		System.out.println("轉成小寫時為"+stri);
	}
}
