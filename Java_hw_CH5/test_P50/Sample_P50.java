package pa;
import java.io.*;
public class Sample_P50 {
	public static void main(String[] args) {
		Car6 car6 = new Car6("1號車");
		Thread th1 = new Thread(car6);
		th1.start();
		for(int i=0;i<5;i++) {
			System.out.println("正在進行main()的處理工作");
		}
	}
}

class Car6 implements Runnable
{
	private String name;
	public Car6(String num) {
		name = num;
	}
	public void run() {
		for(int i=0;i<5;i++) {
				System.out.println("正在進行"+name+"的處理工作");
		}
	}
}
