import java.util.Arrays;
import java.util.Scanner;

class PositiveString2
{
	public static void main(String[] args)
	 {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the string : ");
		String s = scn.nextLine();

		if(isInOrder(s))
		{
			System.out.println("It is a Positive String.");
		}
		else
		{
			System.out.println("It is a Negative String.");

		}
	}
		static boolean isInOrder(String s)
		{
			int n = s.length();

			char ch[] = new char[n];
		
			for(int i=0; i<n; i++)
			{
				ch[i] = s.charAt(i);
			}

			Arrays.sort(ch);

			for(int i=0; i<n; i++)
			{
				if(ch[i]!= s.charAt(i))
					return false;

			}
			return true;
		}


		}




	
