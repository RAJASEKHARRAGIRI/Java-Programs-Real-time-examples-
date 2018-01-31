/* * 
  * * 
 * * * 
* * * * 
 * * * 
  * * 
   *  */

import java.util.Scanner;
class Triangle
{
	public static void main(String[]args)
	{
		int i,j,k=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n value");
		int n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			for(k=n-i;k>=1;k--)
            {
            	System.out.print(" ");
            }
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(i=1;i<=n;i++)
		{
			//for(k=n-i;k>=1;k--)
			for(k=1;k<=i;k++)
            {
            	System.out.print(" ");
            }
			//for(j=1;j<=i;j++)
			for(j=n-i;j>=1;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}