import java.util.Scanner;
class sum
{
	public static void main(String[]args)
	{
		int a;
		int i,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a value");
		a=s.nextInt();
		for(i=1;i<=a;i++)
		{
			sum=sum+i;

			System.out.println(sum);
		}
	}
}