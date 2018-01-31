import java.util.*;
class Demo
{
	public static void main(String[]args)
	{
		System.out.println("enter the string interger and string");
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		int a=scan.nextInt();
		String n=scan.next();
		Person ravi=new Person();
		ravi.m1(s,a);
		ravi.m2(a,s);
		ravi.m3(s,a,n);
	}
}