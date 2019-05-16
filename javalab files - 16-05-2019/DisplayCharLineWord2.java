import java.io.*;

class DisplayCharLineWord2
{
	public static void main(String[] args) throws Exception
	{
		int lineCount = 0, charCount = 0, wordCount = 0;
		String line;

		File file = new File("anotherFile.txt");

		FileReader fr = new FileReader(file);

		BufferedReader br = new BufferedReader(fr);

        while((line = br.readLine()) != null) 
        { 
        	lineCount++;

            if(!(line.equals(""))) 
            { 
                charCount = charCount + line.length();
                String[] s = line.split("\\s"); 
                  
                wordCount = wordCount + s.length;

                
            } 
		
		}
		System.out.println("Total word count : " + wordCount );
                System.out.println("Total line count : " + lineCount );  
                System.out.println("Total char count : " + charCount );  

	}
}