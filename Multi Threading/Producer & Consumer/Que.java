class Que
{
	int k;
	boolean status;
	synchronized public void insert(int x)
	{
		try{
			if(status)	
			{
				wait();     // waiting the conusmer
			}
			this.k=x;
			status=true;
			notify();    // notify the consumer
		}
		catch(InterruptedException e)
		{

		}
	}
	synchronized public int get()
	{	try{
		
			if(!status)
			{
				wait();
			}	
			System.out.println("que"+k);
			status =false;
			notify();	
		}
		catch(InterruptedException e)
		{
			
		}
		return k;
	}
}
