import java.io.*;
import java.util.*;
class FileDemo
{
	public static void main(String args[]) throws IOException
	{
		System.out.println("Enter File Name: ");
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		FileWord fw=new FileWord(s);
		fw.wordCount();
		fw.insertValues();
		System.out.println("Enter Search Key: ");
		String key=scan.next();
		boolean b=fw.search(key);
		if(b==true)
			System.out.println("Key found");
		else
			System.out.println("Key Not found");
       int occ=fw.findOccurance(key);
          System.out.println(occ);
	}
}
