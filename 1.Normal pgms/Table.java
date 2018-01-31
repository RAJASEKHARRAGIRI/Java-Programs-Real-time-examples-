import java.util.Scanner;
class Table
{
	public static void main(String[]args)
	{
		int a,i,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of table:");
		a=s.nextInt();
		System.out.println("enter the range:");
		b=s.nextInt();
		for(i=1;i<=b;i++)
		{
			c=a*i;
			System.out.println(a+"*"+i+"="+c);

		}

	}
}