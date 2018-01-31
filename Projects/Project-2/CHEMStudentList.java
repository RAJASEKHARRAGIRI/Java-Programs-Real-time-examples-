import java.io.*;
import java.util.*;
class CHEMStudentList extends METALStudentList
{
	EngineeringStudent start;
	EngineeringStudent end;
	EngineeringStudent next=null;
	int len=0,l;
	
	
	//Create a multiple nodes
	void create(String name, String id,String ph,String mail,String dob,int age,String branch,String c_room,Float cgpa)
	{
		EngineeringStudent temp= new EngineeringStudent(name, id,ph,mail,dob,age,branch,c_room,cgpa, next);
		len+=1;
		l=len;
		if(start==null)
		{
			start=temp;
			end=start;
		}
		else
		{
			end.next=temp;
			end=temp; 
		}
	}
	// Insertion
	void insert()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Elements to insert to Linkedlist: ");
		System.out.println("Enter Student Name: ");
		String name= s.next();
		System.out.println("Enter Student ID: ");
		String id= s.next();
		System.out.println("Enter Student PH-no: ");
		String ph= s.next();
		System.out.println("Enter Student mail ID: ");
		String mail=s.next();
		System.out.println("Enter Student DOB: ");
		String dob=s.next();
		System.out.println("Enter Student Age: ");
		int age=s.nextInt();
		System.out.println("Enter Student Branch (Uppercase Letters): ");
		String branch= s.next();
		System.out.println("Enter Student Class Room: ");
		String c_room= s.next();
		System.out.println("Enter Student Cgpa: ");
		Float cgpa=s.nextFloat();
		create(name,id,ph,mail,dob,age,branch,c_room,cgpa);
		System.out.println("Successfully You Insert Data!!!! ");

	}


	//Searching
	void search(String key)
	{
		EngineeringStudent current=start;
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
			System.out.println("*********************************");
			System.out.println("Entered ID Details are Found:-\n"+"==>  "+current);
			System.out.println("*********************************");
		}
		else
			{
			System.out.println("*************************************************");
			System.out.println("Entered ID  "+key+" is NOT Found....Try Again!!!!");
			System.out.println("*************************************************");
			}
		
	}


	//Sorting
	void sort()
	{	
		
		int n=len-1;
		while(n>0)
		{
			EngineeringStudent current=start;
			EngineeringStudent post=start.next;
			EngineeringStudent pre= null;
			int in=n,i=0;
			
			while(i<in)
			{
				if(current.id.compareTo(post.id)>0)
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
		
		
	}	
	//Deletion part
	int delete(String key)
	{
		
		EngineeringStudent current=start;
		if(current.id.equals(key))
		{
			start=current.next;
			len--;
			return 1 ;
		}
		else
		{
			while(current.next.next!=null)
			{
				if(current.next.id.equals(key))
				{
					current.next=current.next.next;
					len--;
					return 1;
				}
				else
				{
					current=current.next;
				}
			}
			if(current.next.id.equals(key))
			{
				end=current;
				end.next=null;
				len--;
				return 0;
		 	}
			
		}return 0;
	
	}
	//duplication Deletion
	void duplicate()
	{
		EngineeringStudent current=start;
		EngineeringStudent post= current.next;
		while(current!=null)
		{
			while(post!=null)
			{
				if(current.id.equals(post.id))
				{
					delete(post.id);
					len--;
				}
				post=post.next;
			}
			current=current.next;
		}
	}
	//Display
	void traversal()
	{	
		if(l!=len)
		{
			System.out.println("Successfully Deleted!!!! Updated List:");
			l--;
		}
		
		EngineeringStudent current= start;
		while(current!=null)
		{
			System.out.println(current);
			current=current.next;
		}
	}

	void infoFile()throws IOException
	{
		EngineeringStudent current=start;
		FileWriter fw=new FileWriter("CHEM.txt");
		BufferedWriter bw= new BufferedWriter(fw);
		bw.write("Sorted list by ID Wise:-"+"\n");
		
		while(current!=null)
		{
			
			bw.write(current+"\n");
			current=current.next;
			
		}
		
		bw.close();
		fw.close();
	}
	
}




