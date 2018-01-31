import java.io.*;
import java.util.*;
public class Demo
{
	public static void main(String[] raj)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Ur Name, Get ur LuckyNumber and Color in this Year: ");
		String name = br.readLine();	
		RandomNumber.GenerateRandomNumber(name);
	}
}

class CheckLuck
{
	private String[] color= new String[]{"Red","Blue","Green","Yellow","Violet","Orange","Pink","White","Black","Grey"};
	
	public String getColor(int n)
	{
		return color[n];
	}	
}
class RandomNumber
{
	static void GenerateRandomNumber(String name)
	{
		Random ran = new Random();
		int number = ran.nextInt(10);
		CheckLuck obj = new CheckLuck();
		String color = obj.getColor(number);
		System.out.println("Thank You "+name+"\nYour Lucky Number & Lucky Color in this Year is "+number+" "+color);
	}
	
}
