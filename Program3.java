import java.util.*;
public class Program3 {

    public HashMap<String,Integer> count(String s)
    {
       HashMap<String,Integer> map=new HashMap<>();

        String arr[]=s.split(" ");

        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                int a=map.get(arr[i]);
                a++;
                map.put(arr[i],a);
            }
            else{
                
                map.put(arr[i],1);
            }
        }
        return map;
       
    }

    public static void main(String[]args)
    {
        Scanner s1=new Scanner(System.in);

        Program3 p=new Program3();

    
      String input=s1.nextLine();

      HashMap<String,Integer> ans=p.count(input);

      System.out.println(ans);

      

      


        

    }
    
}
