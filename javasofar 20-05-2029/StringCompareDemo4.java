import java.util.*;
class StringCompareDemo4
{
	public static void main(String[] args) {
		DemoStringClass ds = new DemoStringClass();
		ds.compare();

	}

}
class DemoStringClass 
{
	 public void compare()
	{
		String array1, array2;
		Scanner scn = new Scanner(System.in);
		System.out.println("enter name :");
		String str = scn.nextLine();
		String[] strArray ;
		strArray = str.split("_job");
		array1 = strArray[0];
		array2 = strArray[1];
		if(array1.length() = 8)
		{
			if(array2 == "_job")
			{
				System.out.println("You are Logged In..");

			}
			else
			{
				System.out.println("Not Valid Id..");
			}
		}
		else{
			System.out.println("enter minimum of 8 characters for sure..");
		}
	}
}



