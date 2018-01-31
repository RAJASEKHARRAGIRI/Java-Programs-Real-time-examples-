import java.util.Scanner;
class Add
{
	public static void main(String[] args) 
	{
		
		Scanner s= new Scanner(System.in);
		int i,j,a,b,c,l,k,m;
		System.out.print("Enter 1: );
		a=s.nextInt();
		System.out.print("Enter 2: );
		b=s.nextInt();
		for(k=a;k<=b;k++)
		{
			d=k;
			while(d!=0)
			{
				c=d%10;
				l+=1;
			}
			if(l==2)
				x=1;
			else if(l==3)
				x=2;
			else if(l==4)
				x=3;
			else if(l==5)
				x=4;
			for (i=1;i<8;i++ )
			{
				for(j=i;j<=i+x;j++)
				{
					if(j!=10)
						System.out.print(j);
					else
						System.out.print(0);
				}
				System.out.println();
			}
		}
	}
}
