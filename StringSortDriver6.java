class StringSort{
	void sort(String words[]){
		java.util.Arrays.sort(words); 
        String firstHalf[] = new String[words.length/2];
        String secondHalf[] = new String[words.length/2];
        for (int i = 0; i < firstHalf.length ; i++ ) {
       	    firstHalf[i] = words[i].toUpperCase();
        }
        int k = 0;
        for (int i = words.length/2; i < words.length ; i++ ) {
       	    secondHalf[k] = words[i].toLowerCase();
       	    k++;
        }

        //joining the two strings
        String first = "", second = "";
        for (String s1 : firstHalf ) {
        	first += s1 + " ";
        }
        for (String s2 : secondHalf ) {
        	second += s2 + " ";
        }
        String finalString = first + " " + second;
        System.out.println("Result String: " + finalString);
	}
}

class StringSortDriver6{
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Please enter a some words to sort: ");
        String userInput = sc.nextLine();
        String words[] = userInput.split(" ");
        
        StringSort ob = new StringSort();
        ob.sort(words);
	}
}