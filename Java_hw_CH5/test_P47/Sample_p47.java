package pa;
import java.io.*;
public class Sample_p47 {
	public static void main(String[] args) {
		Car4 car4 = new Car4("1����");
		car4.start();
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
				System.out.println("���b�i��main()���B�z�u�@");
			}
			catch(InterruptedException e) {
			}
		}
	}
}

class Car4 extends Thread
{
	private String name;
	public Car4(String num) {
		name = num;
	}
	public void run() {
		for(int i=0;i<5;i++) {
				System.out.println("���b�i��"+name+"���B�z�u�@");
		}
	}
}
