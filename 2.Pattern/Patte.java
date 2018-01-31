 /*   *
     ***
    *****
   *******
  *********
 ***********
************* */

import java.util.Scanner;
class Patte
{
	public static void main(String[]args)
	{
		int n,i,j,k,l;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the n value:");
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{
		for(j=1;j<=n-i;j++)
		{
		System.out.print(" ");
		}	
		for(k=1;k<=i;k++)
		{
		System.out.print("*");
		}
		for(l=i-1;l>=1;l--)
		{
		System.out.print("*");
		
		}
		System.out.println();
		}	
	}
}
