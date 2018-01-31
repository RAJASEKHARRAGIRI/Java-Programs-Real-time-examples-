import java.util.*;
class Odd extends Thread
{
	Que q;
	Odd(Que x)
	{
		this.q=x;
	}
	public void run()
	{
		//Scanner s= new Scanner(System.in);
		//int num = s.nextInt();
		for (int i=1;i<=Input.num;i++)
		{
			if(i%2!=0)
				q.insert(i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException t)
			{}
		}	
	}
}
