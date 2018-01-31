import java.util.Scanner;
class Prime
{
	public static void main(String[]args)
	{
		int n,i,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter n value:");
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				sum=sum+1;
			}
		}
		if(sum==2)
		{
			System.out.println("Given no is Prime");

		}
		else
		{
			System.out.println("Given no is not a Prime");

		}
		

		
	}
}
