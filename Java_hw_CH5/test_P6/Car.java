
class Car {
	protected int num;
	protected double gas;
	public Car() {
		num = 0;
		gas = 0.0;
	 	System.out.println("�Ͳ��F���l");
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
}
