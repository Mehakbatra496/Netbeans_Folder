package stringpractice;

public class A2_StringOccurrence2 {
    public static void main(String[] args) {
        String s1 = "tttttaaaaa";
        char[] arr = s1.toCharArray();
        int len = arr.length;

        for (int i = 0; i < len; i++) {
            System.out.println("i is " + i);
            for (int j = i + 1; j < len; j++) {
                System.out.println("j is "+j);
                System.out.println("I am inside j.................................................");
                System.out.println("arr[i] is " + arr[i] + " , arr[j] is " + arr[j]);

                if (arr[i] == arr[j]) 
                {
                    System.out.println("arr[i] is " + arr[i] + " , arr[j] is " + arr[j]);

//                    arr[j] = '0';
//                    int z=j;
                    for (int k = j + 1; k < len; k++) {
                        arr[k - 1] = arr[k];
                    }
                    len--;

                    j--; // Decrement j to recheck the current position after shifting

                    System.out.println("********************* New Array is *****************************");
                    for (int m = 0; m < len; m++) {
                        System.out.println(arr[m]);
                    }
                }
            }
            System.out.println("");
        }

        // Create a new string without duplicate elements
        String result = new String(arr, 0, len);

        System.out.println("Original string: " + s1);
        System.out.println("String after removing duplicates: " + result);
    }
}
