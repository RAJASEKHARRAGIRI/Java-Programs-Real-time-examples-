import java.util.*;
class Demo
{
	
	public static void main(String[] rrs)
	{
		System.out.println("Enter Limit: ");
		Scanner s= new Scanner(System.in);
		Input obj= new Input();
		obj.num = s.nextInt();
		Que data= new Que();
		Odd pobj= new Odd(data);
		pobj.start();
		Consumer cobj= new Consumer(data);
		cobj.start(); 
	}
}
