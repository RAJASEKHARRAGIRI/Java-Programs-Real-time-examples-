import java.util.*;
import java.io.*;
class CaeiserChaiper
{
	public static void main(String[] raj)throws IOException 
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		FileWriter fw = new FileWriter("Enscript.txt");
		BufferedWriter bw= new BufferedWriter(fw);
		System.out.println("Enter String: ");
		String str= br.readLine();
		System.out.println("Enter Number to Enscript: ");
		String str1= br.readLine();
		int n= Integer.parseInt(str1);
		int len=str.length();
		String code=" ";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='A'&&str.charAt(i)<='Z')
			{
				if((str.charAt(i)+n)<='Z')
					code=code+(char)(str.charAt(i)+n);
				if((str.charAt(i)+(char)n)>'Z')
					code=code+(char)('A'+((str.charAt(i)+n)-'Z'-1));
			}
			else if(str.charAt(i)>='a'&&str.charAt(i)<='z')
			{
				if((str.charAt(i)+n)<='z')
					code=code+(char)(str.charAt(i)+n);
				if((str.charAt(i)+(char)n)>'z')
					code=code+(char)('a'+((str.charAt(i)+n)-'z'-1));
			}
			else
				code=code+str.charAt(i);
		}
		System.out.println("Enscript Code :  "+code);
		bw.write("Enscript Code for given String : "+str+"\n");
		bw.write(code);
		bw.close();
		fw.close();
		//Decode
			String code1=" ";
		for(int i=0;i<code.length();i++)
		{
			if(code.charAt(i)>='A'&&code.charAt(i)<='Z')
			{
				if((code.charAt(i)-n)>='A')
					code1=code1+(char)(code.charAt(i)-n);
				if((code.charAt(i)-(char)n)<'A')
					code1=code1+(char)('Z'-((code.charAt(i)-n)-'A'+1));
			}
			else if(code.charAt(i)>='a'&&code.charAt(i)<='z')
			{
				if((code.charAt(i)-n)>='a')
					code1=code1+(char)(code.charAt(i)-n);
				if((code.charAt(i)-(char)n)<'a')
					code1=code1+(char)('z'+((code.charAt(i)-n)-'a'+1));
			}
			else
				code1=code1+code.charAt(i);
		}
		System.out.println("Decode Code :  "+code1);
		
	}
}
