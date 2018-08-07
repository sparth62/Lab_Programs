//1. WAP that create abstract class figure. 
//Declare area method in this class. class Rectangle and Circle inherits  class Figure.
//Write the method in all class that prints the area of respective Figure.
import java.util.Scanner;
abstract class Figure
{
	double dim1,dim2;
	Figure(double a,double b)
	{
		dim1=a;
		dim2=b;
	}
	Figure(double a)
	{
		dim1=a;
	}
	abstract double area();
}

class Rectangle extends Figure
{
	Rectangle(double a,double b)
	{
		super(a,b);
	}
	double area()
	{
		return dim1*dim2;
	}
}
class Circle extends Figure
{
	Circle(double r)
	{
		super(r);
	}
	double area()
	{
		return dim1*dim1*3.14;
	}
}

class AbstractAreaDemo
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		Figure f;
		double a,b;
		double ans;
		System.out.println("1.Rectangle\n2.Circle");
		System.out.print("Enter your choice:");
		int ch=s.nextInt();
		switch(ch)
		{
			case 1:
				System.out.print("Enter Length of Rectangle:");
				a=s.nextDouble();
				System.out.print("Enter width of Rectangle:");
				b=s.nextDouble();
				f=new Rectangle(a,b);
				ans=f.area();
				System.out.println("Area of Rectangle="+ans);
				break;
			case 2:
				System.out.print("Enter radius of Circle:");
				a=s.nextDouble();
				f=new Circle(a);
				ans=f.area();
				System.out.println("Area of Circle="+ans);
				break;
		}
	}
}