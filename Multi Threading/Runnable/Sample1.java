class Sample1 implements Runnable
{
	String name;
	int age;
	Sample1 (String name, int a)
	{
		this.name= name;
		this.age=a;	
	}
	public void run()
	{	
		int k=0;
		while(k<10)
		{
			System.out.println(age);
			k++;
		}
	}
}


