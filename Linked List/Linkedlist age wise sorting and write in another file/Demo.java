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
				s1=str.nextToken();
				s2=str.nextToken();
				int i=Integer.parseInt(s2);
				s3=str.nextToken();
				obj.create(s1,i,s3);
				
			}
			

		}	
		
		Student start = obj.sort();
		obj.traversal();	// for display all in linked list elements
		Student current=start;
		FileWriter fw= new FileWriter("output.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("Sorted List:-"+"\n");
		while(current!=null)
		{
			bw.write(current.name+"\t");	
			bw.write(current.age+"\t");	
			bw.write(current.id+"\t"+"\n");	
			current=current.next;
		}
		bw.close();
		fw.close();

		
		
		
		
	}
}

