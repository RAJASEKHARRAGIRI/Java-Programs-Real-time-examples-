class person
{
	String name;
	int age;
	String gender;
void walking()
{
System.out.println("person can walking");
}
void talking()
{
System.out.println("person can talking ");
}
void eating()
{
System.out.println("person can eating");
}
void playing()
{
System.out.println("person can playing");
}
void display()
{
System.out.println(name);
System.out.println(age);
System.out.println(gender);
}
}
class persondemo
{
public static void main(String args[])
{
person rahul=new person();
rahul.walking();
rahul.talking();
rahul.eating();
rahul.name =" Simhadri Raviteja";
rahul.age=19;
rahul.gender="male";
rahul.display();
}
}
