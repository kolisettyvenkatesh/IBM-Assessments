import java.util.Scanner;
class Reverse2
{
	public static void main(String[] args) 
	{
		String str , rev = "";
		Scanner scn = new Scanner(System.in);

		System.out.println("enter a string to reverse : ");

		str = scn.nextLine();

		int length = str.length();

		System.out.println(length + " is given string length ");

		for (int i = length-1; i>= 0; i-- )
		 {
			rev = rev + str.charAt(i);	
		}

			System.out.println("Reversed string is :" + rev);
	}
}