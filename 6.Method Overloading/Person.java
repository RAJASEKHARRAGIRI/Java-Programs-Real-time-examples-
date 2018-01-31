//overloading means method name is same and parameters are different
class Person
{
	String x,y;
	int c;
	void m1(String s,int a)
	{
		x=s;
		c=a;
		System.out.println(x+" "+c);

	}
	void m1(int a,String s)
	{
		c=a;
		x=s;
		System.out.println(c+" "+x);

	}
	void m1(String s,int a,String n)
	{

		c=a;
		x=s;
		y=n;
		System.out.println(c+" "+x+" "+y);

	}
}
