class Box3
{
	double width;
	double height;
	double depth;

	Box3(double w,double h,double d)
	{
		width=w;
		height=h;
		depth=d;
	}

	double volume()
	{
		return width*height*depth;
	}
}

class Box3Demo
{
	public static void main(String args[])
	{
		Box3 b1=new Box3(50,29,50);
		System.out.println("Volume="+b1.volume());
	}
}