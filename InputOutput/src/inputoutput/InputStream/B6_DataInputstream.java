package inputoutput.InputStream;
import java.io.*;

public class B6_DataInputstream {

    public static void main(String[] args) {
        String filePath = "/home/mehak/Documents/Job/New-Job-Preparation/JAVA-Practice/ReadIt6";

        // Writing data to the file
        writeDataToFile(filePath);
        
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath))) {
            // Reading data from the file
            int intValue = dis.readInt();
            
            double doubleValue = dis.readDouble();
            boolean booleanValue = dis.readBoolean();
            String stringValue = dis.readUTF();

            // Displaying the read values
            System.out.println("Int Value: " + intValue);
            System.out.println("Double Value: " + doubleValue);
            System.out.println("Boolean Value: " + booleanValue);
            System.out.println("String Value: " + stringValue);

        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private static void writeDataToFile(String filePath) 
    {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))) {
            // Writing data to the file
            dos.writeInt(42);
            dos.writeDouble(3.14);
            dos.writeBoolean(true);
            dos.writeUTF("Hello, DataInputStream!");
            System.out.println("Data has been written to the file.");
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}