import java.util.*;
public class Program9 {

    public String longest(String arr[])
    {
        ArrayList<Character> ans = new ArrayList<>();
        int n = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            n = Math.min(n, arr[i].length());

        }
        for (int j = 0; j < n; j++) {
            char a = arr[0].charAt(j);
            for (int i = 1; i < arr.length; i++) {
                if (arr[i].charAt(i) == a) {
                    continue;
       
                       break;    
              }
             }
              
                char xy[]=new char[ans.size()];
               
              for(int i=0;i<ans.size();i++)
             {
                xy[i]=ans.get(i);
              }

              return new String(xy);
   
    

    }

    public static void main(String[]args)
    {
        Scanner s1=new Scanner(System.in);
    
        int n=s1.nextInt();

        String arr[]=new String[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=s1.next();
        }

        Program9 p=new Program9();

        

        System.out.println("Longest common prefix "+p.longest(arr) );

    }
    
}
