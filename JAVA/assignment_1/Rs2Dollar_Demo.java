 //Write a program to convert rupees to dollar. 60 rupees=1 dollar. 
import java.util.Scanner;
class Rs2Dollar
{
	int rs;
	float convert()
	{
		float dollar=(float)rs/60;
		return dollar;
	}
}

class Rs2Dollar_Demo
{
	public static void main(String args[])
	{
		Rs2Dollar r1=new Rs2Dollar();
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Rs:");
		r1.rs=s.nextInt();
		float ans=r1.convert();
		System.out.println("Dollar="+ans);	
	}	
}