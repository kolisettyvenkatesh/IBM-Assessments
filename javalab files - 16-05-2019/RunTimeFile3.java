import java.io.*;
import java.util.Scanner;

class RunTimeFile3  
{  
    public static void main(String[] args) 
    { 
       Scanner scn = new Scanner(System.in);
       System.out.println("enter the file name : ");
       String file = scn.nextLine(); 
       
        File f = new File(file); 
  
        //apply File class methods on File object 
        // System.out.println("File name :"+f.getName()); 
   
        System.out.println("Exists :"+f.exists()); 
   
        if(f.exists()) 
        { 
            System.out.println("Is writeable: "+f.canWrite()); 
            System.out.println("Is readable : "+f.canRead()); 
            System.out.println("Is a Type : "+f.isFile()); 
            System.out.println("File Size in bytes : "+f.length()); 
        } 
    } 
} 