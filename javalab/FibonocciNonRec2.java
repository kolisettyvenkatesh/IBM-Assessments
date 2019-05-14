import java.util.Scanner;

class FibonocciNonRec2 
{
	public static void main(String[] args) 
	{
		
		Scanner scn = new Scanner(System.in);

		int a=1, b=1, c=0;
  		
		System.out.println("enter the number n : ");
  		
  		int n = scn.nextInt();

  		System.out.print(a);

  		System.out.print(" " + b);

  			for (int i=0; i < n-2; i++)
  			 {
  					
  			 	c = a + b;
  			 	a = b;
  			 	b = c;

  			 	System.out.print(" " +c);
  			}
			System.out.println();  			

  			System.out.print(n+"th value of series is " + c);


	}
}