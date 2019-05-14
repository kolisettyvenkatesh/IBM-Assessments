import com.cg.eis.exception.EmployeeException;
class SalaryException6
{
	public static void main(String[] args) {
	java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter Salary:");
		int sal = sc.nextInt();
		try{
			new SalaryException6().salExcep(sal);
		}
		catch(Exception se)
		{
			System.out.println(se);
		}
	}
	void salExcep(int sal) throws EmployeeException
	{
		if(sal<3000)
		{
			throw new EmployeeException("Salary must be above 3000!");
		}
		else
		{
			System.out.println("yes");
		}
	}

}