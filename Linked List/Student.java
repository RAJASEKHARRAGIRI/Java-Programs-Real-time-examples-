class Student
{
	String name;
	int age;
	String id;
	Student next; // Refernece for next node
	// Constructor
	Student(int age, Student ref)
	{
		//this.name=n;
		this.age=age;
		//this.id=i;
		//this.next=ref;
	}	
	
	public String toString()
	{
		return name+"\t"+age+"\t"+id;
	}
}


