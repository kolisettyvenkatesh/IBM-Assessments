 class SumCommand8 {
    public static void main(String[] args) {
	int n = args.length;
        if (n < 2) 
        {
            System.out.println("This program requires two command-line arguments.");
        }
         else
       {
	    int sum = 0;
        for (int i = 0; i < n; i++)
        {
            sum+=Integer.valueOf(args[i]).intValue();
	    }

            System.out.println("Result: "+sum);
        }
    }
}