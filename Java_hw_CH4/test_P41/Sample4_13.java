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
		System.out.println("生產了車子");
	}
	public Car13(int n,double g) {
		num=n;
		gas=g;
		System.out.println("生產了車子編號為:"+num+"汽油量為"+gas+"的車子");
	}
	public void vShow() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);

	}

	public void mShow() {
		System.out.println("車子材質是錯的");
	}

}





