class Demo
{
	public static void main(String[] args)
	{
		Sample obj= new Sample("Rajasekhar",121886);
		Thread one=  new Thread(obj);
		one.start();
		Sample1 obj1= new Sample1("Rajasekhar",121886);
		Thread two=  new Thread(obj1);
		two.start();
		}
}
