//Write a program to enter two numbers and perform mathematical operations on them.
import java.util.Scanner;
class Calculator
{
	int a,b;
	long add()
	{
		return a+b;
	}
	long sub()
	{
		return a-b;
	}
	long mul()
	{
		return a*b;
	}
	long div()
	{
		return a/b;
	}
} 

class Calculator_Demo
{
	public static void main(String args[])
	{
		Calculator c1=new Calculator();
		Scanner s = new Scanner(System.in);

		System.out.print("Enter Integer:");
		c1.a=s.nextInt();
		System.out.print("Enter Integer:");
		c1.b=s.nextInt();
		
		long c;
		c=c1.add();
		System.out.println("Addistion="+c);
		c=c1.sub();
		System.out.println("Subtraction="+c);
		c=c1.mul();
		System.out.println("Multiplication="+c);
		c=c1.div();
		System.out.println("Division="+c);
	}
}