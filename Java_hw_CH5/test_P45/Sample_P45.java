package pa;

public class Sample_P45 {
	public static void main(String[] args) {
		Car2 car1 = new Car2("1����");
		car1.start();
		Car2 car2 = new Car2("2����");
		car2.start();
		for(int i=0;i<5;i++) {
			System.out.println("���b�i��main()���B�z�u�@");
		}
	}
}

class Car2 extends Thread
{
	private String name;
	public Car2(String num) {
		name = num;
	}
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("���b�i��"+name+"���B�z�u�@");
		}
	}
}