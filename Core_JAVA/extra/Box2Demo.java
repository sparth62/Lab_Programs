class Box2
{
	double width;
	double height;
	double depth;

	void setDim(double w,double h,double d)
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

class Box2Demo
{
	public static void main(String args[])
	{
		Box2 b1=new Box2();
		b1.setDim(50,29,50);
		System.out.println("Volume="+b1.volume());
	}
}