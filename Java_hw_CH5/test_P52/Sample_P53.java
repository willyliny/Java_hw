package pa;
import java.io.*;
public class Sample_P53 {
	public static void main(String[] args) {
		Company cmp = new Company();
		Driver dv1 = new Driver(cmp);
		dv1.start();
		Driver dv2 = new Driver(cmp);
		dv2.start();
		
	}
}

class Company 
{
	private int sum=0;
	public void add(int a) {
		int tmp = sum;
		System.out.println("�ثe�o�X�p���B�O"+tmp+"��");
		System.out.println("�Ȩ�"+a+"���F");
		tmp = tmp + a;
		System.out.println("�X�p���B�O"+tmp+"��");
		sum=tmp;
	}
}
class Driver extends Thread{
	private Company comp;
	public Driver(Company c) {
		comp = c;
	}
	public void run() {
		for(int i=0;i<3;i++) {
			comp.add(50);
		}
	}
}
