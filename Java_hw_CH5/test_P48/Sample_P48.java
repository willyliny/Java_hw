package pa;
import java.io.*;
public class Sample_P48 {
	public static void main(String[] args) {
		Car5 car5 = new Car5("1����");
		car5.start();
		for(int i=0;i<5;i++) {
			try {
				car5.join();
			}
			catch(InterruptedException e) {
			}
			System.out.println("����ain()���B�z�u�@");
		}
	}
}

class Car5 extends Thread
{
	private String name;
	public Car5(String num) {
		name = num;
	}
	public void run() {
		for(int i=0;i<5;i++) {
				System.out.println("���b�i��"+name+"���B�z�u�@");
		}
	}
}
