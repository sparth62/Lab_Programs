// Write a program to accept a line and check how many consonants and vowels are there in line.  
//Write a program to count the number of words that start with capital letters.  
import java.util.Scanner;
class Str2_3Demo
{
	public static void main(String args[])
	{
		String s1=new String();
		Scanner s=new Scanner(System.in);
		int consonants=0,vowels=0,words=0,i=0;
		System.out.print("Enter String:");
		s1=s.nextLine();
		for(i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i' || s1.charAt(i)=='o' || s1.charAt(i)=='u' || s1.charAt(i)=='A' || s1.charAt(i)=='E' || s1.charAt(i)=='I' || s1.charAt(i)=='O' || s1.charAt(i)=='U')
				vowels++;
			else if(s1.charAt(i)!=' ')
				consonants++;
			else if(s1.charAt(i)==' ')
			{
				if(s1.charAt(i+1)>=65 && s1.charAt(i+1)<=90)
					words++;
			}
		}
		if(s1.charAt(0)>=65 && s1.charAt(0)<=90)
			words++;
		System.out.println("vowels:"+vowels+" consonants:"+consonants+" words:"+words);
	}
}