/*.  WAP a program that illustrates interface inheritance. Create two interface p1 and p2 . create Interface p  which extends p1 and p2 and then create interface p12 which extends p12. Each interface declare one constants and one method. Create class Q which implements p12 and define all the methods of interface which displays value of constants. */

interface P1
{
	double a=10;
	void display1();
}
interface P2
{
	double b=20;
	void display2();
}
interface P extends P1,P2
{
	double c=30;
	void display3();
}
interface P12 extends P
{
	double d=40;
	void display4();
}
class Q implements P12
{
	public void display1()
	{
		System.out.println("A:" +a);
	}
	public void display2()
	{
		System.out.println("B:" +b);
	}
	public void display3()
	{
		System.out.println("C:" +c);
	}
	public void display4()
	{
		System.out.println("D:" +d);
	}
}
class Inter_InheritDemo
{
	public static void main(String args[])
	{
		Q q= new Q();
		q.display1();
		q.display2();
		q.display3();
		q.display4();
	}
}
