public class Sample3_23 {
	public static void main(String[] args)
	{
		System.out.println("�ŧicar1");
		Car23 car1;
		car1 = new Car23();
		car1.show();
		int number = 1234;
		double gasoline = 20.5;
		String str = "1����";
		car1.setCar(number, gasoline);
		car1.setName(str);
		car1.show();
	}
}
class Car23
{
	private String name;
	private int num;
	private double gas;
	public Car23() {
		num = 0;
		gas = 0.0;
		name = "�S�����l";
		System.out.println("�Ͳ��F���l");
	}
	public void setCar(int n , double g) {
		num = n;
		gas  = g;
		System.out.println("�N�����]��"+num+"�A�T�o�q�]��"+gas);
	}
	public void setName(String nm) {
		name = nm;
		System.out.println("�N���W�]��"+name);
	}
	public void show() {
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
		System.out.println("���W�O"+name);

	}
}
