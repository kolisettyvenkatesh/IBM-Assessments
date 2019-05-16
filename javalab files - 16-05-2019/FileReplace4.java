import java.util.*;
import java.io.*;


public class FileReplace4 {
    List<String> lines = new ArrayList<String>();
    String line = null;

    public void  replace() 
    {
        try {
             Scanner scn = new Scanner(System.in);
                System.out.println("enter the word to be deleted : ");
                String de = scn.nextLine();
                System.out.println("enter the word to be replace : ");
                String re = scn.nextLine();
                
            File f1 = new File("anotherFile.txt");
            FileReader fr = new FileReader(f1);
            BufferedReader br = new BufferedReader(fr);
            while ((line = br.readLine()) != null)
             {
                if (line.contains(de))
                line = line.replace(de, re);
                lines.add(line);
            }
            fr.close();
            br.close();

            FileWriter fw = new FileWriter(f1);
            BufferedWriter bw = new BufferedWriter(fw);
            for(String s : lines)
                 bw.write(s);
            bw.flush();
            bw.close();
        } catch (Exception ex){
               ex.printStackTrace();
             }
    }

    public static void main(String args[]) {
        FileReplace4 fr = new FileReplace4();
        fr.replace();
    }
}