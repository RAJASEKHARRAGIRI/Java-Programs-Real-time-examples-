import java.util.Scanner;
class Month
{
	public static void main(String[]args)
	{
		int i,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the n value:");
		int n=s.nextInt();
		int array[]=new int[n];
		System.out.println("enter the month days:");
		for(i=0;i<n;i++)
		{
			array[i]=s.nextInt();
			//sum=sum+array[i];
		}
		System.out.println("************************************");
		//for(i=0;i<n;i++)
		//{
			System.out.println("MARCH MONTH HAVE="+array[2]+"days");
		//}
		
		//System.out.println(sum);


	}
}