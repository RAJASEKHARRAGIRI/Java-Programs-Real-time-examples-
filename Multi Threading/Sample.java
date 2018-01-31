// thread predife class using multi threading
class Sample
{
	public static void main(String[] sekhar)
	{
		Even obj= new Even();   // obj is thread object
		obj.start();    // starting the thread
		Odd obj1= new Odd();
		obj1.start();
	}
}
