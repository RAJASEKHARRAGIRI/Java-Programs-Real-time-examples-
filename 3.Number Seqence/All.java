import java.io.*;
class All
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int a,b,c,d,i,r,l,m,s;
		System.out.println("Enter Starting:");
		String s1= br.readLine();
		int n=Integer.parseInt(s1);
		System.out.println("Enter Ending:");
		s1= br.readLine();
		int n1=Integer.parseInt(s1);
		/*for(i=n;i<=n1;i++)
		{
			a=i;
			b=i;
			d=i;
			c=0;
			l=0;
			while(a!=0)
			{

				l=b%10;
				a=a/10;
				c+=1;
			}
			if(c==1)
			{
				if(l!=0)
				{
					m=d/l;
					if(m==1)
					System.out.println(i+" ");
				}

			}
			if(c==2)
			{
				if(l!=0)
				{
					m=d/l;
					if(m==11)
					System.out.println(i+" ");
				}

			}
			if(c==3)
			{
				if(l!=0)
				{
					m=d/l;
					if(m==111)
					System.out.println(i+" ");
				}

			}
			if(c==4)
			{
				if(l!=0)
				{
					m=d/l;
					if(m==1111)
					System.out.println(i+" ");
				}

			}
			if(c==5)
			{
				if(l!=0)
				{
					m=d/l;
					if(m==11111)
					System.out.println(i+" ");
				}

			}
			
			
		}*/
		

		//Another logic
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
