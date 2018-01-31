import java.io.*;
class Rev_br
{
	public static void main(String[]args)
	throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number:");
		String s=br.readLine();
		int a=Integer.parseInt(s);
		int flag=0;
		while(a!=0)
		{
			int x=a%10;
			flag=(flag*10)+x;
			a=a/10;
		}		
		System.out.println("Reverse no is="+flag);


	}
}
