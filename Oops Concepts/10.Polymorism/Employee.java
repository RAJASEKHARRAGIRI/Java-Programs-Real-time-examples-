class Employee extends Person implements Extra
{
	void eating()
	{
		System.out.println("Employee is eating ");
	}
	void working()
	{
		System.out.println("Employee is woking");
	}
	void earning()
	{
		System.out.println("Employee is earning");
	}
	void dancing()
	{
		System.out.println("Person can dancing ...it is in child class");
	}

	public void fun()
	{
		System.out.println("Employee want fun. it is in childclass from interface");
	}
	public void payingtax()
	{
		System.out.println("Employee pay tax ...it is in child class from interface");
	}
	public void watch()
	{
		System.out.println("Employee Watching movie ...it is in child class from interface");
	}
}

