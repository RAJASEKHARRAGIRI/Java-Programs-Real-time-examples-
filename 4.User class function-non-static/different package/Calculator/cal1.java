import java.util.*;

class Cal_demo
{
	public static void main(String[] args)
	{
	Scanner s= new Scanner(System.in);
	Cal c= new Cal();
	System.out.println("Enter A value:");
	int a= s.nextInt();
	System.out.println("Enter B value:");
	int b= s.nextInt();
	System.out.println("Enter UR Choice 1: add ...2: sub... 3: mult ..4: div");
	int z= s.nextInt();
	if(z==1)
	{
		int m=c.add(a,b);
		System.out.println("Addition: "+m);
	}
	else if(z==2)
	{
		int m=c.sub(a,b);
		System.out.println("Sub: "+m);
	}
	else if(z==3)
	{
		int m=c.mul(a,b);
		System.out.println("Mul: "+m);
	}
	else if(z==4)
	{
		int m=c.div(a,b);
		System.out.println("Div: "+m);
	}
	else 
		System.out.println("Enter option is not valid");
		
}
}

