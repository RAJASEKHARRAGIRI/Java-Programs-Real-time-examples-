import java.util.Scanner;
import java.io.*;
class demo
{
	public static void main(String[] args)throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ur name");
		String name = sc.next();
		System.out.println("Enter ur Age");
		int age = sc.nextInt();
		test(name,age);
	}
	public static void test(String name,int age)throws IOException
	{
		try
		{
			if(age<18)
			{
				throw new excep();	
			}
			
			else
			{
				FileWriter fr = new FileWriter("voter.txt",true);
				BufferedWriter bw = new BufferedWriter(fr);
				bw.write(name+"\t"+age+"\n");
				System.out.println("Successfully registered!!!");
			}
		}
		catch(excep e)
		{

		}
	}
}