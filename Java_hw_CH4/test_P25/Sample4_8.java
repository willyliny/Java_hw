public class Sample4_8 {
	public static void main(String[] args) {
		Car8 car1 = new Car8();
		Car8 car2 = new Car8();
		
		Car8 car3;
		car3=car1;
		System.out.println("car1與car2相同"+car1.equals(car2));
		System.out.println("car1與car3相同"+car1.equals(car3));
			
}
}
class Car8
{
	protected int num;
	protected double gas;
	public Car8() {
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	public Car8(int n,double g) {
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

class RacingCar8 extends Car8{
	private int course;
	public RacingCar8()
	{
		course=0;
		System.out.println("生產了賽車");
	}
	public RacingCar8(int n,double g,int c) {
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

