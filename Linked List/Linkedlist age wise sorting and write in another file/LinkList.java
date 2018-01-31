import java.io.*;
class LinkList
{
	Student start;
	Student end;
	Student next=null;
	
	//Create a multiple nodes
	void create(String name, int age,String id)
	{
		Student temp= new Student (name, age, id, next);
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
	void traversal()
	{
		Student current= start;
		while(current!=null)
		{
			/*System.out.println(current.name);
			System.out.println(current.age);  	// print like this also but we declared the Tostring method 
			System.out.println(current.id);*/
			System.out.println(current);		// awoke the "tostring" method
			current=current.next;
		}
	}
	//Sorting
	Student sort()
	{
		Student current=start;
		Student temp;
		while(current!=null)
		{
			temp=current.next;
			while(temp!=null)
			{
				if(current.age>temp.age)
				{
					
					int i=current.age;
					current.age = temp.age;
					temp.age=i;	

					String mm=current.name;
					current.name = temp.name;
					temp.name=mm;	

					String id=current.id;
					current.id = temp.id;
					temp.id=id;	
				}
				temp=temp.next;			
			}
			current=current.next;
		}
		return start;
	}	
	
}




