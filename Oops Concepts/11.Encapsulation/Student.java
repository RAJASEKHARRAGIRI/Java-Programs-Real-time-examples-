class Student
{
	private String name;
	private int age;
	private String mail;
	protected void setname(String s)
	{
		name=s;	
	}
	protected void setage(int a)
	{
		age=a;	
	}
	protected void setmail(String m)
	{
		mail=m;	
	}
	protected String getname()
	{
		return name;		
	}	
	protected int getage()
	{
		return age;		
	}	
	protected String getmail()
	{
		return mail;		
	}
	
	public String toString()
	{
		return name+"\t"+age+"\t"+mail;	
	}
}
