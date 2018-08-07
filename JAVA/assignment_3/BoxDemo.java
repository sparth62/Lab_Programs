//Create a class Box and display the area of box using a method area(). Initialize all the variables using Constructor and demostrate Constructor Overloading.                                                                       
import java.util.Scanner;
class Box
{
	double width,height,depth;
	Box()
	{
		Scanner s= new Scanner(System.in);
		System.out.print("Enter Height:");
		height=s.nextDouble();
		System.out.print("Enter Width:");
		width=s.nextDouble();
		System.out.print("Enter Depth:");
		depth=s.nextDouble();
	}
	Box(Box b)
	{
		width=b.width;
		depth=b.depth;
		height=b.height;
	}
	Box(double w,double d,double h)
	{
		width=w;
		depth=d;
		height=h;
	}
	void area()
	{
	System.out.println("Area ="+width*height*depth);
	}
}
class BoxDemo
{
	public static void main(String args[])
	{
		Box b1=new Box();
		b1.area();
		Box b2=new Box(5,10,15);
		b2.area();	
		Box b3=new Box(b1);
		b3.area();
	}
	
}