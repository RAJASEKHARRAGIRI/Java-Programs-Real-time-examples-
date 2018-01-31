import java.util.Scanner;
class Palindrome
{
	public static void main(String[]args)
	{
		int a,n,sum=0,temp;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no:");
		n=s.nextInt();
		temp=n;
		while(n!=0)
		{
			a=n%10;
			sum=(sum*10)+a;
			n=n/10;
		}


		if(sum==temp)
		{
			System.out.println("Given no is palindrome");

		}
		else
		{
			System.out.println("Given no is not a palindrome");

		}
		

		
	}
}