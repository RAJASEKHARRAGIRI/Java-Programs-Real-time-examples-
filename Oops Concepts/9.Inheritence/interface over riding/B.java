class B extends A implements Z
{
	void b1()
	{
		System.out.println("B1 from B");
	}
	void b2()
	{
		System.out.println("B2 from B");
	}
	public void p1()
	{
		System.out.println("p1 from interface");
	}
	public int p3(int a,int b)
	{
		return a+b;
	}
	public void p2()
	{
		System.out.println("p2 from interface");
	}
}
