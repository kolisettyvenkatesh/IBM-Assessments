class AgeValidationException5{
	public static void main(String[] args) throws MyException
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter Age:");
		int age = sc.nextInt();
		if (age<15) 
		{
			throw new MyException("Enter correct age! Age must be greater than 15.");
		}
		else
		{
			System.out.println("yes");
		}
	}
}
class MyException extends Exception{
     
    MyException(String str){
        super(str);
    }
}