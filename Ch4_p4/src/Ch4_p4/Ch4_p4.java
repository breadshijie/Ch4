package Ch4_p4;

public class Ch4_p4 {
	public static void main(String[] args) 
	{
		RacingCar rccar1;
		rccar1 = new RacingCar();
		
		rccar1.setCar(1234,20.5);
		rccar1.setCourse(5);
	}
}
class Car
{
	private int num;
	private double gas;
	
	public Car()
	{
		num=0;
		gas=0;
		System.out.println("生產了車子");
		System.out.println("車子一開始的數量為"+num);
		System.out.println("車子一開始的汽油量為"+gas);
	}
	
	public void setCar(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+"，汽油量設為"+gas);	
	}
	
	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}
class RacingCar extends Car
{
	private int course;
	
	public RacingCar()
	{
		course=0;
		System.out.println("生產了車子");
		System.out.println("賽車一開始的編號為"+course);
	}
	
	public void setCourse(int c)
	{
		course=c;
		System.out.println("將賽車編號設為"+course);
	}
	
}
