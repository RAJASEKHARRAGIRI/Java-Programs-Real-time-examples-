class LinkList
{
	Student start;
	Student end;
	Student next=null;
	
	//Create a multiple nodes
	void create(int age)
	{
		Student temp= new Student (age, next);
		if(start==null)
		{
			start=temp;
			end=start;
		}
		else
		{
			end.next=temp;
			end=temp; //or end=end.next;	
		}
	}

	//Display
	void traversal(Student nn)
	{
		Student current= nn;
		while(current!=null)
		{
			/*System.out.println(current.name);
			System.out.println(current.age);  	// print like this also but we declared the Tostring method 
			System.out.println(current.id);*/
			System.out.println(current);		// awoke the tostring method
			current=current.next;
		}
	}
	Student sort()
	{
		Student current=start;
		Student temp=current.next;
		
		while(current!=null)
		{
			temp=current.next;
			while(temp.next!=null)
			{
				if(current.age>temp.age)
				{
					int j=temp.age;
					temp.age=current.age;
					current.age=j;
					
				}
				temp=temp.next;
			}

			current=current.next;
		}return start;
		
		
	}
}




