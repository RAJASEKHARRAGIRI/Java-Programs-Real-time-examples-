import java.util.Scanner;
class great
{
	public static void main(String[]args)
	{
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the A value");
		a=s.nextInt();
		System.out.println("enter the B value");
		b=s.nextInt();
		System.out.println("enter the C value");
		c=s.nextInt();
		if(a>b&&a>c)
		{
			System.out.println("a is the greaterest one="+a);

		}
		else if(b>a&&b>c)
		{
			System.out.println("b is the greaterest one="+b);

		}
		else
		{
			System.out.println("c is the greaterest one="+c);

		}
		if(a%2==0)
		{
			System.out.println("given number a is even");


		}
		else if(a%2==1)

		{
			System.out.println("given number a is odd");
		}
		else if(b%2==0)
		{
			System.out.println("given number b is even");


		}
		else if(b%2==1)

		{
			System.out.println("given number b is odd");
		}
		if(c%2==0)
		{
			System.out.println("given number c is even");


		}
		else if(c%2==1)

		{
			System.out.println("given number c is odd");
		}
	}
}
