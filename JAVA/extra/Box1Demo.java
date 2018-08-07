class Box1
{
	double width;
	double height;
	double depth;
}

class Box1Demo
{
	public static void main(String args[])
	{
		Box1 b1=new Box1();
		b1.width=50;
		b1.height=29;
		b1.depth=50;
		System.out.println("Volume="+(b1.width*b1.height*b1.depth));
	}
}