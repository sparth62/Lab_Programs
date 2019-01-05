//1.  WAP that create interface on that you declare one method interest(p,r,n) then create two class  simple and compound that implements interest and find simple and compound interest.
import java.util.Scanner;
import java.io.*;     			
interface Interest_counter
{
	void interest(int p,double r,int n);
}

class Simple implements Interest_counter
{
	public void interest(int p,double r,int n)
	{
		System.out.println("Simple interest:"+((p*r*n)/100));
	}
}

class Compound implements Interest_counter
{
	public void interest(int p,double r, int n)
	{
		System.out.println("Compound interest :"+ ((p *(Math.pow((1 + r/100),n)))-p));
	}	
}
class InterestDemo
{
	public static void main(String args[])
	{
		int p,n;
		double r;
		Scanner s= new Scanner(System.in);
		System.out.print("Enter amount:");
		p=s.nextInt();
		System.out.print("Enter time in Year:");
		n=s.nextInt();
		System.out.print("Enter rate:");
		r=s.nextDouble();
		Interest_counter count;
		count=new Simple();
		count.interest(p,r,n);
		count=new Compound();
		count.interest(p,r,n);
	}
}