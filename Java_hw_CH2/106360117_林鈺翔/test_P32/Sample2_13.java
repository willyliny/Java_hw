import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Sample2_13 {
	public static void main(String[] args) throws IOException
	{
		while(true)
		{
			System.out.println("�аݭn�b�ĴX�������j��?(1~10)");
			BufferedReader br = new
					BufferedReader(new InputStreamReader(System.in));
			
			String str = br.readLine();
			int res = Integer.parseInt(str);
			for(int i=1;i<=10;i++)
			{
				System.out.println("��"+i+"�����B�z");
				if(i == res)
				{
					break;
				}
			}
	
		}
	}
}
