package example;
public class balance implements Art
{
	int temp=0, rate=5;
	public void display()
	{
		System.out.println("The account holder name:"+name);
		System.out.println(" Balance is:"+amount);
	}
	public int balance()
	{
		temp=amount*rate;
		return temp;
	}
}
