import java.util.Scanner;

public class Cubes5

{

   public static void main(String[] args)

    {
        int result = 0;
        System.out.print("Enter the number :");

        Scanner scan = new Scanner(System.in);

	    int number = scan.nextInt();
		 
        while(number != 0)
        {
        
            int remainder = number%10;
        
            result = result + (remainder*remainder*remainder);
        
            number = number/10;
        }
        
        System.out.println(result);

     }

}