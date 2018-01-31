import java.io.*;
class Consumer extends Thread
{
	Que q;
	Consumer(Que y)
	{
		this.q= y;
	}
	public void run()
	{

		for (int i=0;i<=Input.num;i++)
		{
			int m=q.get();
			try{this.file(m);}catch(Exception e){}
			
			System.out.println("Done!! Write into file:"+m);

		}	
	}
	public void file(int num)throws IOException
	{
		FileWriter fr= new FileWriter("Even.txt",true);
		BufferedWriter br= new BufferedWriter(fr);
		br.write(num+ "\n");
		br.close();
		fr.close();

	}
}
