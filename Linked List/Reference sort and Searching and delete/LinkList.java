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
		}}+
		

	
	//Display
	void traversal()
	{
		Student current= start;
		while(current!=null)
		{
			
			System.out.println(current);		// awoke the "tostring" method
			current=current.next;
		}
	}

	//Searching
	void search(String key)
	{
		Student current=start;
		int flag=0;
		
		while(current!=null)
		{
			if(current.id.equals(key))
			{
				flag++;
				break;
			}
			else
				current=current.next;
		}
		if(flag>0)
		{
			System.out.println("Entered ID  "+key+" Found!!!!");
		}
		else
			System.out.println("Entered ID "+key+" NOT Found!!!!");
		
	}


	//Sorting
	Student sort()
	{	int n=6;
		
		while(n>0)
		{
			Student current=start;
			Student post=start.next;
			Student pre= null;
			int in=n,i=0;
			
			while(i<in)
			{
				if(current.name.compareTo(post.name)>0)
				{
					current.next=post.next;
					post.next=current;
					if(pre==null)
					{
						pre=post;
						start=pre;
					}
					else
					{
					
							pre.next=post;					
					}
					
					
				}
				if(post.next ==current)
				{
					pre=post;
					post=current.next;
				}
				else
				{
					pre=current;
					current=current.next;
					post=post.next; // or current.next	
				}
				i++;	
			}
			n--;
			
		}
		return start;
	}	
	//Deletion part
	void delete(String key)
	{
		Student current=start;
		if(current.next.equals(key))
		{
			current=current.next;
			return;
		}
		else
		{
			while(current.next.next!=null)
			{
				if(current.next.name.equals(key))
				{
					current.next=current.next.next;
					return;
				}
				else
				{
					current=current.next;
					
				}
			}
			if(current.next.name.equals(key))
			{
				end=current;
				end.next=null;
				return;
		 	}
			
		}
	
	}
	
	
}




