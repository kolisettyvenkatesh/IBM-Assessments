  import java.util.Scanner;
   public class AnagramStrings7{
    public static boolean areAnagrams(String string1, String string2)
     {

        String s1 = removeJunk(string1);
        String s2 = removeJunk(string2);

	    s1 = s1.toLowerCase();
	    s2 = s2.toLowerCase();

	    s1 = sort(s1);
	    s2 = sort(s2);

        return s1.equals(s2); 
    }
    protected static String removeJunk(String string) {
        int i, len = string.length();
        StringBuilder sb = new StringBuilder(len);
  		char ch;

	    for (i = (len - 1); i >= 0; i--) {
	        ch = string.charAt(i);
	        if (Character.isLetter(ch)) {
		        sb.append(ch);
	        }
	    }

        return sb.toString();
    }

    protected static String sort(String string) {
	    char[] charArray = string.toCharArray();

	    java.util.Arrays.sort(charArray);

        return new String(charArray);
    }

    public static void main(String[] args) {
        // String string1 = "parliament";
        // String string2 = "partial men!";

        String string1 , string2 ;

        Scanner scn = new Scanner(System.in);

            System.out.println("enter  two strings..");

         string1 = scn.nextLine();
         string2 = scn.nextLine();
        

        System.out.println();
        System.out.println("Testing whether the following strings are anagrams:");
        System.out.println("    String 1: " + string1);
        System.out.println("    String 2: " + string2);
        System.out.println();

        if (areAnagrams(string1, string2))
         {
            System.out.println("They ARE anagrams!");
        }
        else
         {
            System.out.println("They are NOT anagrams!");
         }
        System.out.println();
    }
}