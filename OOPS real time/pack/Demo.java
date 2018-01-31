
class Demo
{
    public static void main(String args[])
    {
		One obj = new One();
		obj.myFunction(100);
}
}
class One
{
	 public void  myFunction(int n)
    {
       if(n <= 1)
          return;
      if (n > 1)
      {
              System.out.println("*");//Java
        myFunction(n/2);
      }
   }
}
 