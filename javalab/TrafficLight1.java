class TrafficLight1{
	public static void main(String[] args) {
		System.out.println("Select one of the three lights:\n 1. Red\n 2.Yellow\n 3.Green");

		java.util.Scanner sc = new java.util.Scanner(System.in);
		int light = sc.nextInt();

		if (light==1) 
		{
			System.out.println("Stop");	
		}

	else if (light==2) 
	{
		System.out.println("Ready");	
	}
	else if (light==3)
	{
		System.out.println("Go");
	}

	else
		System.out.println("Enter valid Input");

	}
}