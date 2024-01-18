import java.util.*;
public class Program8 {

    public static boolean isPalindrome(String s)
    {
       String ans=s.toLowerCase();
        char arr[]=ans.toCharArray();
        int n=arr.length;
        for(int i=0;i<arr.length/2;i++)
        {
            
           if(arr[i]!=arr[n-1-i]) return false;
        }
        
        return true;
    }

    public static void main(String[]args)
    {
        Scanner s1=new Scanner(System.in);
    
        String input=s1.nextLine();

        

        System.out.println("String is Palindrome:S "+isPalindrome(input)) ;

    }
    
}
