import java.io.*;
class Even
{
	public static void main(String[]args)
	throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number:");
		String s=br.readLine();
		int a=Integer.parseInt(s);
		if(a%2==0)
			Syseten.out.println("given no is Even:")
		else
			Syseten.out.println("given no is Odd")

		System.out.println("Given value is:"+s);


	}
}
