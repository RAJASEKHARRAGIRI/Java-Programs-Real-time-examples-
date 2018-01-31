import java.io.*;
import java.util.StringTokenizer;
class FileWord
{
	String fileName;
    int wcount=0;
    String key1;
	FileWord(String f)
	{
		this.fileName=f;
	}
	void wordCount()throws IOException
	{
		  String s=" ";
           int count=0;
           FileReader fr=new FileReader(fileName);
           BufferedReader br=new BufferedReader(fr);
           while((s=br.readLine())!=null)
              {
                     
                     StringTokenizer st=new StringTokenizer(s);
                   while(st.hasMoreTokens())
                        {
                           st.nextToken();
                            count++;
                        }
              }
            wcount=count;
           System.out.println(wcount);
         br.close();
         fr.close();  
	}
	String arr[]=new String[wcount];
	void insertValues()throws IOException
	{
     String s1=" ";
        int i=0;
            FileReader fr1=new FileReader(fileName);
           BufferedReader br1=new BufferedReader(fr1);
           while((s1=br1.readLine())!=null)
              {
                     
                     StringTokenizer st1=new StringTokenizer(s1);
                    
                   while(st1.hasMoreTokens())
                        {
                          arr[i]=st1.nextToken();
                          i++;
                        }
              }
	}
	boolean search(String key)
	  {
         key1=key;
             int s=findOccurance(key1);
                if(s<=1)
                   {
		         return true;
                   }
                else
                  {
                    return false;
                   }
	}
	int findOccurance(String key)
	   {
		
        String k=key;
           int f=0;
           for(int j=0;j<arr.length;j++)
                 { 
                 if(arr[j].equals(key))
                       {
                          f++;
                       }
                  
                 }
           return f;  
	    }
}
