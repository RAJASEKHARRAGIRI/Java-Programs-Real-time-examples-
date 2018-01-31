import java.io.*;
import java.util.StringTokenizer;
//import java.String.StringTokenizer;
class Token
{
	public static void main(String[] args)throws IOException {
		File file = new File("result.txt");
		FileWriter fw= new FileWriter("result.txt");
		FileReader fr = new FileReader("Book.txt");
		BufferedReader br = new BufferedReader(fr);
		String st,st1="";
		while(( st= br.readLine())!=null)
		{
			StringTokenizer st2 = new StringTokenizer(st);
			while(st2.hasMoreTokens())
			{
				st1+= st2.nextToken();
				//System.out.println(st1);
				
			}
			st1+="\n";
		}
		System.out.println("Successfully Write to File!");
		fw.write(st1);
		fw.close();
		fr.close();
	}
}

