import java.util.Scanner;
class Fact
{
	public static void main(String[]args)
	{
		int a,fact=1,i;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the Factorial of no:");
		a=s.nextInt();
		for(i=a;i>0;i--)
		{
			fact=fact*i;
			
			

		}
		System.out.println("factorial of the given no is"+fact);
	}
}