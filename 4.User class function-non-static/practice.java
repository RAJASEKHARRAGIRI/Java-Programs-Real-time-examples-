import java.util.*;
class Lib
{
	String name,mail,gender;
	int age;
		
		void java()
		{
			System.out.println("java book is avilable");

		}
		void maths()
		{
			System.out.println("maths book is avilable");
	
		}
		void dbms()
		{
			System.out.println("dbms book is avilable");
	
		}
		void flat()
		{
			System.out.println("flat book is avilable");
	
		}
		void display()
	 	{
		System.out.println("Name: "+name);
		System.out.println("Age : "+age);
		System.out.println("gender: "+gender);
		System.out.println("Mail: "+mail);
		System.out.println();
		}


	
}
class Lib_memo
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		Lib ravi=new Lib();
		ravi.java();
		ravi.maths();
		ravi.dbms();
		ravi.flat();
		System.out.println("Enter ur name:");
		ravi.name=s.next();
		System.out.println("enter ur age");
		ravi.age=s.nextInt();
		System.out.println("Enter ur gender:");
		ravi.gender=s.next();
		System.out.println("Enter ur mail:");
		ravi.mail=s.next();
		ravi.display();


	}
}