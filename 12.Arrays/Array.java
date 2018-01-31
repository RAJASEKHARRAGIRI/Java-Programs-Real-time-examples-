import java.util.Scanner;
class Array
{
	public static void main(String[]args)
	{
		int i,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the n value:");
		int n=s.nextInt();
		int array[]=new int[n];
		System.out.println("enter the Array element:");
		for(i=0;i<n;i++)
		{
			array[i]=s.nextInt();
			sum=sum+array[i];
		}
		/*System.out.println("************************************");
		for(i=0;i<n;i++)
		{
			System.out.println(array[i]);
		}*/
		
		System.out.println(sum);


	}
}
