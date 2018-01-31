import java.util.*;
import java.lang.*;
import java.io.*;
class SLL
{
	public static void main(String args[])
	{
		LinkedList<Student> ll=new LinkedList<Student>();
		ll.add(new Student("Aruna",20));
		ll.add(new Student("Abhi",5));
		ll.add(new Student("Eswar",21));
		ll.add(new Student("Akhi",2));
		System.out.println("Single linked list is: "+ll);
		Collection.sort(ll);
		System.out.println("Single linked list is: "+ll);
	}
}
class Student
{
	String name;
	int age;
	public Student(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public String toString()
	{
		return this.name+" "+this.age;
	}
}
