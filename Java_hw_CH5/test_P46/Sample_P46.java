package pa;
import java.io.*;
public class Sample_P46 {
	public static void main(String[] args) {
		Car3 car3 = new Car3("1����");
		car3.start();
		for(int i=0;i<5;i++) {
			System.out.println("���b�i��main()���B�z�u�@");
		}
	}
}

class Car3 extends Thread
{
	private String name;
	public Car3(String num) {
		name = num;
	}
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				sleep(100);
				System.out.println("���b�i��"+name+"���B�z�u�@");
		
			}
			catch(InterruptedException e){
			}
		}
	}
}
