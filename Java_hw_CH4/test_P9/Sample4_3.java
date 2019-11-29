public class Sample4_3 {
	public static void main(String[] args) {
		RacingCar3 rccar1 = new RacingCar3();
		rccar1.newShow();
	}
}

class Car3
{
	protected int num;
	protected double gas;
	public Car3() {
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	public Car3(int n,double g) {
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
}

class RacingCar3 extends Car3{
	private int course;
	public RacingCar3()
	{
		course=0;
		System.out.println("生產了賽車");
	}
	public RacingCar3(int n,double g,int c) {
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
}
