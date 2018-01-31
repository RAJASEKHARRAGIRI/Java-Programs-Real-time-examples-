import java.util.Scanner;
class Decode
{
	public static void main(String[] args)
	{
		int i,j;
		String str;		
		Scanner s=new Scanner(System.in);
		int arr[]=new int[110];
		System.out.println("Enter Screat Code:");
		str=s.nextLine();	
		System.out.println("Ur Enterd Code: "+str);
		System.out.println("Decoded String: ");
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				char c=str.charAt(i);
				c+=3;	
				System.out.print(c);
			}
			else 
			{
				char c=str.charAt(i);
				System.out.print(c);
			}	
		}
		System.out.println();
		
	}
	
}
