package employee;
import company.*;
public class Employee implements Department,Company
{
	public String name="Raj";
	protected String job="Software";
	public int salary=50000;
	String dob="1997-10-07";
	int dno=108;
	public void deptdetail()
	{
		System.out.println("Dept name:" +dname);	
		System.out.println("Dept number:" +deptno);
		System.out.println("Dept location:" +location);
	}
	public void comdetail()
	{
		System.out.println("Company name:" +cname);
		System.out.println("Company location:" +clocation);
		System.out.println("company job name:" +name);
	}

	public String toString()
	{
		return name+job+salary+dob+dno;
	}

	
}
