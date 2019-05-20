import java.util.*;
class StringTokenizer1
{
	public static void main(String args[])
	{       
			int n,sum = 0;
			String temp;
			Scanner s = new Scanner(System.in);
			System.out.print("Enter a line of numbers: ");
			String input = s.nextLine();
			StringTokenizer st = new StringTokenizer(input);
		
			while(st.hasMoreTokens())
			{
				n = Integer.parseInt(st.nextToken());
				sum = sum + n;
				System.out.println("Number is:" +n +"\t");

			}
			System.out.println("Sum of the numbers is: "+sum);
	}
}