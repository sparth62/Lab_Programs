class StringDemo
{
	public static void main(String args[])
	{
		//string counstrator
		String s1=new String();
		s1="Hello";
		
		char ch[]={'H','e','l','l','o'};
		String s2=new String(ch,1,3); //(char chars[],int startIndex, int endIndex) ; output will be "ell"
		
		String s3= new String(s1); //(String obj)

		//---------------------------------------------------------------------------------------------------------
		int len=s1.length(); //for length of string
		//---------------------------------------------------------------------------------------------------------
		char c=s1.charAt(1); // (index); extract character from string
		//---------------------------------------------------------------------------------------------------------
		//char s[]=getChars(1,3); //(int stringStart, int StringEnd, char target[], int targetEnd)
		//---------------------------------------------------------------------------------------------------------
		System.out.println(s1.equals(s2)); //for string comparision RETURN TYPE BULLEAN
		System.out.println(s1.equalsIgnoreCase(s2)); //for string comparision with ignoreCase RETURN TYPE BULLEAN
		//---------------------------------------------------------------------------------------------------------
		System.out.println(s1.startsWith("He")); //for check starting of string ARGUMENT MUST BE STRING
		System.out.println(s1.endsWith("llo")); //for check ending of string ARGUMENT MUST BE STRING
		//---------------------------------------------------------------------------------------------------------
		int value= s1.compareTo(s2); //For string comparision RETURN TYPE INT
		/* if value>0 : s1(invoking)>s2 ; 
		   if value<0 : s1<s2; "Ell" < "ell"
		   if value==0 : s1=s2; */
		//---------------------------------------------------------------------------------------------------------
		//Searching a string
		System.out.println(s1.indexOf('o')); //(char ch) Return index of charactor RETURN TYPE INT
		System.out.println(s1.indexOf("ell")); //(String str) Return index of Starting charactor of String RETURN TYPE INT
		System.out.println(s1.lastIndexOf('o')); //(char ch) Return last used index of charactor RETURN TYPE INT
		System.out.println(s1.lastIndexOf("ell")); //(String str) Return last used starting index of string RETURN TYPE INT

		/* For Example
			s1="This is example of Java program";
			s1.indexOf('h')  -> 1
			s1.indexof("is") -> 2
			s1.lastIndexOf('a') -> 29
			s1.lastIndexOf("is") -> 5 */
		//---------------------------------------------------------------------------------------------------------


	}
}