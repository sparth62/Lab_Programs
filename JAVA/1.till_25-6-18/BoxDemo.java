//Program to calculate volume of box
class Box
{
	double width;
	double height;
	double depth;
}

class BoxDemo
{
	public static void main(String args[])
	{
		Box b1=new Box();
		b1.width=10;
		b1.height=10;
		b1.depth=20;
		double ans=b1.depth*b1.height*b1.width;
		System.out.print("Volume is "+ans);
	}
}