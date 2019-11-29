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
		System.out.println("將速度設為"+speed+"了");
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
		System.out.println("生產了車子");
	}
	public Car10(int n,double g) {
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
		System.out.println("速度是:"+speed);		

	}
	public String toString()
	{
		String str = "車號"+num+"汽油量"+gas;
		return str;
	}
}

class Plane extends Vehicle{
	private int flight;
	public Plane(int f) {
		flight=f;
		System.out.println("生產了"+flight+"班次的飛機");
	}
	public void show() {
		System.out.println("飛機的班次是:"+flight);	
		System.out.println("速度是:"+speed);		
	}
}

class RacingCar10 extends Car10{
	private int course;
	public RacingCar10()
	{
		course=0;
		System.out.println("生產了賽車");
	}
	public RacingCar10(int n,double g,int c) {
		super(n,g);
		course = c;
		System.out.println("生產了車子編號為:"+course+"的賽車");
	}
	public void setCourse(int c) {
		course = c;
		System.out.println("將賽車編號設為"+course);	
	}
	public void newShow() {

		System.out.println("賽車車號是:"+num);	
		System.out.println("汽油量是:"+gas);	
		System.out.println("賽車編號是:"+course);	
	}
	public void show() {
		System.out.println("賽車車號是:"+num);	
		System.out.println("汽油量是:"+gas);	
		System.out.println("賽車編號是:"+course);	
	}
}

