import java.util.Scanner;
class Prime_range
{
	public static void main(String[]args)
	{
		int a,b,i,j;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a value:");
		a=s.nextInt();
		System.out.println("enter b value:");
		b=s.nextInt();
		for(i=a;i<=b;i++)
		{
			int sum=0;
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					sum=sum+1;
					
				}

			}

			if(sum==2)
			{
				System.out.print(i+"  ");
			}
		}

		
	}
}