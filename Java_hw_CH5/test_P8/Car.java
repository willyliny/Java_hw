package pa;

class Car {
	protected int num;
	protected double gas;
	public Car() {
		num = 0;
		gas = 0.0;
	 	System.out.println("�Ͳ��F���l");
	}

	public void setCar(int n , double g) throws CarException{
		if(g<0) {
			CarException e = new CarException();
			throw e;
		}
		else 
		{
			num = n;
		 	gas  = g;
		 	System.out.println("�N��������"+num+"�A�T�o�q��"+gas+"�����l");
		}
	}
	public void show() {
		System.out.println("�����O"+num);
	 	System.out.println("�T�o�q�O"+gas);
	}
}
class CarException extends Exception{
	
}