class Producer extends Thread
{
	Que q;
	Producer(Que x)
	{
		this.q=x;
	}
	public void run()
	{
		for (int i=0;i<10;i++)
		{
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
