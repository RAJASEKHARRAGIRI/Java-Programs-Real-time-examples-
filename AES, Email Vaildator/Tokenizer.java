import java.util.*;
class Tokenizer
{
	public static void main(String rrs[])
	{
		Scanner s= new Scanner(System.in);
		String str= s.nextLine();
		
		StringTokenizer st= new StringTokenizer(str);
			while(st.hasMoreTokens())
			{
				String s1=st.nextToken();
				for(int i=0;i<s1.length();i++)
				{
					System.out.println(s1.charAt(i)+" hello");
				}
			}

	}
}
