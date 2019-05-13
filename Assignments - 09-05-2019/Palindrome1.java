radarimport java.util.Scanner;

class Palindrome1
{
	public static void main(String[] args) 
	{
		String str , rev ="" ;
		Scanner scn = new Scanner(System.in);

		System.out.println("enter a string to check palindrome");
		str = scn.nextLine();

		int length = str.length();
		System.out.println(length + " is string length");

      for ( int i = length - 1; i >= 0; i-- )
         rev = rev + str.charAt(i);

		if(str.equals(rev))
		{
			System.out.println( str + " is a Palindrome");
		}
		else
		{
			System.out.println( str + " is not a Palindrome");
		}

	}
}