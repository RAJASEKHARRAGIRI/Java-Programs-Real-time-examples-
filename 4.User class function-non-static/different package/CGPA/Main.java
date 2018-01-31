import java.util.Scanner;
class Main

{
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	
	CGPA mark= new CGPA();
	System.out.println("Enter Ur ID Number: ");
	String na=s.next();
	
	System.out.println("Enter marks of Subjects PSP: ");
	mark.psp=s.nextInt();
	System.out.println("Enter marks of Subjects Java: ");
	mark.java=s.nextInt();
	System.out.println("Enter marks of Subjects SCLD: ");
	mark.dld=s.nextInt();
	System.out.println("Enter marks of Subjects DAA: ");
	mark.daa=s.nextInt();
	System.out.println("Enter marks of Subjects Basic Electronics: ");
	mark.be=s.nextInt();
	// Accessing the Class methods
	System.out.println("*************************");
	System.out.println("Ur Id-No: "+na);
	mark.grade();
	
	
	
	
	
	}
}

