package arraypractice;

public class DS3_CharElements 
{
    public static void main(String[] args) 
    {
        char[] ch= new char[]{'M','e','h','a','k'};
        String st=" ";
        for(int i=0; i<ch.length; i++)
        {
//            System.out.println(ch[i]);
            st= st+ch[i];
                               
        }
        System.out.println(st);
    }
}