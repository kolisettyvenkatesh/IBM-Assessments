import java.io.*;

class CopyDataThread5
{
	public static void main(String[] args) 
	{
		File sfile = new File("Source.txt");
		File tfile = new File("Target.txt");
		Copy copyData = new Copy(sfile,tfile);
		copyData.start();
	}
}

class Copy extends Thread
{
	File sfile,tfile;
	Copy(File sfile, File tfile)
	{
		this.sfile = sfile;
		this.tfile = tfile;
	}

	public void run()
	{
		try{
			
			String contents ="";
			int numberofChars = 0; 
			int value = 0;
			FileInputStream fileIn = new FileInputStream(sfile);
            while((value = fileIn.read())!=-1)
            {
            	contents = contents + (char)value;
                ++numberofChars;
                if(numberofChars == 10)
                {
                	System.out.println("10 characters copied");
                	numberofChars = 0;
                	Thread.sleep(5000);
                }
            }

            BufferedWriter bw = new BufferedWriter(new FileWriter(tfile));
    		bw.write(contents);
    		bw.flush();
			bw.close(); 
		}catch(Exception e)
		{
			System.out.println("Exception caught: "+e);
		}
	}
}