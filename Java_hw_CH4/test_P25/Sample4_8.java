public class Sample4_8 {
	public static void main(String[] args) {
		Car8 car1 = new Car8();
		Car8 car2 = new Car8();
		
		Car8 car3;
		car3=car1;
		System.out.println("car1�Pcar2�ۦP"+car1.equals(car2));
		System.out.println("car1�Pcar3�ۦP"+car1.equals(car3));
			
}
}
class Car8
{
	protected int num;
	protected double gas;
	public Car8() {
		num = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F���l");
	}
	public Car8(int n,double g) {
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

class RacingCar8 extends Car8{
	private int course;
	public RacingCar8()
	{
		course=0;
		System.out.println("�Ͳ��F�ɨ�");
	}
	public RacingCar8(int n,double g,int c) {
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

