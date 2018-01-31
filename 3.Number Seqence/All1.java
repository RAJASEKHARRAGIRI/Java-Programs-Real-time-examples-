mport java.util.*;
class Number
{
	public static void main(String[] args) 
	{
		int i,n,r,a,s;
		Scanner m= new Scanner(System.in);
		System.out.println("Enter Starting");
		n=m.nextInt();
		System.out.println("Enter ending");
		int n1=m.nextInt();
		for (i=n;i<=n1;i++) 
		{	
			s=i;
			if(s%10!=0)
			{
				n=s%10;
				r=s/n;
				a=r;	
				if (a==1111)
				System.out.println(i);
				else if (a==1)
				System.out.println(i);
				else if (a==111)
				System.out.println(i);
				else if (a==11)
				System.out.println(i);
		}	}
	}
}
