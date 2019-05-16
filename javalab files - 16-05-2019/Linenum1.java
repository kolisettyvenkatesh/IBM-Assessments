import java.io.*;

class Linenum1
{
	public static void main(String[] args) throws Exception {
		
		int count = 0;
		String s;

		File file = new File("anotherFile.txt");

		FileReader fr = new FileReader(file);

		BufferedReader br = new BufferedReader(fr);
       
		while((s = br.readLine())!=null)
		{
			count++;
			System.out.println(count + " " + s);

		}
		fr.close();
	}

}