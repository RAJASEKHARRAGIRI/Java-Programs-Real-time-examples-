//overloading means method name is same and parameters are different
//in constructor we use private key
class Person
{
	private String x,y;
	private int c;
	Person(String s,int a)
	{
		x=s;
		c=a;
		System.out.println(x+" "+c);

	}
	Person(int a,String s)
	{
		c=a;
		x=s;
		System.out.println(c+" "+x);

	}
	Person(String s,int a,String n)
	{

		c=a;
		x=s;
		y=n;
		System.out.println(c+" "+x+" "+y);

	}
}