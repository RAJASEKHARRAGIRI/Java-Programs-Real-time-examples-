import java.util.Scanner;
class Demo
{
	public static void main(String args[])
	{
		Scanner r=new Scanner(System.in); 
		int i,j,k,n,s;
		String c;
		Person obj[]=new Person[10];
		System.out.print("Enter the no of Students:");
		n=r.nextInt();
		for(i=0;i<n;i++)
		{
			obj[i]=new Person();
			System.out.print("Enter name:");
			obj[i].name=r.next();
			System.out.print("Enter age:");
			obj[i].age=r.nextInt();
			//System.out.print("Enter mail:");
			//obj[i].mail=r.next();
		}
		for(i=0;i<n;i++)
			obj[i].print_details();
		System.out.println("After sorting with respect to age");
		for(i=0;i<n-1;i++)
		{
			for(j=i+1;j<n;j++)
			{
			if(obj[i].age>obj[j].age)
			{
				//for age
				s=obj[i].age;
				obj[i].age=obj[j].age;
				obj[j].age=s;
				//for name
				c=obj[i].name;
				obj[i].name=obj[j].name;
				obj[j].name=c;	
			}
			}
		}
		for(i=0;i<n;i++)
			obj[i].print_details();
	}
}
