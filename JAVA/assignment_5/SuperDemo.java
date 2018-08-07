//2. WAP that illustrate how method can invoke a super class method. There is one supercalss A. class B 
//extends class A and class C extends class B. Each of these classes define a getdescription() method that 
//returns a string. That string includes description of the class plus description of each super class. Inherits 
//each of these class and invoke the gerdescription() method.

class A
{
	void getdescription()
	{
		System.out.println("In class A");
	}
}
class B extends A
{
	void getdescription()
	{
		super.getdescription();
		System.out.println("In class B");
	}
}
class C extends B
{
	void getdescription()
	{
		super.getdescription();
		System.out.println("In class C");
	}
}

class SuperDemo
{
	public static void main(String args[])
	{
		C c=new C();
		c.getdescription();
	}
}