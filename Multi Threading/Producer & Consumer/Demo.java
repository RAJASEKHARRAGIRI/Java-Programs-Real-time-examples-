class Demo
{
	public static void main(String[] args)
	{
		Que data= new Que();
		Producer pobj= new Producer(data);
		pobj.start();
		Consumer cobj= new Consumer(data);
		cobj.start(); 
	}
}
