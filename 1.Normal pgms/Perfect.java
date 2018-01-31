import java.util.Scanner;
class Perfect
{
	public static void main(String[]args)
	{
		int n,i,sum=0,temp;
		Scanner s=new Scanner(System.in);
		System.out.println("enter n value:");
		n=s.nextInt();
		temp=n;
		for(i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}

		}
		if(sum==temp)
		{
			System.out.println("given no is perfect");

		}	
		else
		{
			System.out.println("given no is not perfect");
		}
	}
}