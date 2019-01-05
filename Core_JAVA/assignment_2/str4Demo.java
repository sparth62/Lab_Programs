//Write a program to find that given number or string is palindrome or not.
import java.util.Scanner;
class Str4Demo
{
	public static void main(String args[])
	{
		String s1=new String();
		Scanner s=new Scanner(System.in);
		int ispalindrome=0;
		System.out.print("Enter String:");
		s1=s.next();
		int front=0;
		int last=s1.length()-1;
		while(front<last)
		{
			if(s1.charAt(front++)!=s1.charAt(last--))
				ispalindrome=1;
		}
		if(ispalindrome==1)
			System.out.println("String is not palindrome");
		else
			System.out.println("String is palindrome");
	}
}
