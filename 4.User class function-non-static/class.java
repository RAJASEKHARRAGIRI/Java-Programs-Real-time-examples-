import java.util.Scanner;
import java.io.*;
class Library
{
 	String name,mail,gen;
	int age;
	void java()
	{
		System.out.println("Java book is available");
	}
	void maths()
	{
		System.out.println("Maths book is available");
	}
	void physics()
	{
		System.out.println("Physics book is available");
	}
	void chem()
	{
		System.out.println("Chemistry is available");
	}
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Age : "+age);
		System.out.println("gender: "+gen);
		System.out.println("Mail: "+mail);
		System.out.println();
	}

}
class Library_memo
{
	public static void main(String[] args)throws IOException
	{	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		Scanner s=new Scanner(System.in);
		Library raj= new Library();
		raj.chem();
		raj.java();
		raj.physics();
		raj.maths();
		System.out.println("Enter Ur Name");
		raj.name=s.next();
		System.out.println("Enter Ur Age");
		String m= br.readLine();
		raj.age= Integer.parseInt(m);
		System.out.println("Enter Ur Gender");
		raj.gen=s.next();
		System.out.println("Enter Ur Mail");
		raj.mail=s.next();
		
		raj.display();
	}
}











