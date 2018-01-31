class Consumer extends Thread
{
	Que q;
	Consumer(Que y)
	{
		this.q= y;
	}
	public void run()
	{
		for (int i=0;i<10;i++)
		{
			System.out.println("consumer"+q.get());

		}	
	}
}
