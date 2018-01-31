class Employee
{   
    public String empName;
    public int empSalary;
    public String address;

    //Default Constructor automatically Called by defining an Object
    public Employee()
    {
        this("RRS Creations");
    }
    public Employee(String name)
    {
    	this(name, 54321);
    }
    
    public Employee(String name, int sal)
    {
    	this(name, sal, "Kadapa");
    }
    
    public Employee(String name, int sal, String addr)
    {
    	this.empName=name;
    	this.empSalary=sal;
    	this.address=addr;
    }

    void disp() {
    	System.out.println("Employee Name: "+empName);
    	System.out.println("Employee Salary: "+empSalary);
    	System.out.println("Employee Address: "+address);
    }
}
class ChainConstructor
{
    public static void main(String[] args)
    {
        Employee obj = new Employee();
        obj.disp();
    }
}
