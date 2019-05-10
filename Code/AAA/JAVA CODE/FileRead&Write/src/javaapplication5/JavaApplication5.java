package javaapplication5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class JavaApplication5 {

    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner input = new Scanner (System.in);
        FileReader fr = new FileReader("D:\\AAA.txt");
        int ch=fr.read();
            StringBuffer buffer=new StringBuffer();
            while(ch!=-1){
                buffer.append((char)ch);
                ch=fr.read();
            }
            
         System.out.println(buffer.toString());
   
        String x1 = input.next();
        String x2 = input.next();
     System.out.println(buffer.toString().replaceAll(x1,x2));
        
        FileWriter fw = new FileWriter("D:\\AAA.txt");
        BufferedReader bufr = new BufferedReader(fr);      
        BufferedWriter bufw = new BufferedWriter(fw);
        bufw.write(buffer.toString().replaceAll(x1, x2));
        bufr.close();
        bufw.close();

        fr.close();
  }   
    }
