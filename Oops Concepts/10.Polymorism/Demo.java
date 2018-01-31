class Demo
{
	public static void main(String[] args)
	{
		Employee obj=new Employee();
		obj.eating();
		obj.earning();
		obj.working();		// it is abstract class with abstract methods
		
		obj.playing();   // in abstract class method
		obj.walking();
	
		obj.dancing();	  // override the abstract class method in child class 
	
		obj.watch();	// it is in child class from interface
		obj.payingtax();
		obj.fun();

		Person obj1=new Employee(); // object from person and refenrence from childclass 
		obj1.playing();
		obj1.walking();
		obj1.dancing();
		//obj.fun(); => this in interface or other class so we can't access the other class bcz we create the obj for person only
		Extra obj2=new Employee(); // object from Extra(interface) and refenrence from childclass 
		obj2.fun();
	}
}
