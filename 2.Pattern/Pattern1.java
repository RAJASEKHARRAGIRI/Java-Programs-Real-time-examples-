/*1	
2	4	
3	6	9	
4	8	12	16	
5	10	15	20	25	*/
import java.util.Scanner;
class Pattern1
{
	public static void main(String[]args)
	{
		int i,j,k=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n value");
		int n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				k=i*j;
				System.out.print(k+"\t");
			}
			System.out.print("\n");
		}
	}
}