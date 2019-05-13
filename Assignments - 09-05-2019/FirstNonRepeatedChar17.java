 public class FirstNonRepeatedChar17 {
 
    public static void main(String[] args) {
      String str = "venkatesh";
      for (char ch : str.toCharArray()) {
          if (str.indexOf(ch) == str.lastIndexOf(ch)) {
              System.out.println("First non repeated characted in String \""
              + str + "\" is:" + ch);
              break;
          }
      }
    }
}