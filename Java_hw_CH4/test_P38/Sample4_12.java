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
		System.out.println("生產了車子");
	}
	public Car12(int n,double g) {
		num=n;
		gas=g;
		System.out.println("生產了車子編號為:"+num+"汽油量為"+gas+"的車子");
	}
	public void setCar(int n , double g) {
		num = n;
		gas  = g;
		System.out.println("將產車號為"+num+"，汽油量為"+gas+"的車子");
	}
	public void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);

	}
	public String toString()
	{
		String str = "車號"+num+"汽油量"+gas;
		return str;
	}
}

class Plane12 implements iVehicle{
	private int flight;
	public Plane12(int f) {
		flight=f;
		System.out.println("生產了"+flight+"班次的飛機");
	}
	public void show() {
		System.out.println("飛機的班次是:"+flight);	
	}
}



