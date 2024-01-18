import java.util.*;
public class Program1 {

    public static String reverse(char[] arr)
    {
        int  n=arr.length;
        for(int i=0;i<arr.length/2;i++)
        {
            char t=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=t;
        }
        return new String(arr);
    }

    public static void main(String[]args)
    {
        Scanner s1=new Scanner(System.in);
    
        String input=s1.nextLine();

        char arr[]=input.toCharArray();

        System.out.println("reverse String is "+reverse(arr) );

    }
    
}
