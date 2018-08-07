// Write a program that calculate percentage marks of the student if marks of 6 subjects are given.
import java.util.Scanner;
class Percentage
{
	float s[]= new float[6];
	double avg()
	{
		double percentage=(s[0]+s[1]+s[2]+s[3]+s[4]+s[5])/6;
		return percentage;
	}
}
class Percentage_Demo
{
	public static void main(String args[])
	{
		Percentage p1=new Percentage();
		Scanner s = new Scanner(System.in);
		System.out.print("Enter 6 subject's marks:");
		p1.s[0]=s.nextFloat();
		p1.s[1]=s.nextFloat();
		p1.s[2]=s.nextFloat();
		p1.s[3]=s.nextFloat();
		p1.s[4]=s.nextFloat();
		p1.s[5]=s.nextFloat();
		double ans=p1.avg();
		String grade;
		if(ans >90)
		{
			grade="A+";
		}
		else if(ans<90 && ans >80)
		{
			grade="A";
		}
		else
		{
			grade="B+";
		}
		System.out.println("Your Percentage="+ans+" and your grade is "+grade);
	}
}