public class Sample4_10 {
	public static void main(String[] args) {
		Vehicle[] vc = new Vehicle[2];
		vc[0]=new Car10(1234,20.5);
		vc[0].setSpeed(60);

		vc[1]=new Plane(232);
		vc[1].setSpeed(500);
		for(int i=0;i<vc.length;i++) {
			vc[i].show();
		}
	}
}
abstract class Vehicle{
	protected int speed;
	public void setSpeed(int s) {
		speed=s;
		System.out.println("�N�t�׳]��"+speed+"�F");
	}
	abstract void show();
}
class Car10 extends Vehicle
{
	protected int num;
	protected double gas;
	public Car10() {
		num = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F���l");
	}
	public Car10(int n,double g) {
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
		System.out.println("�t�׬O:"+speed);		

	}
	public String toString()
	{
		String str = "����"+num+"�T�o�q"+gas;
		return str;
	}
}

class Plane extends Vehicle{
	private int flight;
	public Plane(int f) {
		flight=f;
		System.out.println("�Ͳ��F"+flight+"�Z��������");
	}
	public void show() {
		System.out.println("�������Z���O:"+flight);	
		System.out.println("�t�׬O:"+speed);		
	}
}

class RacingCar10 extends Car10{
	private int course;
	public RacingCar10()
	{
		course=0;
		System.out.println("�Ͳ��F�ɨ�");
	}
	public RacingCar10(int n,double g,int c) {
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

