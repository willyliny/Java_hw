public class Sample4_9 {
	public static void main(String[] args) {
		Car9[] cars = new Car9[2];
		cars[0]=new Car9();
		cars[1]=new RacingCar9();
		
		for(int i = 0;i<cars.length;i++) {
			Class cl = cars[i].getClass();
			System.out.println("��"+(i+1)+"�Ӫ������O�O"+cl);
		}
}
}
class Car9
{
	protected int num;
	protected double gas;
	public Car9() {
		num = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F���l");
	}
	public Car9(int n,double g) {
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

class RacingCar9 extends Car9{
	private int course;
	public RacingCar9()
	{
		course=0;
		System.out.println("�Ͳ��F�ɨ�");
	}
	public RacingCar9(int n,double g,int c) {
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

