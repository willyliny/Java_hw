import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Sample2_4 {
	public static void main(String[] args) throws IOException
	{
		while(true)
		{
			System.out.println("�п�J���");
			BufferedReader br = 
					new BufferedReader (new InputStreamReader(System.in));
			int num = Integer.parseInt(br.readLine());
			if(num == 1)
			{
				System.out.println("��J���O1");
			}
			else if(num ==2)
			{
				System.out.println("��J���O2");
			}
			else
			{
				System.out.println("�п�J1 or 2");	
			}
		}
	}
}
