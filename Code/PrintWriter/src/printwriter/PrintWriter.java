package PrintWriter;
import java.util.Scanner;
import java.io.*;

public class PrintWriter {

    public static void main(String[] args) throws Exception{
System.out.println("Please enter the directory of the file");
Scanner input1=new Scanner(System.in);
String s1=input1.nextLine();

System.out.println("Please enter the directory of the file");
File file = new File(s1);
Scanner input2=new Scanner(file);
String s2=input1.next();
System.out.println("Please enter the directory of the file");
String s3=input1.next();



    Scanner newinput = new Scanner (System.in);
    String s5 = newinput.next();
    



//PrintWriter output = new java.io.PrintWriter(file);
while (input2.hasNext()){
    String s4=input2.nextLine();
   System.out.println(s4.replaceAll(s2, s3));
    s5 =  "\n\r" + s4.replaceAll(s2,s3);
}
System.out.println(Math.pow(3,2 ));
input2.close();
FileWriter outp = new FileWriter(file);
outp.write(s5);
outp.close();
//file.close();
////if(outp != null){  
////output.close();
//outp.close();
//output.print(s3);
//    output.close();
//System.out.println("Please input which word you want to replace?");System.out.println("Which new word you want?");
//String s2=input2.nextLine();
//String s3=input2.nextLine();
//if (file.isFile()){
//System.out.println("Which word you want to replace?");
//Scanner input2=new Scanner(System.in);
//System.out.println("Which new word you want?");
//Scanner input3=new Scanner(System.in);
//};
//else{
//}
}

    
    
}
