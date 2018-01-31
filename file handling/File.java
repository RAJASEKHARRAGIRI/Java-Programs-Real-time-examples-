import java.io.*;
import java.util.*;
class File
{
 	
 	public static void main(String args[])throws IOException
		{
            String s=" ";
   			FileReader fr=new FileReader("DATA.txt");
   			BufferedReader br=new BufferedReader(fr);
   			while((s=br.readLine())!=null)
   				{
      				System.out.println(s);
   				}
  		}
}

