import java.util.*;
class Prime extends Thread
{
	Que q;
	Prime(Que x)
	{
		this.q=x;
	}
	public void run()
	{
		//Scanner s= new Scanner(System.in);
		//int num = s.nextInt();
		for (int i=1;i<=Input.num;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
					count++;
			}

			if(count==2)
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
