import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Sample2_5_P14 {
	public static void main(String[] args) throws IOException
	{
		while(true)
		{
			System.out.println("�п�J���");
			BufferedReader br = 
					new BufferedReader (new InputStreamReader(System.in));
			int num = Integer.parseInt(br.readLine());
			switch(num)
			{
				case 1:
				{
					System.out.println("��J���O1");
					break;
				}
				case 2:
				{
					System.out.println("��J���O2");
					break;
				}
				default:
				{
					System.out.println("�п�J1 or 2");	
					break;
				}
			}
		}
	}
}
