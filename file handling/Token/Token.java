import java.io.*;
import java.util.StringTokenizer;
//import java.String.StringTokenizer;
class Token
{
	public static void main(String[] args)throws IOException {
		FileReader fr = new FileReader("Book.txt");
		BufferedReader br = new BufferedReader(fr);
		String st,st1="";
		while(( st= br.readLine())!=null)
		{
			StringTokenizer st2 = new StringTokenizer(st);
			while(st2.hasMoreTokens())
			{
				st1= st2.nextToken();
				System.out.println(st1);
			}
			
			
		}
		
		
		//fr.close();
	}
}