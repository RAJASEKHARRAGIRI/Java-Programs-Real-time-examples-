import java.util.Scanner;
class Lcm
{
	public static void main(String[]args)
	{
		int a,b,x,y,t,gcd,lcm;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a value:");
		a=s.nextInt();
		System.out.println("enter a value:");
		b=s.nextInt();
		x=a;
		y=b;
		while(y!=0)
		{
			t=y;
			y=x%y;
			x=t;

		}
		gcd=x;
		lcm=(a*b)/gcd;
		System.out.println("lcm of the given no is="+lcm);
		System.out.println("gcd of the given no is="+gcd);
	}
}