
public class Sample3_7 {
	public static void main(String[] args)
	{
		Car7 car1;
		car1 = new Car7();
		int number = 1234;
		double gasoline = 20.5;
		car1.setNum(number, gasoline);
	}
}
class Car7
{
	int num;
	double gas;
	void setNum(int n,double g) {
		num = n ;
		gas = g ;
		System.out.println("�N�����]��"+num+"�A�T�o�q�]��"+gas);
	}
	void show() {
		System.out.println("�����O"+this.num);
		System.out.println("�T�o�q�O"+this.gas);
	}
}
