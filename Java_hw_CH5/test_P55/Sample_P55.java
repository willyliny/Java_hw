package pa;
import java.io.*;
public class Sample_P55 {
	public static void main(String[] args) {
		Company1 cmp = new Company1();
		Driver1 dv1 = new Driver1(cmp);
		dv1.start();
		Driver1 dv2 = new Driver1(cmp);
		dv2.start();
		
	}
}

class Company1 
{
	private int sum=0;
	public synchronized void add(int a) {
		int tmp = sum;
		System.out.println("�ثe�o�X�p���B�O"+tmp+"��");
		System.out.println("�Ȩ�"+a+"���F");
		tmp = tmp + a;
		System.out.println("�X�p���B�O"+tmp+"��");
		sum=tmp;
	}
}
class Driver1 extends Thread{
	private Company1 comp;
	public Driver1(Company1 c) {
		comp = c;
	}
	public void run() {
		for(int i=0;i<3;i++) {
			comp.add(50);
		}
	}
}
