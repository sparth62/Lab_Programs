//Write a program to find length of string and print second half of the string.
import java.util.Scanner;

class Str1Demo
{
	public static void main(String args[])
	{
		String s1=new String();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String:");
		s1=s.next();
		//Str1 s1=new Str1(s.nextString());
		System.out.println("Length="+s1.length());
		System.out.println("second half of string :"+s1.substring((s1.length()/2),(s1.length()))); //Second argument is optional
	}
}