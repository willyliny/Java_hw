public class Sample4_13 {
	public static void main(String[] args) {
		Car13 car1=new Car13(1234,20.5);
		car1.vShow();
		car1.mShow();
	}
}
interface iVehicle1{
	void vShow();
}
interface iMaterial{
	void mShow();
}
class Car13 implements iVehicle1,iMaterial
{
	protected int num;
	protected double gas;
	public Car13() {
		num = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F���l");
	}
	public Car13(int n,double g) {
		num=n;
		gas=g;
		System.out.println("�Ͳ��F���l�s����:"+num+"�T�o�q��"+gas+"�����l");
	}
	public void vShow() {
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);

	}

	public void mShow() {
		System.out.println("���l����O����");
	}

}





