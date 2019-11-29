package pa;
import java.io.*;
public class Sample_p47 {
	public static void main(String[] args) {
		Car4 car4 = new Car4("1號車");
		car4.start();
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
				System.out.println("正在進行main()的處理工作");
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
				System.out.println("正在進行"+name+"的處理工作");
		}
	}
}
