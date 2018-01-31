class Parent
{
	public String name="Done";
	public Parent()
	{
		System.out.println("Parent class Constructor: ");
	}
	public void display()
	{
		System.out.println(name);
	}
}

class Employee extends Parent
{   
    public String empName;
    public int empSalary;
    public String address;

    //Default Constructor automatically Called by defining an Object
    public Employee()
    {
    		super(); //we cant call another constructor when we call parent constructor by using SUPER
    	  	super.display(); // it calls parent call constructor, method & varaibles
    }
}
class SuperClass
{
    public static void main(String[] args)
    {
        Employee obj = new Employee();
    }
}
