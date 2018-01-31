//Dynamic polymorism
class Demo
{
	public static void main(String[] args)
	{
		B obj=new B();
		A objA=new B();
		//objA.m1(); //if over ride the method in B it excutes
		objA.m2();// not over ride the method. excutes there own refernece
		objA.m1();
		
	}
}
