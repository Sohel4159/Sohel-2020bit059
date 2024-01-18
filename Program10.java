import java.util.*;
public class Program10 {

    public static int fact(int n)
    {
         if(n==0 ||    n ==1 ) return 1;
         
         return n * fact(n - 1) ;
    }

    public static void main(String[]args)
    {
        Scanner s1=new Scanner(System.in);
    
        int input=s1.nextInt();

        

        System.out.println("Factorial of number : "+fact(input)) ;

    }
    
}
