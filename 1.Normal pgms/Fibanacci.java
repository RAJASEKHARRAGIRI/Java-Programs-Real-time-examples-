import java.util.Scanner;
class Fibanacci
{
	public static void main(String[]args)
	{
		int a=0;
		int b=1;
		int n,c;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the range:");
		n=s.nextInt();
		while(a<=n)
		{
			System.out.println("The fibanacci series is="+a);
			c=a+b;
			a=b;
			b=c;
		}
		
		
	}
}