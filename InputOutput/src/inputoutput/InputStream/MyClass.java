
package inputoutput.InputStream;

/**
 *
 * @author mehak
 */
public class MyClass {
    
    public static void main(String[] args) {
        System.out.println("mhk");
        byte[] by = new byte[66];
        MyClass my=new MyClass(by, 0);
    }
  
    MyClass(byte[] bytes, int length)
    {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            sb.append((char) bytes[i]);
        } 
        System.out.print(sb);
//        return sb; 
    }
    
    
//         private static StringBuilder bytesToString(byte[] bytes, int length) {
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 0; i < length; i++) {
//            sb.append((char) bytes[i]);
//        }
//
//        return sb;
//    }

   
}
    

