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
			
			System.out.println(current);		// awoke the "tostring" method
			current=current.next;
		}
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
	
}




