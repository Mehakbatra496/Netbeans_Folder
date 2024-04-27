package CharacterStream.Reader;

import java.io.*;

public class A3_BufferedReader {
    public static void main(String[] args) {
        String fpath = "/home/mehak/Documents/Job/New-Job-Preparation/JAVA-Practice/IOFiles/write1";

        int data, k = 0;
        char[] ch = new char[9]; // read 9 bytes a time

        try {
            FileReader fr = new FileReader(fpath);
            BufferedReader br = new BufferedReader(fr);
            LineNumberReader lr = new LineNumberReader(br);

            while ((data = lr.read(ch)) != -1) {   //read 9 bytes a time
                
                
                k = k + 1;
                int l = lr.getLineNumber();
                System.out.print(l + "\t"); // Print the line number followed by a tab
                String st=new String(ch);
                System.out.println(new String(st)); // Print the read characters
//               System.out.println((char)data); // Print the read characters


            }
            System.out.println("Loop" + k);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
