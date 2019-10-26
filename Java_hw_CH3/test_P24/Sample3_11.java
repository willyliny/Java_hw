
public class Sample3_11 {
	public static void main(String[] args)
	{
		Car11 car1;
		car1 = new Car11();
		
		car1.setCar(1234,20.5);
		car1.show();
		System.out.println("指定部正確的汽油量{-10.0}看看");

		car1.setCar(2345);
		car1.show();
		System.out.println("指定部正確的汽油量{-10.0}看看");

		car1.setCar(30.5);
		car1.show();
		
	}
}
class Car11
{
	private int num;
	private double gas;
	public void setCar(int n) {
		num = n ;
		System.out.println("將車號設為"+num);
	}
	public void setCar(double g) {
		gas = g;
		System.out.println("將汽油量設為"+gas);
	}
	public void setCar(int n , double g) {
		num = n ;
		gas = g;
		System.out.println("將車號設為"+num+"將汽油量設為"+gas);
	}
	public void show() {
		System.out.println("車號是"+this.num);
		System.out.println("汽油量是"+this.gas);
	}
	
}
