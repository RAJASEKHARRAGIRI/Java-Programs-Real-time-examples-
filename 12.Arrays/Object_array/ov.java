import java.io.*;
class vowels
{
	public static void main(String args[]) throws IOException
	{
		String str;
		int vowels = 0, digits = 0, blanks = 0;
		char ch;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter a String : ");
		str = br.readLine();

		for(int i = 0; i < str.length(); i ++)
		{
			ch = str.charAt(i);

			if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || 
			ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
				vowels ++;
			else if(Character.isDigit(ch))
				digits ++;
			else if(Character.isWhitespace(ch))
				blanks ++;
		}
		System.out.println("Vowels : " + vowels);
		System.out.println("Digits : " + digits);
		System.out.println("Blanks : " + blanks);
		}
}

