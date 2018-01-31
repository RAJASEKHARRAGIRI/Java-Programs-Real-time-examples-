import java.io.*;
import java.util.StringTokenizer;
class Demo
{
	public static void main(String[] args) throws IOException
	{
		LinkList obj= new LinkList();
		FileReader fr=new FileReader("Data.txt");
     	BufferedReader br=new BufferedReader(fr);
		String s="",s1="",s2="",s3="";
		while((s=br.readLine())!=null)
		{
			StringTokenizer str= new StringTokenizer(s);
			while(str.hasMoreTokens())
			{
				
				s2=str.nextToken();
				int i=Integer.parseInt(s2);
				
				obj.create(i);
				
			}
			

		}	
		//obj.traversal();	// for display all in linked list elements
		obj.sort();
		obj.traversal(nn);
		
		
		
		
		
	}
}

