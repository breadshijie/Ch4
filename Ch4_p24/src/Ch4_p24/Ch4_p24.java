package Ch4_p24;

public class Ch4_p24 
{
	public static void main(String[] args) 
	{
		Car car1;
		car1 = new Car();
		
		car1.setcar(1234,20.5);
		System.out.println(car1);
	}
}
class Car
{
	protected int num;
	protected double gas;
	
	public Car()
	{
		num=0;
		gas=0;
		System.out.println("�Ͳ��F���l");
	}
	
	public void setcar(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("�N�����]��"+num+"�A�T�o���]��"+gas);
	}
	
	public String toString()
	{
		String str = "����"+num+"�A�T�o�q"+gas;
		return str;
	}
}