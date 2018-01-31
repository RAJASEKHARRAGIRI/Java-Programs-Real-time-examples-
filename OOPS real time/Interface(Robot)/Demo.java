import java.util.*;
public class Demo
{
	public static void main(String args[])
	{
		String color="Red";
		String direction="Right";
		int speed=100;
		Sophiya s = new Sophiya(color,direction,speed);
		System.out.println(s);
		s.speed();
	}
}

class Sophiya implements Robot
{
	private String color;
	private String direction;
	private int speed;
	Sophiya(String color,String direction, int speed )
	{
		this.color= color;
		this.direction= direction;
		this.speed= speed;
	}
	
	public void speed()
	{
		System.out.println("Sopiya have 5 times speed: "+speed*5);
	}
	public void actions()
	{
		System.out.println("Sopiya moves : "+direction);
	}
	public void color()
	{
		System.out.println("Sopiya Color: "+color);
	}
	public String toString()
	{
		return color+" "+direction+" "+speed;
	}
}

interface Robot
{
	void speed();
	void actions();
	void color();
}
