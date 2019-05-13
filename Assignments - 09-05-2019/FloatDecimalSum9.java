 import java.text.DecimalFormat;

public class FloatDecimalSum9 {
    public static void main(String[] args) {
    	int numArgs = args.length;
        if (numArgs < 2) {
            System.out.println("This program requires two command-line arguments.");
        } 
        else {
	   double sum = 0.0;

	    for (int i = 0; i < numArgs; i++) {
                sum  =sum + Double.valueOf(args[i]).doubleValue();
	    }

	   
	    DecimalFormat myFormatter = new DecimalFormat("###,###.##");
	    String result = myFormatter.format(sum);

            System.out.println(result);
        }
    }
}