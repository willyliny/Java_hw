package pa;

public class Sample_P44 {
	public static void main(String[] args) {
		Car1 car1 = new Car1("1����");
		car1.start();
		for(int i=0;i<5;i++) {
			System.out.println("���b�i��main()���B�z�u�@");
		}
	}
}

class Car1 extends Thread
{
	private String name;
	public Car1(String num) {
		name = num;
	}
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("���b�i��"+name+"���B�z�u�@");
		}
	}
}
