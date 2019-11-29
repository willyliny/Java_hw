public class Sample4_12 {
	public static void main(String[] args) {
		iVehicle[] ivc = new iVehicle[2];
		ivc[0]=new Car12(1234,20.5);
		ivc[1]=new Plane12(232);
		for(int i=0;i<ivc.length;i++) {
			ivc[i].show();
		}
	}
}
interface iVehicle{
	int weight= 100;
	void show();
}
class Car12 implements iVehicle
{
	protected int num;
	protected double gas;
	public Car12() {
		num = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F���l");
	}
	public Car12(int n,double g) {
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

class Plane12 implements iVehicle{
	private int flight;
	public Plane12(int f) {
		flight=f;
		System.out.println("�Ͳ��F"+flight+"�Z��������");
	}
	public void show() {
		System.out.println("�������Z���O:"+flight);	
	}
}



