public class Sample4_7 {
	public static void main(String[] args) {
		Car7 car1;
		car1 = new Car7();
		
		car1.setCar(1234,20.5);
		System.out.println(car1);
}
}
class Car7
{
	protected int num;
	protected double gas;
	public Car7() {
		num = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F���l");
	}
	public Car7(int n,double g) {
		num=n;
		gas=g;
		System.out.println("�Ͳ��F���l�s����:"+num+"�T�o�q��"+gas+"�����l");
	}
	public void setCar(int n , double g) {
		num = n;
		gas  = g;
		System.out.println("�N��������"+num+"�A�T�o�q��"+gas+"�����l");
	}
	public void show() {
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
	public String toString()
	{
		String str = "����"+num+"�T�o�q"+gas;
		return str;
	}
}

class RacingCar7 extends Car7{
	private int course;
	public RacingCar7()
	{
		course=0;
		System.out.println("�Ͳ��F�ɨ�");
	}
	public RacingCar7(int n,double g,int c) {
		super(n,g);
		course = c;
		System.out.println("�Ͳ��F���l�s����:"+course+"���ɨ�");
	}
	public void setCourse(int c) {
		course = c;
		System.out.println("�N�ɨ��s���]��"+course);	
	}
	public void newShow() {

		System.out.println("�ɨ������O:"+num);	
		System.out.println("�T�o�q�O:"+gas);	
		System.out.println("�ɨ��s���O:"+course);	
	}
	public void show() {
		System.out.println("�ɨ������O:"+num);	
		System.out.println("�T�o�q�O:"+gas);	
		System.out.println("�ɨ��s���O:"+course);	
	}
}

