package exceptionhandling.runtimeexception;

public class D2_NumberFormatException {

    public static void main(String args[]) {
        String st = "m";

        try {
            int k = Integer.parseInt(st);
            System.out.println(k);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        }
    }
}
