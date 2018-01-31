//import java.util.Scanner;
class Pattern
{
public static void main(String args[])
{
	int i=1,j=2,k=3,l=4,a,b,c,d,e;
	while(i<8)
	{
		a = i++ * 1000;
		b = j++ * 100;
		c = k++ * 10;
		if(l>9)
		{
			l=0;
			d = l++ * 1;
		}
		else	
		{
		d = l++ * 1;
		}
		e = a+b+c+d;
		System.out.println(e);
	}
}
}
