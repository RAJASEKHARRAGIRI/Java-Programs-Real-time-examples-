class Sample implements Runnable
{
	String name;
	int age;
	Sample (String name, int a)
	{
		this.name= name;
		this.age=a;	
	}
	public void run()
	{	
		int k=0;
		while(k<10)
		{
			System.out.println(name);
			k++;
		}
	}
}


