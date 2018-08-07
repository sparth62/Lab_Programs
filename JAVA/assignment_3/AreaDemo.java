//Write a Java program that displays area of different Figures(Rectangle,Square,Triangle) using the method overloading.
import java.util.Scanner;
class Area
{

	double area(int l)
	{
		return l*l;
	}

	double area(int l,int h)
	{
		return l*h;
	}

	double area(double b,double h)
	{
		return b*h*0.5;
	}
}

class AreaDemo
{
	public static void main(String args[])
	{
		int ch;
		int length;
		int height;
		double base;
		double v_height;
		Scanner s=new Scanner(System.in);
		Area a1=new Area();
		System.out.println("1.Square\n2.Rectangle\n3.Triangle");
		System.out.print("Enter your choice:");	
		ch=s.nextInt();
		switch(ch)
		{
			case 1: System.out.print("Enter length of side:");
				length=s.nextInt();
				System.out.println("Area is "+a1.area(length));
				break;
			case 2: System.out.print("Enter length of Rectangle:");
				length=s.nextInt();
				System.out.print("Enter height of Rectangle:");
				height=s.nextInt();
				System.out.println("Area is "+a1.area(length,height));
				break;
			case 3: System.out.print("Enter base of Triangle:");
				base=s.nextInt();
				System.out.print("Enter verticle height of Triangle:");
				v_height=s.nextInt();
				System.out.println("Area is "+a1.area(base,v_height));

		}
	}
}