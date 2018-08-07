//3. The abstract vegetable class has three subclasses named Potato, Brinjal and Tomato. Write a program that demonstrates how to establish this class hierarchy. Declare one instance variable of type String that indicates the color of a vegetable. Crete and display instances of these objects. Override the toString() method of Object class to return a string with the name of vegetable and its color.
abstract  class Vegetable
{
	String color;
	public String toString()
	{
		return getClass().getName() + ":" +color;
	}
}
class Potato extends Vegetable
{
	Potato()
	{
		color="cream";
	}
}
class Brinjal extends Vegetable
{
	Brinjal()
	{
		color="violet";
	}
}
class Tomato extends Vegetable
{
	Tomato()
	{
		color="red";
	}
	
}
class VegitableDemo
{
	public static void main(String args[])
	{
		Vegetable ref=new Potato();
		System.out.println(ref);
		ref=new Brinjal();
		System.out.println(ref);
		ref=new Tomato();
		System.out.println(ref);
	}
}