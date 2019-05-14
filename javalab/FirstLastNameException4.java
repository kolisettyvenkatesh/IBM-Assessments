class FirstLastNameException4{
	public static void main(String[] args) throws MyException
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter First Name:");
		String fname = sc.nextLine();
		System.out.println("Enter Last Name:");
		String lname = sc.nextLine();
		if (fname.equals("")||lname.equals("")) 
		{
			throw new MyException("First name or Last name is blank!");
		}
	}
	
}

class MyException extends Exception{
     
    MyException(String str){
        super(str);
    }
}